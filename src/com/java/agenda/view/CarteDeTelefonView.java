package com.java.agenda.view;

import com.java.agenda.controller.AbonatObserver;
import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class CarteDeTelefonView implements AbonatObserver {

    private CarteDeTelefonController carteDeTelefonController;
    private CarteDeTelefonModel carteDeTelefonModel;
    private JFrame viewFrame;
    private PanouPrincipal panouPrincipal;
    private BaraMeniu meniu;

    public CarteDeTelefonView(CarteDeTelefonController carteDeTelefonController, CarteDeTelefonModel carteDeTelefonModel) {
        this.carteDeTelefonController = carteDeTelefonController;
        this.carteDeTelefonModel = carteDeTelefonModel;
        this.carteDeTelefonModel.registerObserver(this);
    }

    public void init() {
        viewFrame = new JFrame("Agenda telefonica");
        panouPrincipal = new PanouPrincipal();
        meniu = new BaraMeniu();

        viewFrame.setLayout(new GridLayout(1,1));
        viewFrame.getRootPane().setJMenuBar(meniu);

        viewFrame.setSize(800, 600);

        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.getContentPane().add(panouPrincipal);
        viewFrame.setVisible(true);

    }

    @Override
    public void uppdateAbonat() {
        if (carteDeTelefonModel != null) {
            System.out.println("Actualizare abonat");
        }
    }
}
