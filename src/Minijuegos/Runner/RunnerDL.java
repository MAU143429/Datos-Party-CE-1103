package Minijuegos.Runner;

import Juego.Jmain;
import Juego.Player;

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



public class RunnerDL extends JFrame {

    private JFrame frm3;
    private JLabel jugador1, jugador2, text1, text2;
    private JTextField text5;
    private int x, y, p1, p2,ejemplo;
    public Player retador1,retador2;

    /**
     * Runner2
     *Este constructor crea un frame, un panel y aloja objetos en ellos
     *@author Mauricio C.

     */

    public RunnerDL() {

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
        validate();

        panel3.add(jugador1);

        jugador2 = new JLabel();
        jugador2.setBounds(146, 600, 50, 50);
        validate();

        panel3.add(jugador2);


        text1 = new JLabel(" PLAYER 1 [A]");
        text1.setFont(new Font("Serif", Font.BOLD, 24));
        text1.setForeground(Color.WHITE);
        text1.setBounds(400, 690, 250, 40);
        panel3.add(text1);

        text2 = new JLabel(" PLAYER 2 [C]");
        text2.setFont(new Font("Serif", Font.BOLD, 24));
        text2.setForeground(Color.WHITE);
        text2.setBounds(700, 690, 250, 40);
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

        retador1 = Jmain.getInstance().getRandomPlayer();
        retador2 = Jmain.getInstance().getRandomPlayer();

        while(retador1 == retador2){
            retador2 = Jmain.getInstance().getRandomPlayer();
        }

        if(Jmain.getInstance().getPlayerList().getLength() == 2){
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
        }

        if(Jmain.getInstance().getPlayerList().getLength() == 3) {
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(2)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador1.setIcon(bgurlp1);
            }
        }
        if(Jmain.getInstance().getPlayerList().getLength() == 4){
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(2)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(3)){
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P4.png"));
                jugador1.setIcon(bgurlp1);
            }

        }
        if(Jmain.getInstance().getPlayerList().getLength() == 2){
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }

        }
        if(Jmain.getInstance().getPlayerList().getLength() == 3){
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(2)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador2.setIcon(bgurlp2);
            }
        }

        if(Jmain.getInstance().getPlayerList().getLength() == 4){
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(2)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(3)){
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P4.png"));
                jugador2.setIcon(bgurlp2);
            }
        }
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


            if (e.getKeyChar() == 'a') {
                System.out.println("Player 1 esta corriendo");
                x = jugador1.getX();
                y = jugador1.getY();
                jugador1.setLocation(x + 50, y);
                p1 += 1;
                System.out.println(p1);

                if (p1 == 20) {

                    JOptionPane.showMessageDialog(null, "PLAYER 1 WINS!!");
                    frm3.setVisible(false);


                }

            }
            if (e.getKeyChar() == 'c') {
                System.out.println("Player 2 esta corriendo");
                x = jugador2.getX();
                y = jugador2.getY();
                jugador2.setLocation(x + 50, y);
                p2 += 1;
                System.out.println(p2);

                if (p2 == 20) {
                    JOptionPane.showMessageDialog(null, "PLAYER 2 WINS!!");
                    frm3.setVisible(false);

                }
            }

            if (p1 == 20 || p2 == 20 ){
                if (p1 > p2) {
                    retador1.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    if (retador2.monedas <= 50){
                        retador2.monedas = 0;
                    }else{
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas -= 25;
                    }
                    Jmain.getInstance().actualizarLabels();
                }if (p2 > p1) {
                    retador2.monedas += 50;
                    if (retador1.monedas <= 50){
                        retador1.monedas = 0;
                    }else{
                        retador1.monedas -= 50;
                    }
                    Jmain.getInstance().actualizarLabels();
                }
            }
        }

    }


}




