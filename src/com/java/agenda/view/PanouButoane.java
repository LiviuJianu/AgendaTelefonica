package com.java.agenda.view;

import com.java.agenda.controller.CarteDeTelefonController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by liviu on 28/09/16.
 */
public class PanouButoane extends JPanel {

    private final JButton butonActiveazaInput = new JButton("Activare");
    private final JButton butonSalveazaAbonat = new JButton("Adauga");
    private final JButton butonStergeAbonat = new JButton("Sterge");
    private final JButton butonActualizeazaAbonat = new JButton("Modifica");
    private final JButton butonAnuleazaInregistrare = new JButton("Anulare");

    public PanouButoane() {
        init();
    }

    private void init() {
        setLayout(new GridLayout(3,3));
        add(butonActiveazaInput);

        add(butonSalveazaAbonat);
        add(butonStergeAbonat);

        add(butonAnuleazaInregistrare);

        add(butonActualizeazaAbonat);



    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.YELLOW);
    }

}
