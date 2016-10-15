package com.java.contacts.controller;

import com.java.contacts.model.ContactsModel;
import com.java.contacts.view.ContactsView;

public class ContactsController {

    private ContactsView contactsView;
    private ContactsModel contactsModel;



    public ContactsController(ContactsModel model) {
        contactsModel = model;
        contactsView = new ContactsView(this, contactsModel);
    }

    public void init() {
        contactsView.init();
    }


    public void deleteContact() {
        contactsView.deleteContactFromView();
        contactsView.deleteContactFromTable();

    }

    public void addContact() {
        contactsView.addContactFromView();
    }

    public void cancelInput() {
        System.out.println("Cancelled");
    }

    public void update() {
        System.out.println("Updated");

    }
}
