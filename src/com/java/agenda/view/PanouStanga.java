package com.java.agenda.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanouStanga extends JPanel {

    private JTextField campCautare;
    private JTable tabelAbonati;
    private DefaultTableModel modelTabel;
    private String[] coloane = {"Nr.#", "Nume", "Prenume", "CNP", "Telefon"};

    public PanouStanga() {
        campCautare = new JTextField("Cautare");
        tabelAbonati = new JTable();
        modelTabel = new DefaultTableModel(null, coloane);
        tabelAbonati.setModel(modelTabel);

        init();
    }

    private void init() {
        setSize(new Dimension(400, 600));
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(campCautare, gbc);

        gbc.ipadx = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JScrollPane(tabelAbonati), gbc);
    }

}
