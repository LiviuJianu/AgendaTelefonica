/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.view;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class SplashScreen extends JFrame {
 
    private final JLabel labelImagine;
    private final ImageIcon imagineFundal;
    private static JProgressBar baraProgres;
    Thread threadPrincipal = null;
 
    public SplashScreen() {
        super("Initializare Agenda Telefonica");
        setSize(340, 280);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLayout(null);
        
        imagineFundal = new ImageIcon("images/splash.jpg");
        labelImagine = new JLabel(imagineFundal);
        labelImagine.setBounds(20, 20, 300, 187);
        add(labelImagine);
        
        JLabel labelAutor = new JLabel("Autor Liviu Jianu");
        add(labelAutor);
        labelAutor.setBounds(225, 210, 100, 20);
        
        
        
        baraProgres = new JProgressBar();
        baraProgres.setMinimum(0);
        baraProgres.setMaximum(100);
        baraProgres.setStringPainted(true);
        baraProgres.setForeground(Color.ORANGE);
        
        
        baraProgres.setPreferredSize(new Dimension(294, 20));
        baraProgres.setBounds(20, 240, 300, 20);
        add(baraProgres);
 
        threadPrincipal = new Thread() {
 
            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    baraProgres.setValue(i);
                    try {
                        sleep(35);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };

    }
    public void start() {
        threadPrincipal.start();
    }
    

}