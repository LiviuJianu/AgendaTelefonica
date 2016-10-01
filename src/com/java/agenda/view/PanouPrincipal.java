package com.java.agenda.view;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class PanouPrincipal extends JPanel {

    private PanouStanga panouStanga;
    private PanouDreapta panouDreapta;

    public PanouPrincipal(CarteDeTelefonController carteDeTelefonController, CarteDeTelefonModel carteDeTelefonModel) {
        panouStanga = new PanouStanga(carteDeTelefonModel);
        panouDreapta = new PanouDreapta(carteDeTelefonController, carteDeTelefonModel);

        init();
    }

    private void init() {
        setLayout(new GridLayout(1,2));
        add(panouStanga);
        add(panouDreapta);
    }

    public PanouStanga getPanouStanga() {
        return panouStanga;
    }

    public void setPanouStanga(PanouStanga panouStanga) {
        this.panouStanga = panouStanga;
    }

    public PanouDreapta getPanouDreapta() {
        return panouDreapta;
    }

    public void setPanouDreapta(PanouDreapta panouDreapta) {
        this.panouDreapta = panouDreapta;
    }
}
