package com.java.contacts.view;

import com.java.contacts.controller.ContactObserver;
import com.java.contacts.model.Contact;
import com.java.contacts.model.ContactsModel;
import com.java.contacts.model.Phone;
import com.java.contacts.model.PhoneNumberType;

import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel implements ContactObserver {

    private ContactsModel contactsModel;

    private JLabel imageLabel;
    private ImageIcon imageLabelIcon;
    private JTextField firstNameText;
    private JTextField lastNameText;
    private JLabel cnpLabel;
    private JTextField cnpText;
    private JLabel phoneLabel;
    private JTextField phoneText;

    public DetailsPanel(ContactsModel contactsModel) {
        this.contactsModel = contactsModel;
        this.contactsModel.registerObserver(this);

        imageLabelIcon = new ImageIcon("resources/icon/noImage.png");
        imageLabel = new JLabel(imageLabelIcon);
        firstNameText = new JTextField("First Name");
        lastNameText = new JTextField("Last  Name");
        cnpLabel = new JLabel("CNP: ");
        cnpText = new JTextField(13);
        phoneLabel = new JLabel("Phone");
        phoneText = new JTextField(13);

        init();
    }

    private void init() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0,0,50,30);
        add(imageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(firstNameText, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(lastNameText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 0;
        add(cnpLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        add(cnpText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 0;
        add(phoneLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        add(phoneText, gbc);
    }

    @Override
    public void uppdateContact() {

    }

    public void clearInputs() {
        firstNameText.setText("");
        lastNameText.setText("");
        cnpText.setText("");
        phoneText.setText("");

    }

    public Contact getContactToInsert() {
        Phone phoneNumber = PhoneNumberType.getPhoneNumberType(phoneText.getText());
        Contact contactToInsert = new Contact("333", firstNameText.getText(), lastNameText.getText(), cnpText.getText(), phoneNumber);
        
        return contactToInsert;
    }
}
