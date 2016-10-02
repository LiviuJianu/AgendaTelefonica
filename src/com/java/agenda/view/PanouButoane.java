package com.java.agenda.view;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.buttons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanouButoane extends JPanel {

    private final ActivateButton butonActiveazaInput;
    private final SaveButton butonSalveazaAbonat;
    private final DeleteButton butonStergeAbonat;
    private final UpdateButton butonActualizeazaAbonat;
    private final CancelButton butonAnuleazaInregistrare;
    CarteDeTelefonController carteDeTelefonController;

    public PanouButoane(CarteDeTelefonController carteDeTelefonController) {
        this.carteDeTelefonController = carteDeTelefonController;

        butonActiveazaInput = new ActivateButton(carteDeTelefonController);
        butonStergeAbonat = new DeleteButton(carteDeTelefonController);
        butonSalveazaAbonat = new SaveButton(carteDeTelefonController);
        butonActualizeazaAbonat = new UpdateButton(carteDeTelefonController);
        butonAnuleazaInregistrare = new CancelButton(carteDeTelefonController);
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
        butonActiveazaInput.addActionListener(e -> carteDeTelefonController.activate());
    }

    private void addSaveButtonListener() {
        butonSalveazaAbonat.addActionListener(e -> carteDeTelefonController.save());
    }

    private void addCancelButtonListener() {
        butonAnuleazaInregistrare.addActionListener(e -> carteDeTelefonController.cancelInput());
    }

    private void addUpdateButtonListener() {
        butonActualizeazaAbonat.addActionListener(e -> carteDeTelefonController.update());
    }


}
