package tb.soft;


import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Kanwa extends JPanel implements KeyListener, MouseListener {

    //zmiany
    int xKształtu=0;
    int yKształtu=0;
    char kształt;
    JPanel panel;

    public Kanwa() {
        JFrame okienko = new JFrame();   //stworzenie ramki

        okienko.setTitle("Kanwa, rysuj kawdraty (k) lub koła (o)");                              //ustawienie tytułu okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //wyjscie z aplikacji
        okienko.setLayout(null);                                //?
        okienko.setResizable(false);                            //zapobieganie zmiany rozmiaru okna
        okienko.setSize(600,600);                   //ustawienie rozmiaru okna
        okienko.setLocationRelativeTo(null);                    //ustawienie okna na środku


//        panel = new JPanel();
//        panel.setBounds(0,0, 600,600);
        //setContentPane(panel);

        this.setSize(600,600);
        this.setLayout(null);
        this.setFocusable(true);
        this.setBackground(Color.WHITE);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setVisible(true);
        okienko.setVisible(true);                               //ustawienie widocznosci okna
        okienko.add(this);

//        panel.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                super.keyPressed(e);
//                znak = e.getKeyChar();
//                System.out.println(znak);
//            }
//        });//akcja przy wcisnieciu klawisza




        System.out.println("Program konsolowy");
        this.setFocusable(true);

        //System.exit(0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.YELLOW);
//        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        //g2d.fillRect(0,0,WIDTH,HEIGHT);
        g2d.setColor(Color.BLACK);
        rysowanie(g2d);
    }

    public void rysowanie (Graphics2D g2d)
    {
        System.out.println("rysowanie");
        if(!(xKształtu ==0 && yKształtu ==0)){
            if(kształt=='k'){

                g2d.fillRect(xKształtu, yKształtu,30,30);

            }
            if(kształt=='o'){
                g2d.fillOval(xKształtu, yKształtu,30,30);
            }
        }
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        xKształtu =e.getX();
        yKształtu =e.getY();
        System.out.println("x: " + xKształtu +" y: " +yKształtu);
//        this.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        kształt =e.getKeyChar();
        System.out.println("Wybrany kształt: " + e.getKeyChar());
    }
}