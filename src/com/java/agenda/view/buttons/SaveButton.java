package com.java.agenda.view.buttons;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.listeners.SaveButtonActionListener;

import javax.swing.*;

public class SaveButton extends JButton {

    private CarteDeTelefonController carteDeTelefonController;

    public SaveButton(CarteDeTelefonController controller) {
        super("Save");
        carteDeTelefonController = controller;
        addActionListener(new SaveButtonActionListener(carteDeTelefonController));
    }


}
