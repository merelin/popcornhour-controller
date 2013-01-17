package org.dyndns.merelin.pchrc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

public class Contacts extends Composite {
    interface Binder extends UiBinder<Widget, Contacts> {}
    private static final Binder binder = GWT.create(Binder.class);

    /**
     * Simple data structure representing a contact.
     */
    private static class Contact {
        public String email;
        public String name;

        public Contact(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

    /**
     * A simple popup that displays a contact's information.
     */
    static class ContactPopup extends PopupPanel {
        @UiTemplate("ContactPopup.ui.xml")
        interface Binder extends UiBinder<Widget, ContactPopup> { }
        private static final Binder binder = GWT.create(Binder.class);

        @UiField Element nameDiv;
        @UiField Element emailDiv;

        public ContactPopup(Contact contact) {
            // The popup's constructor's argument is a boolean specifying that it
            // auto-close itself when the user clicks outside of it.
            super(true);
            add(binder.createAndBindUi(this));

            nameDiv.setInnerText(contact.name);
            emailDiv.setInnerText(contact.email);
        }
    }

    interface Style extends CssResource {
        String item();
    }


    private Contact[] contacts = new Contact[] {
            new Contact("Benoit Mandelbrot", "benoit@example.com"),
            new Contact("Albert Einstein", "albert@example.com"),
            new Contact("Rene Descartes", "rene@example.com"),
            new Contact("Bob Saget", "bob@example.com"),
            new Contact("Ludwig von Beethoven", "ludwig@example.com"),
            new Contact("Richard Feynman", "richard@example.com"),
            new Contact("Alan Turing", "alan@example.com"),
            new Contact("John von Neumann", "john@example.com")
    };

    @UiField ComplexPanel panel;
    @UiField Style style;

    public Contacts() {
        initWidget(binder.createAndBindUi(this));

        // Add all the contacts to the list.
        for (int i = 0; i < contacts.length; ++i) {
            addContact(contacts[i]);
        }
    }

    private void addContact(final Contact contact) {
        final Anchor link = new Anchor(contact.name);
        link.setStyleName(style.item());
        panel.add(link);

        // Add a click handler that displays a ContactPopup when it is clicked.
        link.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                ContactPopup popup = new ContactPopup(contact);
                int left = link.getAbsoluteLeft() + 14;
                int top = link.getAbsoluteTop() + 14;
                popup.setPopupPosition(left, top);
                popup.show();
            }
        });
    }
}
