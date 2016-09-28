package com.java.agenda.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class BaraMeniu  extends JMenuBar {

    private final ImageIcon iconIncarca = new ImageIcon("../resources/icon/open.png");
    private final ImageIcon iconSalveaza = new ImageIcon("../resources/icon/save.png");
    private final ImageIcon iconIesire = new ImageIcon("../resources/icon/exit.png");
    private final ImageIcon iconSerial = new ImageIcon("../resources/icon/key.png");

    private final JMenuItem meniuIncarcaDate = new JMenuItem("Incarcare DB", iconIncarca);
    private final JMenuItem meniuSalvareDate = new JMenuItem("Salvare DB", iconSalveaza);
    private final JMenuItem meniuIesire = new JMenuItem("Iesire", iconIesire);
    private final JMenuItem meniuInregistrare = new JMenuItem("Inregistrare", iconSerial);
    private ImageIcon iconNou = new ImageIcon("icon/new.png");
    private ImageIcon iconActualizare = new ImageIcon("icon/update.png");
    private ImageIcon iconCauta = new ImageIcon("icon/search.png");
    private ImageIcon iconSterge = new ImageIcon("icon/trash.png");
    private ImageIcon iconHelp = new ImageIcon("icon/help.png");

    JMenu file = new JMenu("Fisier");

    public BaraMeniu() {
        init();
    }

    public void init() {
        file.setMnemonic(KeyEvent.VK_F);

        meniuIncarcaDate.setMnemonic(KeyEvent.VK_D);
        meniuIncarcaDate.setToolTipText("Incarcare baza de date");
//        meniuIncarcaDate.addActionListener(new IncarcaDB());

        meniuSalvareDate.setMnemonic(KeyEvent.VK_A);
        meniuSalvareDate.setToolTipText("Salvare baza de date");
//        meniuSalvareDate.addActionListener(new SalveazaDB());

        /*
         * Cand se doreste iesirea din aplicatie, utilizatorul este intrebat
         * daca se doreste iesirea, caz in care aplicatia se inchide, sau daca
         * nu se doreste iesire, aplicatia functioneaza in continuare.
         */
        meniuIesire.setMnemonic(KeyEvent.VK_I);
        meniuIesire.setToolTipText("Iesire din aplicatie");
        meniuIesire.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        meniuIesire.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogIesire = JOptionPane.showConfirmDialog(null, "Doriti sa iesiti din aplicatie?", "Iesire aplicatie", dialogButton);
                if (dialogIesire == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        JMenu abonatiMeniu = new JMenu("Abonati");
        abonatiMeniu.setMnemonic(KeyEvent.VK_B);

        JMenuItem abonatNou = new JMenuItem("Adauga", iconNou);
        abonatNou.setMnemonic(KeyEvent.VK_A);
        abonatNou.setToolTipText("Activare introducere abonat nou");
        abonatNou.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
//        abonatNou.addActionListener(new AbonatPopup());

        JMenuItem actualizareAbonat = new JMenuItem("Modifica", iconActualizare);
        actualizareAbonat.setMnemonic(KeyEvent.VK_U);
        actualizareAbonat.setToolTipText("Actualizare abonat");
        actualizareAbonat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
//        actualizareAbonat.addActionListener(new AbonatPopup());

        JMenuItem cautaAbonat = new JMenuItem("Cauta", iconCauta);
        cautaAbonat.setMnemonic(KeyEvent.VK_C);
        cautaAbonat.setToolTipText("Cautare abonat ");
        cautaAbonat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
//        cautaAbonat.addActionListener(new CautaAbonat());

        JMenuItem salvareAbonat = new JMenuItem("Salveaza", iconSalveaza);
        salvareAbonat.setMnemonic(KeyEvent.VK_S);
        salvareAbonat.setToolTipText("Salvare date abonat");
        salvareAbonat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
//        salvareAbonat.addActionListener(new AdaugaAbonat());

        JMenuItem stergeAbonat = new JMenuItem("Sterge", iconSterge);
        stergeAbonat.setMnemonic(KeyEvent.VK_R);
        stergeAbonat.setToolTipText("Sterge abonat");
        stergeAbonat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
//        stergeAbonat.addActionListener(new StergeAbonat());

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);

        JMenuItem manual = new JMenuItem("Manual", iconHelp);
        manual.setMnemonic(KeyEvent.VK_M);
        manual.setToolTipText("Manual de utilizare");
        manual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        /*
         * Pentru inregistrarea aplicatiei, utilizatorul trebuie sa intriduca
         * un cod de inregistrare, care din motive de usurinta de testare
         * este urmatorul : 123abc
         */
        meniuInregistrare.setMnemonic(KeyEvent.VK_R);
        meniuInregistrare.setToolTipText("Introducere cod inregistrare");
        meniuInregistrare.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String serialNumber = JOptionPane.showInputDialog("Codul de inregistrare");
                if (serialNumber != null) {
//                    if (isAppRegistered(serialNumber)) {
//                        activeazaAplicatie();
//                        JOptionPane.showMessageDialog(null, "Aplicatia a fost inregistrata!");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Cod de inregistrare incorect!");
//                    }
                }
            }
        });

        file.add(meniuIncarcaDate);
        file.add(meniuSalvareDate);
        file.addSeparator();
        file.add(meniuIesire);

        abonatiMeniu.add(abonatNou);
        abonatiMeniu.add(actualizareAbonat);
        abonatiMeniu.add(salvareAbonat);
        abonatiMeniu.add(stergeAbonat);
        abonatiMeniu.addSeparator();
        abonatiMeniu.add(cautaAbonat);

        helpMenu.add(meniuInregistrare);
        helpMenu.addSeparator();
        helpMenu.add(manual);

        this.add(file);
        this.add(abonatiMeniu);
        this.add(helpMenu);

    }

}