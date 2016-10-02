package com.java.agenda.view.buttons;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.listeners.ActivateButtonActionListener;

import javax.swing.*;

public class ActivateButton extends JButton {

    CarteDeTelefonController carteDeTelefonController;

    public ActivateButton(CarteDeTelefonController controller) {
        super("Activate");
        carteDeTelefonController = controller;
        addActionListener(new ActivateButtonActionListener(carteDeTelefonController));
    }

}
