package com.java.agenda.view.buttons;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.listeners.UpdateButtonActionListener;

import javax.swing.*;

public class UpdateButton extends JButton {


    private CarteDeTelefonController carteDeTelefonController;

    public UpdateButton(CarteDeTelefonController controller) {
        super("Update");
        carteDeTelefonController = controller;
        addActionListener(new UpdateButtonActionListener(carteDeTelefonController));
    }

}
