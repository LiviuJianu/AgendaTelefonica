package com.java.contacts.view.buttons;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.view.listeners.SaveButtonActionListener;

import javax.swing.*;

public class SaveButton extends JButton {

    private ContactsController contactsController;

    public SaveButton(ContactsController controller) {
        super("Save");
        contactsController = controller;
        addActionListener(new SaveButtonActionListener(contactsController));
    }


}
