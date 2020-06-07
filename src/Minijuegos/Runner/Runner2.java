package Minijuegos.Runner;

import Juego.Jmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

/**
 * Runner2
 *Esta clase ejecuta el minijuego runner para dos jugadores
 *@author Mauricio C.

 */

public class Runner2 extends JFrame {

    private JFrame frm3;
    private JLabel jugador1, jugador2, text1, text2;
    private JTextField text5;
    private int x, y, p1, p2,ejemplo;

    /**
     * Runner2
     *Este constructor crea un frame, un panel y aloja objetos en ellos
     *@author Mauricio C.

     */

    public Runner2() {


        frm3 = new JFrame("Runners");
        frm3.setBounds(0, 0, 1280, 900);
        frm3.setLocationRelativeTo(null);
        frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setSize(1280, 900);
        frm3.add(panel3);


        jugador1 = new JLabel();
        jugador1.setBounds(146, 520, 50, 50);
        ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
        jugador1.setIcon(bgurlp1);
        validate();

        panel3.add(jugador1);

        jugador2 = new JLabel();
        jugador2.setBounds(146, 600, 50, 50);
        ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
        jugador2.setIcon(bgurlp2);
        validate();

        panel3.add(jugador2);


        text1 = new JLabel(" Mario [A]");
        text1.setFont(new Font("Serif", Font.BOLD, 24));
        text1.setForeground(Color.WHITE);
        text1.setBounds(400, 690, 150, 40);
        panel3.add(text1);

        text2 = new JLabel(" Luigi [C]");
        text2.setFont(new Font("Serif", Font.BOLD, 24));
        text2.setForeground(Color.WHITE);
        text2.setBounds(700, 690, 150, 40);
        panel3.add(text2);


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

        ejemplo = Jmain.getInstance().PlayerList.getLength();
        System.out.println("EL LARGO DE LA LISTA ES" + ejemplo);


        JOptionPane.showMessageDialog(null, "Lets play Runners!! \n When you press OK you will see the key bindings for each player! \n 3, 2, 1 RUN!! \n Enjoy!");


    }
    /**
     * Movimiento
     *Esta permite que se detecte la pulsacion de ciertas teclas
     *@author Mauricio C.

     */

    class Movimiento implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

            int[] numeros = {p1, p2};

            if (e.getKeyChar() == 'a') {
                System.out.println("Mario esta corriendo");
                x = jugador1.getX();
                y = jugador1.getY();
                jugador1.setLocation(x + 50, y);
                p1 += 1;
                System.out.println(p1);

                if (p1 == 20) {
                    Arrays.sort(numeros);
                    for (int numero : numeros)
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

        }

    }


}



