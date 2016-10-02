package com.java.contacts.view;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.model.ContactsModel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private LeftPanel leftPanel;
    private RightPanel rightPanel;

    public MainPanel(ContactsController contactsController, ContactsModel contactsModel) {
        leftPanel = new LeftPanel(contactsModel);
        rightPanel = new RightPanel(contactsController, contactsModel);

        init();
    }

    private void init() {
        setLayout(new GridLayout(1,2));
        add(leftPanel);
        add(rightPanel);
    }

    public LeftPanel getLeftPanel() {
        return leftPanel;
    }

    public void setLeftPanel(LeftPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public RightPanel getRightPanel() {
        return rightPanel;
    }

    public void setRightPanel(RightPanel rightPanel) {
        this.rightPanel = rightPanel;
    }
}
