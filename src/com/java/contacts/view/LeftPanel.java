package com.java.contacts.view;

import com.java.contacts.controller.ContactObserver;
import com.java.contacts.model.Contact;
import com.java.contacts.model.ContactsModel;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel implements ContactObserver {

    private JTextField searchField;
    private JTable contactsTable;
    private ContactsModel contactsModel;

    public LeftPanel(ContactsModel contactsModel) {
        this.contactsModel = contactsModel;
        this.contactsModel.registerObserver(this);

        searchField = new JTextField("Search");
        contactsTable = new JTable();

        initTabelModel();
        init();
    }

    private void initTabelModel() {
        contactsTable.setAutoCreateRowSorter(true);
        contactsTable.setModel(contactsModel.getContactsTableModel());
    }

    private void init() {
        setSize(new Dimension(400, 600));
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(searchField, gbc);

        gbc.ipadx = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JScrollPane(contactsTable), gbc);
    }

    public void addContactToModel(Contact contact) {
        contactsModel.addContact(contact);
    }

    @Override
    public void uppdateContact() {

    }

    public void deleteContactFromModel() {
        int selectedContactPosition = contactsTable.getSelectedRow();
        if(selectedContactPosition != -1) {
            contactsModel.removeAbonatEntryAt(selectedContactPosition);
        }

    }
}
