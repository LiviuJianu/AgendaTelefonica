package com.java.agenda.view.listeners;

import com.java.agenda.controller.CarteDeTelefonController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelButtonActionListener implements ActionListener {

    private CarteDeTelefonController carteDeTelefonController;

    public CancelButtonActionListener(CarteDeTelefonController controller) {
        carteDeTelefonController = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        carteDeTelefonController.cancelInput();
    }
}
