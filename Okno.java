package tb.soft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Okno  {

    public Okno() {
        JFrame okienko = new JFrame();   //stworzenie ramki

        /*JLabel napis_login = new JLabel("login:");                      //zrobienie napisu login
        napis_login.setBounds(200,100, 40,20);

        JLabel napis_haslo = new JLabel("hasło:");                      //zrobienie napisu haslo
        napis_haslo.setBounds(200,150, 40,20);

        JTextField pole_login = new JTextField(20);                  //zrobienie pola login
        pole_login.setBounds(250,100,120, 20);

        JPasswordField pole_haslo = new JPasswordField(20);          //zrobienie pola haslo
        pole_haslo.setBounds(250,150,120, 20);*/

        //robienie toolbar
        /*{
            JToolBar toolBar = new JToolBar();
            JButton log = new JButton("Login");
            log.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    akcja_przycisku_login(pole_login,pole_haslo,okienko);
                }
            });
            JButton czysc = new JButton("Wyczyść");
            czysc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    akcja_przycisku_czyszczenie(pole_login,pole_haslo,okienko);
                }
            });
            toolBar.add(log);
            toolBar.add(czysc);
            okienko.add(toolBar, BorderLayout.NORTH);
            okienko.pack();
        }*/

        JButton przycisk_lapania = new JButton();
        przycisk_lapania.setBounds(150,400,100,50);      //ustawienie odległości i wymierów przycisku
        przycisk_lapania.setText("Złap mnie");                           //ustawienie tekstu
        przycisk_lapania.setFocusable(false);                              //usuniecie ramki wokol tekstu
        /*przycisk_logowania.addActionListener(new ActionListener()           //dodanie akcji
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                akcja_przycisku_login(pole_login,pole_haslo,okienko);
            }
        });*///akcja do przycisk login

        przycisk_lapania.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() ->{
                    new Kanwa();                                           //odpalenie nowego okna kanwy
                });
            }
        });//akcja do przycisk lapania

        przycisk_lapania.addMouseListener(new MouseAdapter() {             //losowanie nowych pozycji przy najechaniu myszą
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                //e.getX();
                System.out.println(e.getX() + " " + e.getY());
                if(przycisk_lapania.getWidth()*4/5>e.getX() )
                {
                    Random los = new Random();
                    int a = los.nextInt(501);
                    int b = los.nextInt(514);
                    przycisk_lapania.setLocation(a,b);
                }
            }
        });


        JButton przycisk_resetowania = new JButton();
        przycisk_resetowania.setBounds(500,513,100,50);     //ustawienie odległości i wymierów przycisku
        przycisk_resetowania.setText("Zresetuj");                              //ustawienie tekstu
        przycisk_resetowania.setFocusable(false);                             //usuniecie ramki wokol tekstu
        /*przycisk_czyszczenia.addActionListener(new ActionListener()           //dodanie akcji
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                akcja_przycisku_czyszczenie(pole_login,pole_haslo,okienko);
            }
        });*///akcja do przycisk reset

        przycisk_resetowania.addActionListener(new ActionListener()           //dodanie akcji
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                //akcja_przycisku_czyszczenie(pole_login,pole_haslo,okienko);
                przycisk_lapania.setLocation(150,400);
            }
        });//akcja do przycisk reset

        okienko.setTitle("Obsługa myszy");                          //ustawienie tytułu okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //wyjscie z aplikacji
        okienko.setLayout(null);                                //?
        okienko.setResizable(false);                            //zapobieganie zmiany rozmiaru okna
        okienko.setSize(600,600);                   //ustawienie rozmiaru okna
        okienko.setLocationRelativeTo(null);                    //ustawienie okna na środku


        JPanel panel = new JPanel();
        panel.setBounds(0,0, 600,600);
        //setContentPane(panel);
        panel.setLayout(null);

        okienko.setVisible(true);                               //ustawienie widocznosci okna
        panel.add(przycisk_lapania);                        //dodanie przycisku logowania
        panel.add(przycisk_resetowania);                      //dodanie przycisku czyszczenia
        okienko.add(panel);

        /*okienko.add(napis_login);                               //dodanie napisu logowania
        okienko.add(napis_haslo);                               //dodanie napisu hasla
        okienko.add(pole_login);                                //dodanie pola logowania
        okienko.add(pole_haslo);*/                                //dodanie pola hasla

        //List <String> tablica_hasel = new ArrayList<String>();
        System.out.println("Program konsolowy");
        //System.exit(0);
    }

    /*void akcja_przycisku_login (JTextField login, JPasswordField haslo, JFrame ramka)
    {
        String loginText = login.getText();
        String passwordText = new String(haslo.getPassword());
        DaneUzytkownikow DaneLogowania = new DaneUzytkownikow();

//        char[] passwordText2 = haslo.getPassword();
//        char[] faktycznehaslo = DaneLogowania.daneUżytkowników.get(loginText).toCharArray();
//
//        if (passwordText2.equals(faktycznehaslo))     //warunek sprawdzający czy jest sparowany login i hasło
//        {
//            ramka.getContentPane().setBackground(Color.GREEN);
//        }
//        else
//            {
//                ramka.getContentPane().setBackground(Color.RED);
//            }

        if (passwordText.equals(DaneLogowania.daneUżytkowników.get(loginText)))     //warunek sprawdzający czy jest sparowany login i hasło
        {
            ramka.getContentPane().setBackground(Color.GREEN);
        }
        else
        {
            ramka.getContentPane().setBackground(Color.RED);
        }
    }*///funkcja do akci przycisku login

    /*void akcja_przycisku_czyszczenie(JTextField login, JPasswordField haslo, JFrame ramka)
    {
        login.setText(null);
        haslo.setText(null);
        ramka.getContentPane().setBackground(Color.GRAY);
    }*///funkcja do akci przycisku reset


}