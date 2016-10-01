package com.java.agenda.view;

import com.java.agenda.model.Abonat;
import com.java.agenda.model.ModelTabelAbonati;
import com.java.agenda.model.NrMobil;
import com.java.agenda.model.NrTelefon;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanouStanga extends JPanel {

    private JTextField campCautare;
    private JTable tabelAbonati;
    private ModelTabelAbonati modelTabel;
    private String[] coloane = {"Nr.#", "Nume", "Prenume", "CNP", "Telefon"};

    public PanouStanga() {
        campCautare = new JTextField("Cautare");
        tabelAbonati = new JTable();
        initTabelModel();
        init();
    }

    private void initTabelModel() {
        tabelAbonati.setAutoCreateRowSorter(true);
        NrTelefon tel = new NrMobil("0723456789");
        Abonat a1 = new Abonat("1","Ion","Popescu","1780909322231", tel);
        Abonat a2 = new Abonat("2","Dan","Antonescu","1881109322231", tel);
        Abonat a3 = new Abonat("3","Mihai","Moraru","1940315322231", tel);
        List<Abonat> abonati = new ArrayList<>();

        abonati.add(a1);
        abonati.add(a2);
        abonati.add(a3);

        modelTabel = new ModelTabelAbonati(abonati);
        tabelAbonati.setModel(modelTabel);

    }

    private void init() {
        setSize(new Dimension(400, 600));
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        add(campCautare, gbc);

        gbc.ipadx = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JScrollPane(tabelAbonati), gbc);
    }

}
