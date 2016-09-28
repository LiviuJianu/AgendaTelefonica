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
        setLayout(new GridLayout(3,3));
        add(imagineLabel);
        add(numeLabel);
        add(prenumeLabel);
        add(cnpLabel);
        add(cnpText);
        add(telefonLabel);
        add(telefonText);
    }
}
