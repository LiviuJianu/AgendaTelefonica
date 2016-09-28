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
        campCautare = new JTextField(10);
        tabelAbonati = new JTable();
        modelTabel = new DefaultTableModel(null, coloane);
        tabelAbonati.setModel(modelTabel);

        init();
    }

    private void init() {
        setSize(new Dimension(400, 600));
        setLayout(new GridLayout(2, 1));
        add(campCautare);
        add(tabelAbonati);
    }

}
