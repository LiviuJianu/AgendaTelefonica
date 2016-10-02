package com.java.agenda.view.buttons;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.view.listeners.DeleteButtonActionListener;

import javax.swing.*;

public class DeleteButton extends JButton {

    private CarteDeTelefonController carteDeTelefonController;

    public DeleteButton(CarteDeTelefonController controller) {
        super("Delete");
        carteDeTelefonController = controller;
        addActionListener(new DeleteButtonActionListener(carteDeTelefonController));
    }

}
