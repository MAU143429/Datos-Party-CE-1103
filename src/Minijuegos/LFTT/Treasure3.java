package Minijuegos.LFTT;


import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Treasure3
 *Esta clase es la que ejecuta el minijuego Looking for the Treasure para tres jugadores
 *@author Mauricio C.

 */
public class Treasure3 extends JFrame implements ActionListener {

    private JFrame frm4;
    private JButton btn1dig, btn2dig, btn3dig;
    private JLabel lf, tt, w1, w2, w3;
    private JPanel panel4;
    private int player, num, cont;
    private String path1, path2, path3;
    public Player jugandoahora;

    /**
     * Treasure3
     *Este constructor crea un frame, un panel y aloja objetos en ellos
     *@author Mauricio C.

     */
    public Treasure3() {

        num = (int) (Math.random() * 6) + 1;
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
        btn1dig.setBounds(145, 460, 281, 87);
        ImageIcon btnurl13 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/btndig.png"));
        btn1dig.setIcon(btnurl13);
        btn1dig.addActionListener(this);

        panel4.add(btn1dig);


        btn2dig = new JButton();
        btn2dig.setBounds(800, 460, 281, 87);
        ImageIcon btnurl14 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/btndig.png"));
        btn2dig.setIcon(btnurl14);
        btn2dig.addActionListener(this);

        panel4.add(btn2dig);

        btn3dig = new JButton();
        btn3dig.setBounds(480, 727, 281, 87);
        ImageIcon btnurl15 = new ImageIcon(getClass().getResource("/Minijuegos/LFTT/btndig.png"));
        btn3dig.setIcon(btnurl15);
        btn3dig.addActionListener(this);

        panel4.add(btn3dig);

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
        w1.setBounds(190, 270, 185, 185);
        validate();
        w1.setVisible(false);
        panel4.add(w1);

        w2 = new JLabel();
        w2.setBounds(850, 270, 185, 185);
        validate();
        w2.setVisible(false);

        panel4.add(w2);

        w3 = new JLabel();
        w3.setBounds(520, 535, 185, 185);
        validate();
        w3.setVisible(false);

        panel4.add(w3);



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
        turnos(0);
    }
    /**
     * turnos
     * Este metodo permite crear un sistema de turns dentro del minijuego
     *
     * @author Mauricio C.
     */
    public void turnos(int cont) {


        if (Jmain.getInstance().getPlayerList().getPos(cont) == Jmain.getInstance().getPlayerList().getPos(0)) {
            jugandoahora = (Player) Jmain.getInstance().getPlayerList().getPos(0);

        }

        if (Jmain.getInstance().getPlayerList().getPos(cont) == Jmain.getInstance().getPlayerList().getPos(1)) {
            jugandoahora = (Player) Jmain.getInstance().getPlayerList().getPos(1);


        }
        if (Jmain.getInstance().getPlayerList().getPos(cont) == Jmain.getInstance().getPlayerList().getPos(2)) {
            jugandoahora = (Player) Jmain.getInstance().getPlayerList().getPos(2);


        }
    }


    /**
     * actionPerformed
     *Este metodo abstracto del actionlistener permite darle las funcionalidades a los botones
     *@author Mauricio C.

     */
    @Override
    public void actionPerformed(ActionEvent e) {

        path1 = "/Minijuegos/LFTT/1st.png";
        path2 = "/Minijuegos/LFTT/2do.png";
        path3 = "/Minijuegos/LFTT/3ro.png";


        if (num == 1) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path1));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);



                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path2));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path3));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }
        if (num == 2) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path1));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path3));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path2));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }
        if (num == 3) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path3));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path2));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path1));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }
        if (num == 4) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path2));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path1));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path3));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }
        if (num == 5) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path3));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path1));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path2));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }
        if (num == 6) {
            if (e.getSource() == btn1dig) {
                w1.setVisible(true);
                player += 1;
                ImageIcon bgurl30 = new ImageIcon(getClass().getResource(path2));
                w1.setIcon(bgurl30);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);
                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 30;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }



            if (e.getSource() == btn2dig) {
                w2.setVisible(true);
                player += 1;
                ImageIcon bgurl32 = new ImageIcon(getClass().getResource(path3));
                w2.setIcon(bgurl32);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 10;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
            if (e.getSource() == btn3dig) {
                w3.setVisible(true);
                player += 1;
                ImageIcon bgurl33 = new ImageIcon(getClass().getResource(path1));
                w3.setIcon(bgurl33);
                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    frm4.setVisible(false);

                }
                if (player < 4) {
                    JOptionPane.showMessageDialog(null, "Turno del Jugador" + " " + player);
                    jugandoahora.monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    cont++;
                    turnos(cont);


                }
            }
        }


    }
}