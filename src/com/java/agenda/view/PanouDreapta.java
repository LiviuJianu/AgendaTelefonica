package com.java.agenda.view;

import javax.swing.*;
import java.awt.*;

public class PanouDreapta extends JPanel {

    private PanouDetalii panouDetalii;
    private PanouButoane panouButoane;

    public PanouDreapta() {
        panouDetalii = new PanouDetalii();
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