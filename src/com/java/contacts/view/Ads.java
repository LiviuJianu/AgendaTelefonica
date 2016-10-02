/**
 * Pachet view pentru <code>SplashScreen</code> si <code>Ads</code>
 */
package com.java.contacts.view;

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
public class Ads extends JPanel {

    private JLabel imageLabel;
    private ImageIcon adImage1;
    private ImageIcon adImage2;
    private ImageIcon adImage3;
    private int randomNumber;
    private static final int BANNER_DISPLAY_TIME = 2000; //milisecunde
    private Random rand = new Random();

    private Thread mainAdsThread = null;

    /**
     * Initializare thread si rotirea imaginilor la 2 secunde
     */
    public Ads() {
        setSize(468, 60);

        adImage1 = new ImageIcon("images/java1.png");
        adImage2 = new ImageIcon("images/java2.png");
        adImage3 = new ImageIcon("images/java3.png");
        imageLabel = new JLabel(adImage1);
        imageLabel.setBounds(0, 0, 468, 60);
        add(imageLabel);

        mainAdsThread = new Thread() {

            @Override
            public void run() {
                while (true) {
                    randomNumber = rand.nextInt(4);

                    if (randomNumber == 3) {
                        imageLabel.setIcon(adImage3);
                        repaint();
                        try {
                            sleep(BANNER_DISPLAY_TIME);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (randomNumber == 2) {
                        imageLabel.setIcon(adImage2);
                        repaint();
                        try {
                            sleep(BANNER_DISPLAY_TIME);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (randomNumber == 1) {
                        imageLabel.setIcon(adImage1);
                        repaint();
                        try {
                            sleep(BANNER_DISPLAY_TIME);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
            }

        };
        mainAdsThread.start();

    }

}
