package com.java.agenda.view;

import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class PanouDreapta extends JPanel {

    private PanouDetalii panouDetalii;
    private PanouButoane panouButoane;

    public PanouDreapta(CarteDeTelefonModel carteDeTelefonModel) {
        panouDetalii = new PanouDetalii(carteDeTelefonModel);
        panouButoane = new PanouButoane();

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

}
