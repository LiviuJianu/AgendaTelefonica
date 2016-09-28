package com.java.agenda.view;

import javax.swing.*;
import java.awt.*;

public class PanouDetalii extends JPanel {

    private JLabel imagineLabel;
    private ImageIcon icoanaImagine;
    private JLabel numeLabel;
    private JLabel prenumeLabel;
    private JLabel cnpLabel;
    private JTextField cnpText;
    private JLabel telefonLabel;
    private JTextField telefonText;

    public PanouDetalii() {
        icoanaImagine = new ImageIcon("resources/icon/noImage.png");
        imagineLabel = new JLabel(icoanaImagine);
        numeLabel = new JLabel("Nume");
        prenumeLabel = new JLabel("Prenume");
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
        add(imagineLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(numeLabel, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(prenumeLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(cnpLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(cnpText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(telefonLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(telefonText, gbc);
    }
}
