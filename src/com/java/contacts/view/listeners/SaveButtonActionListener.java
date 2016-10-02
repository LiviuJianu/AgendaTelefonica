package com.java.contacts.view.listeners;

import com.java.contacts.controller.ContactsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonActionListener implements ActionListener {

    private ContactsController contactsController;

    public SaveButtonActionListener(ContactsController controller) {
        contactsController = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        contactsController.save();
    }
}
