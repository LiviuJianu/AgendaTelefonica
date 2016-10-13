package com.java.contacts.view.listeners;

import com.java.contacts.controller.ContactsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonActionListener implements ActionListener {

    private ContactsController contactsController;

    public AddButtonActionListener(ContactsController contactsController) {
        this.contactsController = contactsController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        contactsController.addContact();


    }
}
