package com.java.agenda.view.listeners;

import com.java.agenda.controller.CarteDeTelefonController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateButtonActionListener implements ActionListener {
    private CarteDeTelefonController carteDeTelefonController;

    public UpdateButtonActionListener(CarteDeTelefonController controller) {
        carteDeTelefonController = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        carteDeTelefonController.update();
    }
}
