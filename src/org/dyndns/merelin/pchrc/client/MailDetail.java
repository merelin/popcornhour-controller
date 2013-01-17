package org.dyndns.merelin.pchrc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

public class MailDetail extends ResizeComposite {
    interface Binder extends UiBinder<Widget, MailDetail> {}
    private static final Binder binder = GWT.create(Binder.class);

    @UiField Element subject;
    @UiField Element sender;
    @UiField Element recipient;
    @UiField HTML body;

    public MailDetail() {
        initWidget(binder.createAndBindUi(this));
    }

    public void setItem(MailItem item) {
        subject.setInnerText(item.subject);
        sender.setInnerText(item.sender);
        recipient.setInnerHTML("foo@example.com");

        // WARNING: For the purposes of this demo, we're using HTML directly, on
        // the assumption that the "server" would have appropriately scrubbed the
        // HTML. Failure to do so would open your application to XSS attacks.
        body.setHTML(item.body);
    }
}
