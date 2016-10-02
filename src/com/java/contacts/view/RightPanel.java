package com.java.contacts.view;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.model.ContactsModel;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    private DetailsPanel detailsPanel;
    private ButtonsPanel panouButoane;

    public RightPanel(ContactsController contactsController, ContactsModel contactsModel) {
        detailsPanel = new DetailsPanel(contactsModel);
        panouButoane = new ButtonsPanel(contactsController);

        init();
    }

    private void init() {
        setSize(new Dimension(400,600));
        setLayout(new GridLayout(2, 1));
        add(detailsPanel);
        add(panouButoane);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);
    }

    public DetailsPanel getDetailsPanel() {
        return detailsPanel;
    }

    public void setDetailsPanel(DetailsPanel detailsPanel) {
        this.detailsPanel = detailsPanel;
    }

    public ButtonsPanel getPanouButoane() {
        return panouButoane;
    }

    public void setPanouButoane(ButtonsPanel panouButoane) {
        this.panouButoane = panouButoane;
    }
}
