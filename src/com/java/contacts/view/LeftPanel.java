package com.java.contacts.view;

import com.java.contacts.controller.ContactObserver;
import com.java.contacts.model.Contact;
import com.java.contacts.model.ContactsModel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.regex.PatternSyntaxException;

public class LeftPanel extends JPanel implements ContactObserver {

    private JTextField searchField;
    private JTable contactsTable;
    private ContactsModel contactsModel;

    public LeftPanel(ContactsModel contactsModel) {
        this.contactsModel = contactsModel;
        this.contactsModel.registerObserver(this);

        searchField = new JTextField("Search");
        contactsTable = new JTable();

        init();
        initTabelModel();
        initSearchFieldFiltering();
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

    private void initTabelModel() {
        contactsTable.setAutoCreateRowSorter(true);
        contactsTable.setModel(contactsModel.getContactListTableModel());
    }

    private void initSearchFieldFiltering() {
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(contactsModel.getContactListTableModel());
        contactsTable.setRowSorter(sorter);

        searchField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                searchFieldInputChanged(sorter);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchFieldInputChanged(sorter);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }

        });
    }

    private void searchFieldInputChanged(TableRowSorter<TableModel> sorter) {
        String text = searchField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } catch (PatternSyntaxException pse) {
                JOptionPane.showMessageDialog(null, "Bad regex pattern",
                        "Bad regex pattern", JOptionPane.ERROR_MESSAGE);
            }
        }
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
