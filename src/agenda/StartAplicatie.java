package agenda;

import agenda.view.SplashScreen;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Clasa principala pentru lansarea aplicatiei
 * Foloseste un obiect de tip SplashScreen, dupa care initializeaza 
 * aplicatia apeland clasa <code>CarteDeTelefon</code>
 * @author Liviu Jianu
 */
public class StartAplicatie {

    /**
     * Metoda <code>main</code>
     * @param args argumentele cu care se apeleaza metoda main
     * @throws Exception exceptie in cazul in care nu se poate initializa un nou
     * thread.
     */
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