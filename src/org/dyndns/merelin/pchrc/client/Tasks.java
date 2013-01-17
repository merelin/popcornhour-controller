package org.dyndns.merelin.pchrc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Tasks extends Composite {
    interface Binder extends UiBinder<Widget, Tasks> {}
    private static final Binder binder = GWT.create(Binder.class);

    public Tasks() {
        initWidget(binder.createAndBindUi(this));
    }
}
