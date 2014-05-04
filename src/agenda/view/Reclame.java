/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.view;

import javax.swing.*;
import java.util.Random;
 
public class Reclame extends JPanel {
 
    private JLabel labelImagine;
    private ImageIcon imagineFundal1;
    private ImageIcon imagineFundal2;
    private ImageIcon imagineFundal3;
    private int noDoubles;
    private int currRand;
    Random rand = new Random();


    Thread threadPrincipal = null;
 
    public Reclame() {
        setSize(468, 60);
        //setLayout(null);
         
        
        imagineFundal1 = new ImageIcon("images/java1.png");
        imagineFundal2 = new ImageIcon("images/java2.png");
        imagineFundal3 = new ImageIcon("images/java3.png");
        labelImagine = new JLabel(imagineFundal1);
        labelImagine.setBounds(0, 0, 468, 60);
        add(labelImagine);

        
        
 
        threadPrincipal = new Thread() {
         int lastOne = -1;  // init to impossible value

            @Override
            public void run() {
            do {
                currRand = rand.nextInt(4);



                if (currRand == 3) {
                    System.out.println("3");
                    imagineFundal3 = new ImageIcon("images/java3.png");
                    labelImagine.setIcon(imagineFundal3);
                    repaint();
                } else if (currRand == 2) {
                    System.out.println("2");
                    imagineFundal2 = new ImageIcon("images/java2.png");
                    labelImagine.setIcon(imagineFundal2);
                    repaint();
                } else if (currRand == 1) {
                    System.out.println("1");
                    imagineFundal1 = new ImageIcon("images/java1.png");
                    labelImagine.setIcon(imagineFundal1);
                    repaint();
                }
                
            }  while (currRand == noDoubles);
                  noDoubles = currRand;
            }

        };
        threadPrincipal.start();

    }


}