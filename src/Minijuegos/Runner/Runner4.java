package Minijuegos.Runner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class Runner4 extends JFrame {

    private JFrame frm3;
    private JLabel jugador1, jugador2, jugador3, jugador4, text1, text2, text3, text4;
    private JTextField text5;
    private int x, y, p1, p2, p3, p4,xm,xl,xt,xy;



    public Runner4() {



        frm3 = new JFrame("Runners");
        frm3.setBounds(0, 0, 1280, 900);
        frm3.setLocationRelativeTo(null);
        frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setSize(1280, 900);
        frm3.add(panel3);


        jugador1 = new JLabel();
        jugador1.setBounds(146, 485, 50, 50);
        ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
        jugador1.setIcon(bgurlp1);
        validate();

        panel3.add(jugador1);

        jugador2 = new JLabel();
        jugador2.setBounds(146, 535, 50, 50);
        ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
        jugador2.setIcon(bgurlp2);
        validate();

        panel3.add(jugador2);

        jugador3 = new JLabel();
        jugador3.setBounds(146, 585, 50, 50);
        ImageIcon bgurlp3 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
        jugador3.setIcon(bgurlp3);
        validate();

        panel3.add(jugador3);

        jugador4 = new JLabel();
        jugador4.setBounds(146, 635, 50, 50);
        ImageIcon bgurlp4 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P4.png"));
        jugador4.setIcon(bgurlp4);
        validate();

        panel3.add(jugador4);

        text1 = new JLabel(" Mario [A]");
        text1.setFont(new Font("Serif", Font.BOLD, 24));
        text1.setForeground(Color.WHITE);
        text1.setBounds(132, 690, 150, 40);
        panel3.add(text1);

        text2 = new JLabel(" Luigi [C]");
        text2.setFont(new Font("Serif", Font.BOLD, 24));
        text2.setForeground(Color.WHITE);
        text2.setBounds(310, 690, 150, 40);
        panel3.add(text2);

        text3 = new JLabel(" Toad [N]");
        text3.setFont(new Font("Serif", Font.BOLD, 24));
        text3.setForeground(Color.WHITE);
        text3.setBounds(488, 690, 150, 40);
        panel3.add(text3);

        text4 = new JLabel(" Yoshi [K]");
        text4.setFont(new Font("Serif", Font.BOLD, 24));
        text4.setForeground(Color.WHITE);
        text4.setBounds(666, 690, 150, 40);
        panel3.add(text4);

        text5 = new JTextField();
        text5.setBounds(0, 0, 1, 1);
        panel3.add(text5);
        validate();
        Movimiento oyente1 = new Movimiento();
        text5.addKeyListener(oyente1);
        text5.setForeground(Color.WHITE);


        JLabel bg3 = new JLabel();
        bg3.setBounds(0, 0, 1280, 900);
        ImageIcon bgurl3 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/pista.png"));
        bg3.setIcon(bgurl3);
        validate();

        panel3.add(bg3);


        frm3.setVisible(true);


        JOptionPane.showMessageDialog(null, "Lets play Runners!! \n When you press OK you will see the key bindings for each player! \n 3, 2, 1 RUN!! \n Enjoy!");


    }

        class Movimiento implements KeyListener {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                int[] numeros = {p1,p2,p3,p4};

                if (e.getKeyChar() == 'a') {
                    System.out.println("Mario esta corriendo");
                    x = jugador1.getX();
                    y = jugador1.getY();
                    jugador1.setLocation(x + 50, y);
                    p1 += 1;
                    System.out.println(p1);

                    if (p1 > 20) {
                        Arrays.sort(numeros);
                        for (int numero:numeros)
                            System.out.println(numero);
                            System.out.print(numeros);
                        JOptionPane.showMessageDialog(null, "MARIO WINS!!");
                        frm3.setVisible(false);


                    }

                }
                if (e.getKeyChar() == 'c') {
                    System.out.println("Luigi esta corriendo");
                    x = jugador2.getX();
                    y = jugador2.getY();
                    jugador2.setLocation(x + 50, y);
                    p2 += 1;
                    System.out.println(p2);

                    if (p2 == 20) {

                        JOptionPane.showMessageDialog(null, "LUIGI WINS!!");
                        frm3.setVisible(false);

                    }
                }
                if (e.getKeyChar() == 'n') {
                    System.out.println("Toad esta corriendo");
                    x = jugador3.getX();
                    y = jugador3.getY();
                    jugador3.setLocation(x + 50, y);
                    p3 += 1;
                    System.out.println(p3);
                    if (p3 == 20) {

                        JOptionPane.showMessageDialog(null, "TOAD WINS!!");
                        frm3.setVisible(false);

                    }
                }
                if (e.getKeyChar() == 'k') {
                    System.out.println("Yoshi esta corriendo");
                    x = jugador4.getX();
                    y = jugador4.getY();
                    jugador4.setLocation(x + 50, y);
                    p4 += 1;
                    System.out.println(p4);
                    if (p4 == 20) {
                        JOptionPane.showMessageDialog(null, "YOSHI WINS!!");
                        frm3.setVisible(false);

                    }
                }

            }
        }

}