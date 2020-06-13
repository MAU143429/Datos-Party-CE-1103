package Minijuegos.LFTT;


import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Treasure2
 *Esta clase es la que ejecuta el minijuego Looking for the Treasure para dos jugadores
 *@author Mauricio C.

 */

public class Treasure2 extends JFrame implements ActionListener {

    private JFrame frm4;
    private JButton btn1dig, btn2dig;
    private JLabel lf, tt, w1, w2;
    private JPanel panel4;
    private int player, num;
    private String path1, path2;
    public Player jugandoahora;
    public boolean turno;


    /**
     * Treasure2
     * Este constructor crea un frame, un panel y aloja objetos en ellos
     *
     * @author Mauricio C.
     */
    public Treasure2() {
        turno = false;
        num = (int) (Math.random() * 2) + 1;
        System.out.println(num);

        frm4 = new JFrame("Looking for the Treasure");
        frm4.setBounds(0, 0, 1295, 947);
        frm4.setLocationRelativeTo(null);
        frm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setSize(1280, 900);
        frm4.add(panel4);

        //#####################Botones/////////////////////////////////////////////////
        btn1dig = new JButton();
        btn1dig.setBounds(145, 600, 281, 87);
        ImageIcon btnurl13 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/btndig.png"));
        btn1dig.setIcon(btnurl13);
        btn1dig.addActionListener(this);

        panel4.add(btn1dig);


        btn2dig = new JButton();
        btn2dig.setBounds(800, 600, 281, 87);
        ImageIcon btnurl14 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/btndig.png"));
        btn2dig.setIcon(btnurl14);
        btn2dig.addActionListener(this);

        panel4.add(btn2dig);


        //################################Labels##############################################################
        lf = new JLabel();
        lf.setBounds(80, 20, 621, 112);
        ImageIcon bgurl17 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/LF.png"));
        lf.setIcon(bgurl17);
        validate();

        panel4.add(lf);

        tt = new JLabel();
        tt.setBounds(560, 80, 684, 125);
        ImageIcon bgurl18 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/TT.png"));
        tt.setIcon(bgurl18);
        validate();

        panel4.add(tt);
        //#######Cofres###################################

        w1 = new JLabel();
        w1.setBounds(190, 400, 185, 185);
        validate();
        w1.setVisible(false);
        panel4.add(w1);

        w2 = new JLabel();
        w2.setBounds(850, 400, 185, 185);
        validate();
        w2.setVisible(false);

        panel4.add(w2);

        JLabel bg3 = new JLabel();
        bg3.setBounds(0, 0, 1280, 900);
        ImageIcon bgurl9 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/arena.png"));
        bg3.setIcon(bgurl9);
        validate();

        panel4.add(bg3);


        frm4.setVisible(true);


        JOptionPane.showMessageDialog(null, "Lets play Looking for the Treasure!! \n Find a Magic Treasure to Win!!\n Dig to find Treasures!!  \n 3, 2, 1 Dig!! \n Enjoy!");
        player += 1;
        JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
        turnos();
    }
/**
        * turnos
     * Este metodo permite crear un sistema de turns dentro del minijuego
     *
             * @author Mauricio C.
            */
    public void turnos(){
        for (int i = 0; i < Jmain.getInstance().getPlayerList().getLength(); i++) {

            while (turno == false) {
                if (Jmain.getInstance().getPlayerList().getPos(i) == Jmain.getInstance().getPlayerList().getPos(0)) {
                    jugandoahora = (Player) Jmain.getInstance().getPlayerList().getPos(0);
                }else{
                    return;
                }
            }
            while (turno == true) {
                if (Jmain.getInstance().getPlayerList().getPos(i) == Jmain.getInstance().getPlayerList().getPos(1)) {
                    jugandoahora = (Player) Jmain.getInstance().getPlayerList().getPos(1);
                }else{
                    return;
                }
            }

        }
    }


    /**
     * actionPerformed
     * Este metodo abstracto del actionlistener permite darle las funcionalidades a los botones
     *
     * @author Mauricio C.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        path1 = "/Minijuegos/LFTT/1st.png";
        path2 = "/Minijuegos/LFTT/2do.png";


        if (num == 1) {
            if (e.getSource() == btn1dig) {
                System.out.println("Estoy escavando un tesoro");
                System.out.println("Tesoro 1 Encontrado");
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path1));
                w1.setIcon(bgurl30);

                if (player == 3) {

                    JOptionPane.showMessageDialog(null, "Ganan");
                } else {

                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    if (turno == false) {
                        jugandoahora.monedas += 50;
                        turno = true;
                    } else {
                        jugandoahora.monedas += 50;
                        turno = false;
                    }


                }
            }
            if (e.getSource() == btn2dig) {
                System.out.println("Estoy escavando un tesoro");
                System.out.println("Tesoro 2 Encontrado");
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl31 = new ImageIcon(getClass().getResource(path2));
                w2.setIcon(bgurl31);

                if (player == 3) {

                    JOptionPane.showMessageDialog(null, "Ganan");
                } else {

                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    if (turno == false) {
                        jugandoahora.monedas += 30;
                        turno = true;
                    } else {
                        jugandoahora.monedas += 30;
                        turno = false;
                    }
                }

            }

        }
        if (num == 2) {

            if (e.getSource() == btn1dig) {
                System.out.println("Estoy escavando un tesoro");
                System.out.println("Tesoro 1 Encontrado");
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path2));
                w1.setIcon(bgurl32);

                if (player == 3) {

                    JOptionPane.showMessageDialog(null, "Ganan");
                } else {

                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    if (turno == false) {
                        jugandoahora.monedas += 30;
                        turno = true;
                    } else {
                        jugandoahora.monedas += 30;
                        turno = false;
                    }

                }

                if (e.getSource() == btn2dig) {
                    System.out.println("Estoy escavando un tesoro");
                    System.out.println("Tesoro 2 Encontrado");
                    w2.setVisible(true);
                    player += 1;
                    ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path1));
                    w2.setIcon(bgurl33);

                    if (player == 3) {

                        JOptionPane.showMessageDialog(null, "Ganan");
                    } else {

                        JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                        if (turno == false) {
                            jugandoahora.monedas += 50;
                            turno = true;
                        } else {
                            jugandoahora.monedas += 50;
                            turno = false;
                        }

                    }
                }
            }


        }
    }
}
