package com.java.contacts.view;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.view.buttons.*;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private final AddButton butonActiveazaInput;
    private final SaveButton butonSalveazaAbonat;
    private final DeleteButton butonStergeAbonat;
    private final UpdateButton butonActualizeazaAbonat;
    private final CancelButton butonAnuleazaInregistrare;
    ContactsController contactsController;

    public ButtonsPanel(ContactsController contactsController) {
        this.contactsController = contactsController;

        butonActiveazaInput = new AddButton(contactsController);
        butonStergeAbonat = new DeleteButton(contactsController);
        butonSalveazaAbonat = new SaveButton(contactsController);
        butonActualizeazaAbonat = new UpdateButton(contactsController);
        butonAnuleazaInregistrare = new CancelButton(contactsController);
        init();
    }

    private void init() {
        setLayout(new GridLayout(3, 3));
        add(butonActiveazaInput);
        add(butonSalveazaAbonat);

        add(butonStergeAbonat);
        add(butonAnuleazaInregistrare);
        add(butonActualizeazaAbonat);
    }

    private void addActivateButtonListener() {
        butonActiveazaInput.addActionListener(e -> contactsController.addContact());
    }

    private void addSaveButtonListener() {
        butonSalveazaAbonat.addActionListener(e -> contactsController.save());
    }

    private void addCancelButtonListener() {
        butonAnuleazaInregistrare.addActionListener(e -> contactsController.cancelInput());
    }

    private void addUpdateButtonListener() {
        butonActualizeazaAbonat.addActionListener(e -> contactsController.update());
    }


}
