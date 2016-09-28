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
    private JPanel panouButoanePrincipale = new JPanel(new GridBagLayout());

    public PanouButoane() {
        init();
    }

    private void init() {

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(1, 1, 1, 1);


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panouButoanePrincipale.add(butonActiveazaInput, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panouButoanePrincipale.add(butonSalveazaAbonat, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panouButoanePrincipale.add(butonStergeAbonat, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panouButoanePrincipale.add(butonAnuleazaInregistrare, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panouButoanePrincipale.add(butonActualizeazaAbonat, gbc);

    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.YELLOW);
    }

}
