/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

import agenda.view.SplashScreen;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class StartAplicatie {
    public static void main(String args[])throws Exception
    {
        SplashScreen splashScreen=new SplashScreen();
        splashScreen.setVisible(true);
        splashScreen.start();
        
        Thread.sleep(4000);
        splashScreen.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                CarteDeTelefon agenda = new CarteDeTelefon();
                agenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                agenda.setLocationRelativeTo(null);
                agenda.setTitle("Agenda Telefonica");
                agenda.pack();
                agenda.setVisible(true);
            }
        });
    }
 
}