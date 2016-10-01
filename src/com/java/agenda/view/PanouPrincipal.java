package com.java.agenda.view;

import com.java.agenda.model.CarteDeTelefonModel;

import javax.swing.*;
import java.awt.*;

public class PanouPrincipal extends JPanel {

    private PanouStanga panouStanga;
    private PanouDreapta panouDreapta;

    public PanouPrincipal(CarteDeTelefonModel carteDeTelefonModel) {
        panouStanga = new PanouStanga(carteDeTelefonModel);
        panouDreapta = new PanouDreapta();

        init();
    }

    private void init() {
        setLayout(new GridLayout(1,2));
        add(panouStanga);
        add(panouDreapta);
    }

}
