package org.dyndns.merelin.pchrc.client;

import org.dyndns.merelin.pchrc.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Popcornhour_controller implements EntryPoint {
    interface Binder extends UiBinder<DockLayoutPanel, Popcornhour_controller> {}

    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private final GreetingServiceAsync greetingService = GWT
            .create(GreetingService.class);

    interface GlobalResources extends ClientBundle {
        @NotStrict
        @Source("global.css")
        CssResource css();
    }

    private static final Binder binder = GWT.create(Binder.class);

    @UiField TopPanel topPanel;
    @UiField MailList mailList;
    @UiField MailDetail mailDetail;
    @UiField Shortcuts shortcuts;

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        // Inject global styles.
        GWT.<GlobalResources>create(GlobalResources.class).css().ensureInjected();

        DockLayoutPanel outer = binder.createAndBindUi(this);

        // Get rid of scrollbars, and clear out the window's built-in margin,
        // because we want to take advantage of the entire client area.
        Window.enableScrolling(false);
        Window.setMargin("0px");

        // Special-case stuff to make topPanel overhang a bit.
        Element topElem = outer.getWidgetContainerElement(topPanel);
        topElem.getStyle().setZIndex(2);
        topElem.getStyle().setOverflow(Overflow.VISIBLE);

        // Listen for item selection, displaying the currently-selected item in
        // the detail area.
        mailList.setListener(new MailList.Listener() {
            public void onItemSelected(MailItem item) {
                mailDetail.setItem(item);
            }
        });

        // Add the outer panel to the RootLayoutPanel, so that it will be
        // displayed.
        RootLayoutPanel root = RootLayoutPanel.get();
        root.add(outer);
    }
}
