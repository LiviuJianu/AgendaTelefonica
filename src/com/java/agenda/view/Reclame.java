/**
 * Pachet view pentru <code>SplashScreen</code> si <code>Reclame</code>
 */
package com.java.agenda.view;

import javax.swing.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Afisarea reclamelor in partea de jos a aplicatie
 * <p>
 * Obiectul creat este de tip JPanel si foloseste 3 imagini pe care le roteste
 * aleator si (aproape) unic la fiecare 2 secunde</p>
 *
 * @author Liviu Jianu
 */
public class Reclame extends JPanel {

    private JLabel labelImagine;
    private ImageIcon imagineFundal1;
    private ImageIcon imagineFundal2;
    private ImageIcon imagineFundal3;
    private int numarAleator;
    private static final int DURATA_BANNER = 2000; //milisecunde
    private Random rand = new Random();

    private Thread threadPrincipal = null;

    /**
     * Initializare thread si rotirea imaginilor la 2 secunde
     */
    public Reclame() {
        setSize(468, 60);

        imagineFundal1 = new ImageIcon("images/java1.png");
        imagineFundal2 = new ImageIcon("images/java2.png");
        imagineFundal3 = new ImageIcon("images/java3.png");
        labelImagine = new JLabel(imagineFundal1);
        labelImagine.setBounds(0, 0, 468, 60);
        add(labelImagine);

        threadPrincipal = new Thread() {

            @Override
            public void run() {
                while (true) {
                    numarAleator = rand.nextInt(4);

                    if (numarAleator == 3) {
                        labelImagine.setIcon(imagineFundal3);
                        repaint();
                        try {
                            sleep(DURATA_BANNER);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (numarAleator == 2) {
                        labelImagine.setIcon(imagineFundal2);
                        repaint();
                        try {
                            sleep(DURATA_BANNER);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (numarAleator == 1) {
                        labelImagine.setIcon(imagineFundal1);
                        repaint();
                        try {
                            sleep(DURATA_BANNER);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
            }

        };
        threadPrincipal.start();

    }

}
