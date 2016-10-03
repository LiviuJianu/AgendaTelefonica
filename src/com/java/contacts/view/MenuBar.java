package com.java.contacts.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JMenuBar {

    private final ImageIcon loadIcon = new ImageIcon("resources/icon/open.png");
    private final ImageIcon saveIcon = new ImageIcon("resources/icon/save.png");
    private final ImageIcon exitIcon = new ImageIcon("resources/icon/exit.png");
    private final ImageIcon keyIcon = new ImageIcon("resources/icon/key.png");

    private final JMenuItem loadButton = new JMenuItem("Load DB", loadIcon);
    private final JMenuItem saveButton = new JMenuItem("Save DB", saveIcon);
    private final JMenuItem exitButton = new JMenuItem("Exit", exitIcon);
    private final JMenuItem registerButton = new JMenuItem("Register", keyIcon);
    private ImageIcon newIcon = new ImageIcon("resources/icon/new.png");
    private ImageIcon updateIcon = new ImageIcon("resources/icon/update.png");
    private ImageIcon searchIcon = new ImageIcon("resources/icon/search.png");
    private ImageIcon deleteIcon = new ImageIcon("resources/icon/trash.png");
    private ImageIcon helpIcon = new ImageIcon("resources/icon/help.png");

    JMenu file = new JMenu("File");

    public MenuBar() {
        init();
    }

    public void init() {
        file.setMnemonic(KeyEvent.VK_F);

        loadButton.setMnemonic(KeyEvent.VK_D);
        loadButton.setToolTipText("Load Database");
//        loadButton.addActionListener(new IncarcaDB());

        saveButton.setMnemonic(KeyEvent.VK_A);
        saveButton.setToolTipText("Save database");
//        saveButton.addActionListener(new SalveazaDB());

        /*
         * Cand se doreste iesirea din aplicatie, utilizatorul este intrebat
         * daca se doreste iesirea, caz in care aplicatia se inchide, sau daca
         * nu se doreste iesire, aplicatia functioneaza in continuare.
         */
        exitButton.setMnemonic(KeyEvent.VK_I);
        exitButton.setToolTipText("Exit the app");
        exitButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int exitDialogResult = JOptionPane.showConfirmDialog(null, "Confirm exiting the app?", "Exit application", dialogButton);
                if (exitDialogResult == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        JMenu contactsMenu = new JMenu("Contacts");
        contactsMenu.setMnemonic(KeyEvent.VK_B);

        JMenuItem newContact = new JMenuItem("Add", newIcon);
        newContact.setMnemonic(KeyEvent.VK_A);
        newContact.setToolTipText("Add new contact");
        newContact.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
//        abonatNou.addActionListener(new AbonatPopup());

        JMenuItem updateContact = new JMenuItem("Update", updateIcon);
        updateContact.setMnemonic(KeyEvent.VK_U);
        updateContact.setToolTipText("Update contact");
        updateContact.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
//        updateContact.addActionListener(new AbonatPopup());

        JMenuItem searchContact = new JMenuItem("Search", searchIcon);
        searchContact.setMnemonic(KeyEvent.VK_C);
        searchContact.setToolTipText("Search contact");
        searchContact.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
//        searchContact.addActionListener(new CautaAbonat());

        JMenuItem saveContact = new JMenuItem("Save", saveIcon);
        saveContact.setMnemonic(KeyEvent.VK_S);
        saveContact.setToolTipText("Save contact");
        saveContact.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
//        saveContact.addActionListener(new AdaugaAbonat());

        JMenuItem deleteContact = new JMenuItem("Delete", deleteIcon);
        deleteContact.setMnemonic(KeyEvent.VK_R);
        deleteContact.setToolTipText("Delete contact");
        deleteContact.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
//        deleteContactFromView.addActionListener(new StergeAbonat());

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);

        JMenuItem manual = new JMenuItem("Manual", helpIcon);
        manual.setMnemonic(KeyEvent.VK_M);
        manual.setToolTipText("Users guide");
        manual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        /*
         * Pentru inregistrarea aplicatiei, utilizatorul trebuie sa intriduca
         * un cod de inregistrare, care din motive de usurinta de testare
         * este urmatorul : 123abc
         */
        registerButton.setMnemonic(KeyEvent.VK_R);
        registerButton.setToolTipText("Enter registration code");
        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String serialNumber = JOptionPane.showInputDialog("Registration code");
                if (serialNumber != null) {
//                    if (isAppRegistered(serialNumber)) {
//                        activeazaAplicatie();
//                        JOptionPane.showMessageDialog(null, "Aplicatia a fost inregistrata!");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Cod de inregistrare incorect!");
//                    }
                }
            }
        });

        file.add(loadButton);
        file.add(saveButton);
        file.addSeparator();
        file.add(exitButton);

        contactsMenu.add(newContact);
        contactsMenu.add(updateContact);
        contactsMenu.add(saveContact);
        contactsMenu.add(deleteContact);
        contactsMenu.addSeparator();
        contactsMenu.add(searchContact);

        helpMenu.add(registerButton);
        helpMenu.addSeparator();
        helpMenu.add(manual);

        this.add(file);
        this.add(contactsMenu);
        this.add(helpMenu);

    }

}