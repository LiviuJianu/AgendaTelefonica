package com.java.agenda.view;

import com.java.agenda.controller.AbonatObserver;
import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class CarteDeTelefonView {

    private JFrame viewFrame;
    private BaraMeniu meniu;
    private PanouPrincipal panouPrincipal;

    private CarteDeTelefonController carteDeTelefonController;
    private CarteDeTelefonModel carteDeTelefonModel;

    public CarteDeTelefonView(CarteDeTelefonController carteDeTelefonController, CarteDeTelefonModel carteDeTelefonModel) {
        this.carteDeTelefonController = carteDeTelefonController;
        this.carteDeTelefonModel = carteDeTelefonModel;
    }

    public void init() {
        viewFrame = new JFrame("Agenda telefonica");
        panouPrincipal = new PanouPrincipal(carteDeTelefonController, carteDeTelefonModel);
        meniu = new BaraMeniu();

        viewFrame.setLayout(new GridLayout(1,1));
        viewFrame.getRootPane().setJMenuBar(meniu);

        viewFrame.setSize(800, 600);

        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.getContentPane().add(panouPrincipal);
        viewFrame.setVisible(true);

    }

    public void deleteAbonat() {
        panouPrincipal.getPanouDreapta().getPanouDetalii().clearInputs();
    }
}
