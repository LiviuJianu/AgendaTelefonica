package com.java.agenda.view;

import javax.swing.*;
import java.awt.*;

public class PanouPrincipal extends JPanel {

    private PanouStanga panouStanga;
    private PanouDreapta panouDreapta;

    public PanouPrincipal() {
        panouStanga = new PanouStanga();
        panouDreapta = new PanouDreapta();

        init();
    }

    private void init() {
        setLayout(new GridLayout(1,2));
        add(panouStanga);
        add(panouDreapta);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
