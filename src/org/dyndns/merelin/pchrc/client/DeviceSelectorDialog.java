package org.dyndns.merelin.pchrc.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Event.NativePreviewEvent;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;

public class DeviceSelectorDialog extends DialogBox {
    interface Binder extends UiBinder<Widget, DeviceSelectorDialog> {}
    private static final Binder binder = GWT.create(Binder.class);

    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    @UiField CellList<String> cells;
    @UiField Button closeButton;

    class Callback implements AsyncCallback<String[]> {
        private final List<String> devices = new ArrayList<String>();
        private String message;

        public void onFailure(Throwable caught) {
            message = SERVER_ERROR;
        }

        public void onSuccess(String[] result) {
            message = null;
            if (result != null) {
                for (String device : result) {
                    devices.add(device);
                }
            }
        }
    }

    private final Callback callback = new Callback();

    public DeviceSelectorDialog(DiscoveryServiceAsync discoveryService) {
        discoveryService.discover(callback);

        setText("Select the device");
        setWidget(binder.createAndBindUi(this));

        setAnimationEnabled(true);
        setGlassEnabled(true);
        setModal(true);
    }

    public List<String> getDevices() {
        return callback.devices;
    }

    @UiFactory CellList<String> makeCellList() {
        CellList<String> list;

        if (callback.message != null) {
            TextCell cell = new TextCell();
            cell.setValue(null, null, callback.message);
            list = new CellList<String>(cell);
        } else {
            list = new CellList<String>(new TextCell());
            list.setRowCount(callback.devices.size(), true);
            list.setRowData(0, callback.devices);
        }

        return list;
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
