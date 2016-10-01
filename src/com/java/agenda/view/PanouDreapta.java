package com.java.agenda.view;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class PanouDreapta extends JPanel {

    private PanouDetalii panouDetalii;
    private PanouButoane panouButoane;

    public PanouDreapta(CarteDeTelefonController carteDeTelefonController, CarteDeTelefonModel carteDeTelefonModel) {
        panouDetalii = new PanouDetalii(carteDeTelefonModel);
        panouButoane = new PanouButoane(carteDeTelefonController);

        init();
    }

    private void init() {
        setSize(new Dimension(400,600));
        setLayout(new GridLayout(2, 1));
        add(panouDetalii);
        add(panouButoane);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);
    }

    public PanouDetalii getPanouDetalii() {
        return panouDetalii;
    }

    public void setPanouDetalii(PanouDetalii panouDetalii) {
        this.panouDetalii = panouDetalii;
    }

    public PanouButoane getPanouButoane() {
        return panouButoane;
    }

    public void setPanouButoane(PanouButoane panouButoane) {
        this.panouButoane = panouButoane;
    }
}
