package com.java.agenda.view.buttons;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.listeners.CancelButtonActionListener;

import javax.swing.*;

public class CancelButton extends JButton {

    CarteDeTelefonController carteDeTelefonController;

    public CancelButton(CarteDeTelefonController controller) {
        super("Cancel");
        carteDeTelefonController = controller;
        addActionListener(new CancelButtonActionListener(carteDeTelefonController));
    }

}
