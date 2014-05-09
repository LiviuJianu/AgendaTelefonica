/**
 * Pachet view pentru <code>SplashScreen</code> si <code>Reclame</code>
 */
package agenda.view;

import static java.lang.Thread.sleep;
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
    Random rand = new Random();

    Thread threadPrincipal = null;

    /**
     * Constructorul clasei Se initializeaza un nou thread, care ruleaza
     * permanent si la fiecare 2 secunde schimba imaginea de fundal
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
                        imagineFundal3 = new ImageIcon("images/java3.png");
                        labelImagine.setIcon(imagineFundal3);
                        repaint();
                        try {
                            sleep(DURATA_BANNER);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (numarAleator == 2) {
                        imagineFundal2 = new ImageIcon("images/java2.png");
                        labelImagine.setIcon(imagineFundal2);
                        repaint();
                        try {
                            sleep(DURATA_BANNER);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (numarAleator == 1) {
                        imagineFundal1 = new ImageIcon("images/java1.png");
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
