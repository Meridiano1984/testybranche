package tb.soft;
//import java.awt.EventQueue;
//import javax.swing.JFrame;

import javax.swing.*;

/**
 * klasa główna zawierająca metodę statyczną main
 */
public class MainWindow /*extends JFrame*/ /*implements ActionListener*/ {

    public static void main(String[] args) {
        //zmiana

        SwingUtilities.invokeLater(() ->{
            new Okno();
        });

        /*try{
            Okno frame = new Okno();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }*/

    }
}