package com.java.agenda.view;

import com.java.agenda.controller.AbonatObserver;
import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class PanouStanga extends JPanel implements AbonatObserver {

    private JTextField campCautare;
    private JTable tabelAbonati;
    private CarteDeTelefonModel carteDeTelefonModel;

    public PanouStanga(CarteDeTelefonModel carteDeTelefonModel) {
        this.carteDeTelefonModel = carteDeTelefonModel;
        this.carteDeTelefonModel.registerObserver(this);

        campCautare = new JTextField("Cautare");
        tabelAbonati = new JTable();

        initTabelModel();
        init();
    }

    private void initTabelModel() {
        tabelAbonati.setAutoCreateRowSorter(true);
        tabelAbonati.setModel(carteDeTelefonModel.getModelTabelAbonati());
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

    @Override
    public void uppdateAbonat() {

    }
}
