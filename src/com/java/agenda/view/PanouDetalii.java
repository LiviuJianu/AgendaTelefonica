package com.java.agenda.view;

import javax.swing.*;
import java.awt.*;

public class PanouDetalii extends JPanel {

    private JLabel imagineLabel;
    private ImageIcon icoanaImagine;
    private JTextField numeText;
    private JTextField prenumeText;
    private JLabel cnpLabel;
    private JTextField cnpText;
    private JLabel telefonLabel;
    private JTextField telefonText;

    public PanouDetalii() {
        icoanaImagine = new ImageIcon("resources/icon/noImage.png");
        imagineLabel = new JLabel(icoanaImagine);
        numeText = new JTextField("Nume");
        prenumeText = new JTextField("Prenume");
        cnpLabel = new JLabel("CNP: ");
        cnpText = new JTextField(13);
        telefonLabel = new JLabel("Telefon");
        telefonText = new JTextField(13);

        init();
    }

    private void init() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 0;
        gbc.insets = new Insets(0,0,50,30);
        add(imagineLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(numeText, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(prenumeText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 0;
        add(cnpLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        add(cnpText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 0;
        add(telefonLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        add(telefonText, gbc);
    }
}
