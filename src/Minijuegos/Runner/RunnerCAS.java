package Minijuegos.Runner;

import EstructurasDatos.SimpleList;
import Juego.Jmain;
import Juego.Map;
import Juego.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class RunnerCAS extends JFrame {

    private JFrame frm3;
    private JLabel jugador1, jugador2, text1, text2;
    private JTextField text5;
    private int x, y, p1, p2, ejemplo;
    public Player player20, player21;

    /**
     * Runner2
     * Este constructor crea un frame, un panel y aloja objetos en ellos
     *
     * @author Mauricio C.
     */

    public RunnerCAS(SimpleList duelist) {

        player20 = (Player) duelist.getPos(1);
        player21 = (Player) duelist.getPos(0);



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


        if (Jmain.getInstance().getPlayerList().getLength() == 2) {
            if (player20 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
        }

        if (Jmain.getInstance().getPlayerList().getLength() == 3) {
            if (player20 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(2)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador1.setIcon(bgurlp1);
            }
        }
        if (Jmain.getInstance().getPlayerList().getLength() == 4) {
            if (player20 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(2)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador1.setIcon(bgurlp1);
            }
            if (player20 == Jmain.getInstance().getPlayerList().getPos(3)) {
                ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P4.png"));
                jugador1.setIcon(bgurlp1);
            }

        }
        if (Jmain.getInstance().getPlayerList().getLength() == 2) {
            if (player21 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }

        }
        if (Jmain.getInstance().getPlayerList().getLength() == 3) {
            if (player21 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(2)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador2.setIcon(bgurlp2);
            }
        }

        if (Jmain.getInstance().getPlayerList().getLength() == 4) {
            if (player21 == Jmain.getInstance().getPlayerList().getPos(0)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P1.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(1)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P2.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(2)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P3.png"));
                jugador2.setIcon(bgurlp2);
            }
            if (player21 == Jmain.getInstance().getPlayerList().getPos(3)) {
                ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/Runner/P4.png"));
                jugador2.setIcon(bgurlp2);
            }
        }
        JOptionPane.showMessageDialog(null, "DUEL \n Lets play Runners!! \n When you press OK you will see the key bindings for each player! \n 3, 2, 1 RUN!! \n Enjoy!");


    }

    /**
     * Movimiento
     * Esta permite que se detecte la pulsacion de ciertas teclas
     *
     * @author Mauricio C.
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
                    JOptionPane.showMessageDialog(null, "PLAYER 1 WINS THE BATTLE!!");
                    player21.posJug--;
                    player21.movTotal = player21.posJug;
                    player21.casillaActual = Map.getInstance().getCasilla(player21.posJug,Map.getInstance().getFase2(player21.casillaActual));
                    player21.verifyTeleport();
                    player21.posX = player21.casillaActual.getPosX();
                    player21.posY = player21.casillaActual.getPosY();
                    if(player21.referencia == 1){
                        Jmain.getInstance().mario.setLocation((player21.posX-22),(player21.posY-28));
                    }
                    if(player21.referencia  == 2){
                        Jmain.getInstance().luigi.setLocation((player21.posX-22),(player21.posY-28));
                    }
                    if(player21.referencia  == 3){
                        Jmain.getInstance().toad.setLocation((player21.posX-22),(player21.posY-28));
                    }
                    if(player21.referencia  == 4){
                        Jmain.getInstance().yoshi.setLocation((player21.posX-22),(player21.posY-28));
                    }
                    JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
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
                    player20.posJug--;
                    player20.movTotal = player20.posJug;
                    player20.casillaActual = Map.getInstance().getCasilla(player20.posJug,Map.getInstance().getFase2(player20.casillaActual));
                    player20.verifyTeleport();
                    player20.posX = player20.casillaActual.getPosX();
                    player20.posY = player20.casillaActual.getPosY();
                    if(player20.referencia  == 1){
                        Jmain.getInstance().mario.setLocation((player20.posX-22),(player20.posY-28));
                    }
                    if(player20.referencia  == 2){
                        Jmain.getInstance().luigi.setLocation((player20.posX-22),(player20.posY-28));
                    }
                    if(player20.referencia == 3){
                        Jmain.getInstance().toad.setLocation((player20.posX-22),(player20.posY-28));
                    }
                    if(player20.referencia  == 4){
                        Jmain.getInstance().yoshi.setLocation((player20.posX-22),(player20.posY-28));
                    }
                    JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    frm3.setVisible(false);

                }
            }
            

        }

    }
}
