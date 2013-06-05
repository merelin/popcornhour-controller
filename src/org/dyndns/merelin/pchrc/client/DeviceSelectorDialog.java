package org.dyndns.merelin.pchrc.client;

import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.shared.Context;
import org.dyndns.merelin.pchrc.shared.Keys;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Event.NativePreviewEvent;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class DeviceSelectorDialog extends DialogBox {
    interface Binder extends UiBinder<Widget, DeviceSelectorDialog> {}
    private static final Binder binder = GWT.create(Binder.class);

    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    @UiField VerticalPanel panel;
    @UiField Button closeButton;

    class Callback implements AsyncCallback<String[]> {
        private final List<String> hosts = new ArrayList<String>();

        public void onFailure(Throwable caught) {
            hosts.clear();
            panel.clear();
            Button a = new Button(SERVER_ERROR);
            a.addClickHandler(new ClickHandler() {
                public void onClick(ClickEvent event) {
                    DeviceSelectorDialog.this.hide();
                }
            });
            panel.add(a);
        }

        public void onSuccess(String[] result) {
            if (result != null) {
                for (String host : result) {
                    hosts.add(host);
                    Button a = new Button(host);
                    final String device = host;
                    a.addClickHandler(new ClickHandler() {
                        public void onClick(ClickEvent event) {
                            devices.add(device);
                            DeviceSelectorDialog.this.hide();
                        }
                    });
                    panel.add(a);
                    DeviceSelectorDialog.this.center();
                }
            }
        }
    }

    private final Callback callback = new Callback();
    private List<String> devices;

    public DeviceSelectorDialog() {
        devices = Context.<List<String>>get(Keys.SELECTED_DEVICES);
        if (devices == null) {
            devices = new ArrayList<String>();
            Context.<List<String>>put(Keys.SELECTED_DEVICES, devices);
        }

        DiscoveryServiceAsync discoveryService
            = Context.<DiscoveryServiceAsync>get(Keys.DISCOVERY_SERVICE);
        discoveryService.discover(callback);

        setText("Select a device");
        setWidget(binder.createAndBindUi(this));
        setAnimationEnabled(true);
        setGlassEnabled(true);
        setModal(true);
    }

    @UiFactory CellList<String> makeCellList() {
        CellList<String> list = new CellList<String>(new TextCell());
        list.setRowCount(0, true);

        return new CellList<String>(new TextCell());
    }

    @Override
    protected void onPreviewNativeEvent(NativePreviewEvent preview) {
        super.onPreviewNativeEvent(preview);

        NativeEvent evt = preview.getNativeEvent();
        if (evt.getType().equals("keydown")) {
            // Use the popup's key preview hooks to close the dialog when either
            // enter or escape is pressed.
            switch (evt.getKeyCode()) {
            case KeyCodes.KEY_ENTER:
            case KeyCodes.KEY_ESCAPE:
                hide();
                break;
            }
        }
    }

    @UiHandler("closeButton")
    void onSignOutClicked(ClickEvent event) {
        hide();
    }
}
