package com.java.contacts;

import com.java.contacts.controller.ContactsController;
import com.java.contacts.model.ContactsModel;

import javax.swing.SwingUtilities;

public class StartApp {


    public static void main(String args[]) throws Exception {
//        SplashScreen splashScreen = new SplashScreen();
//        splashScreen.setVisible(true);
//        splashScreen.start();
//
//        Thread.sleep(4000);
//        splashScreen.dispose();
        SwingUtilities.invokeLater(() -> {
            ContactsModel contactsModel = new ContactsModel();
            ContactsController agenda = new ContactsController(contactsModel);
            agenda.init();
        });
    }

}