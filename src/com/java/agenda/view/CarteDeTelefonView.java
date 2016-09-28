package com.java.agenda.view;

import com.java.agenda.controller.AbonatObserver;
import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;

public class CarteDeTelefonView implements AbonatObserver {

    CarteDeTelefonController controller;
    CarteDeTelefonModel model;


    private JFrame viewFrame;
    private JPanel mainPanel;
    private PanouButoane panouButoane;


    public CarteDeTelefonView(CarteDeTelefonController carteDeTelefonController, CarteDeTelefonModel carteDeTelefonModel) {
        controller =carteDeTelefonController;
        model = carteDeTelefonModel;
        model.registerObserver((CarteDeTelefonView) this);
    }

    public void init() {
        viewFrame = new JFrame("Agenda telefonica");
        mainPanel = new JPanel(new GridLayout(2, 2));
        panouButoane = new PanouButoane();

        mainPanel.add(panouButoane);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(800,600);
        viewFrame.getContentPane().add(mainPanel);
        viewFrame.pack();
        viewFrame.setVisible(true);

    }

    @Override
    public void uppdateAbonat() {
        if(model != null) {
            System.out.println("Actualizare abonat");
        }
    }
}
