package com.java.contacts.view;

import com.java.contacts.controller.ContactObserver;
import com.java.contacts.model.Contact;
import com.java.contacts.model.ContactsModel;
import com.java.contacts.model.Phone;
import com.java.contacts.model.PhoneNumberType;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String cnp = cnpText.getText();
        String phone = phoneText.getText();

        validateInput(firstName, lastName, cnp, phone);

        Phone phoneNumber = PhoneNumberType.getPhoneNumberType(phone);

        Contact contactToInsert = new Contact(firstNameText.getText(), lastNameText.getText(), cnpText.getText(), phoneNumber);
        return contactToInsert;
    }

    private void validateInput(String firstName, String lastName, String cnp, String phoneNumber) {
        validateName(firstName, lastName);
        validateCNP(cnp);
        validatePhoneNumber(phoneNumber);
    }

    private void validateName(String firstName, String lastName) {
        if(firstName.length() == 0 && lastName.length() == 0) {
            JOptionPane.showMessageDialog(null, "Completati numele si prenumele!", "Nume si prenume lipsa!", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException("Nume si prenume lipsa!");
        }
    }

    private void validateCNP(String cnp) {
        if (cnp.length() != 13 && (!cnp.startsWith("1") || !cnp.startsWith("2"))) {
            JOptionPane.showMessageDialog(null, "Introduceti CNP-ul corect!", "CNP Invalid!", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException("CNP invalid!");
        }
        validateCNPDate(cnp);
    }

    private void validateCNPDate(String cnp) {
        String dataDinCNP = cnp.substring(1, 7);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
            sdf.setLenient(false);
            sdf.parse(dataDinCNP);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de nastere invalida!", "Atentie!", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(ex);
        }
    }

    private void validatePhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Numar telefon invalid!", "Atentie!", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException("Numar telefon invalid!");
        }
    }
}
