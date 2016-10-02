package com.java.contacts.view;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.model.ContactsModel;

import javax.swing.*;
import java.awt.*;

public class ContactsView {

    private JFrame viewFrame;
    private MenuBar menuBar;
    private MainPanel mainPanel;

    private ContactsController contactsController;
    private ContactsModel contactsModel;

    public ContactsView(ContactsController contactsController, ContactsModel contactsModel) {
        this.contactsController = contactsController;
        this.contactsModel = contactsModel;
    }

    public void init() {
        viewFrame = new JFrame("Contacts");
        mainPanel = new MainPanel(contactsController, contactsModel);
        menuBar = new MenuBar();

        viewFrame.setLayout(new GridLayout(1,1));
        viewFrame.getRootPane().setJMenuBar(menuBar);

        viewFrame.setSize(800, 600);

        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.getContentPane().add(mainPanel);
        viewFrame.setVisible(true);

    }

    public void deleteContact() {
        mainPanel.getRightPanel().getDetailsPanel().clearInputs();
    }
}
