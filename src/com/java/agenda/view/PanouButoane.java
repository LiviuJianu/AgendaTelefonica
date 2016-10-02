package com.java.agenda.view;

import com.java.agenda.controller.CarteDeTelefonController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanouButoane extends JPanel {

    CarteDeTelefonController carteDeTelefonController;

    private final JButton butonActiveazaInput = new JButton("Activare");
    private final JButton butonSalveazaAbonat = new JButton("Adauga");
    private final JButton butonStergeAbonat = new JButton("Sterge");
    private final JButton butonActualizeazaAbonat = new JButton("Modifica");
    private final JButton butonAnuleazaInregistrare = new JButton("Anulare");

    public PanouButoane(CarteDeTelefonController carteDeTelefonController) {
        this.carteDeTelefonController = carteDeTelefonController;
        init();
    }

    private void init() {
        setLayout(new GridLayout(3,3));
        add(butonActiveazaInput);
        add(butonSalveazaAbonat);

        addDeleteButtonListener();
        add(butonStergeAbonat);
        add(butonAnuleazaInregistrare);
        add(butonActualizeazaAbonat);
    }

    private void addActivateButtonListener() {
        butonActiveazaInput.addActionListener(e -> carteDeTelefonController.activate());
    }

    private void addSaveButtonListener() {
        butonSalveazaAbonat.addActionListener(e -> carteDeTelefonController.save());
    }

    private void addDeleteButtonListener() {
        butonStergeAbonat.addActionListener(e -> carteDeTelefonController.deleteAbonat());
    }

    private void addCancelButtonListener() {
        butonAnuleazaInregistrare.addActionListener(e-> carteDeTelefonController.cancelInput());
    }

    private void addUpdateButtonListener() {
        butonActualizeazaAbonat.addActionListener(e -> carteDeTelefonController.update());
    }




}
