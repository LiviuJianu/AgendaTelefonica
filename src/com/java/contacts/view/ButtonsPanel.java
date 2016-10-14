package com.java.contacts.view;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.view.buttons.*;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private final AddButton addButton;
    private final SaveButton saveButton;
    private final DeleteButton deleteButton;
    private final UpdateButton updateButton;
    private final CancelButton cancelButton;
    private ContactsController contactsController;

    public ButtonsPanel(ContactsController contactsController) {
        this.contactsController = contactsController;

        addButton = new AddButton(contactsController);
        deleteButton = new DeleteButton(contactsController);
        saveButton = new SaveButton(contactsController);
        updateButton = new UpdateButton(contactsController);
        cancelButton = new CancelButton(contactsController);
        init();
    }

    private void init() {
        setLayout(new GridLayout(3, 3));
        add(addButton);
        add(saveButton);

        add(deleteButton);
        add(cancelButton);
        add(updateButton);

        addAddButtonListener();
        addSaveButtonListener();
        addCancelButtonListener();
        addUpdateButtonListener();
        addDeleteButtonListener();
    }

    private void addAddButtonListener() {
        addButton.addActionListener(e -> contactsController.addContact());
    }

    private void addSaveButtonListener() {
        saveButton.addActionListener(e -> contactsController.save());
    }

    private void addCancelButtonListener() {
        cancelButton.addActionListener(e -> contactsController.cancelInput());
    }

    private void addUpdateButtonListener() {
        updateButton.addActionListener(e -> contactsController.update());
    }

    private void addDeleteButtonListener() {
        deleteButton.addActionListener(e -> contactsController.deleteContact());
    }


}
