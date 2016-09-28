package com.java.agenda;

import com.java.agenda.controller.CarteDeTelefonController;
import com.java.agenda.model.CarteDeTelefonModel;
import com.java.agenda.view.SplashScreen;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Clasa principala pentru lansarea aplicatiei
 * Foloseste un obiect de tip SplashScreen, dupa care initializeaza
 * aplicatia apeland clasa <code>CarteDeTelefonController</code>
 *
 * @author Liviu Jianu
 */
public class StartAplicatie {


    public static void main(String args[]) throws Exception {
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
        splashScreen.start();

        Thread.sleep(4000);
        splashScreen.dispose();
        SwingUtilities.invokeLater(() -> {
            CarteDeTelefonModel carteDeTelefonModel = new CarteDeTelefonModel();
            CarteDeTelefonController agenda = new CarteDeTelefonController(carteDeTelefonModel);
            agenda.init();
        });
    }

}