package Juego;


import Minijuegos.Clicker.SG1;
import Minijuegos.Dice.SG2;
import Minijuegos.LFTT.SG3;
import Minijuegos.Runner.SG5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * MGS
 *Esta clase es la que ejecuta la ventana para la eleccion del minijuego
 *@author Mauricio C.

 */
public class MGS extends JFrame implements ActionListener {


    private JButton btnckr, btndice, btnlftt, btnrun,btn;
    private JFrame frm5;
    private JLabel bg5;

    /**
     * MGS
     *Este constructor crea un frame, un panel y aloja objetos en ellos
     *@author Mauricio C.
     *

     */
    public MGS() {


        frm5 = new JFrame();
        frm5.setBounds(0, 0, 470, 720);
        frm5.setTitle("MiniGames");
        frm5.setLocationRelativeTo(null);
        frm5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setSize(470, 800);
        frm5.add(panel4);

        //############################Botones###############################################
        btnckr = new JButton();
        btndice = new JButton();
        btnlftt = new JButton();
        btnrun = new JButton();
        btn = new JButton();


        btnckr.setBounds(80, 130, 300, 70);
        ImageIcon btnurl23 = new ImageIcon(getClass().getResource("/Juego/btnckr.png"));
        btnckr.addActionListener(this);
        btnckr.setIcon(btnurl23);
        panel4.add(btnckr);

        btndice.setBounds(80, 250, 300, 70);
        ImageIcon btnurl24 = new ImageIcon(getClass().getResource("/Juego/btndice.png"));
        btndice.addActionListener(this);
        btndice.setIcon(btnurl24);
        panel4.add(btndice);

        btnlftt.setBounds(80, 400, 300, 70);
        ImageIcon btnurl25 = new ImageIcon(getClass().getResource("/Juego/btnlftt.png"));
        btnlftt.addActionListener(this);
        btnlftt.setIcon(btnurl25);
        panel4.add(btnlftt);

        btnrun.setBounds(80, 520, 300, 70);
        ImageIcon btnurl27 = new ImageIcon(getClass().getResource("/Juego/btnrun.png"));
        btnrun.addActionListener(this);
        btnrun.setIcon(btnurl27);
        panel4.add(btnrun);


        //#######################Labels##################################################
        bg5 = new JLabel();
        bg5.setBounds(0, 0, 520, 720);
        ImageIcon bgurl1 = new ImageIcon(getClass().getResource("/Juego/fmn.png"));
        bg5.setIcon(bgurl1);
        validate();

        panel4.add(bg5);


        frm5.setVisible(true);
        JOptionPane.showMessageDialog(null, "MiniGames!! \n Select a game to continue!\n Play and win coins! \n Enjoy!");

    }

    /**
     * actionPerformed
     *Este metodo abstracto del actionlistener permite darle las funcionalidades a los botones
     *@author Mauricio C.

     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnckr) {
            System.out.println("Abriendo Minijuego Clicker");
            frm5.setVisible(false);
            SG1 correr4 = new SG1();
        }
        if (e.getSource() == btndice) {
            System.out.println("Abriendo Minijuego Dice");
            frm5.setVisible(false);
            SG2 correr5 = new SG2();
        }
        if (e.getSource() == btnlftt) {
            System.out.println("Abriendo Minijuego Looking for the Treasure");
            frm5.setVisible(false);
            SG3 correr6 = new SG3();
        }
        if (e.getSource() == btnrun) {
            System.out.println("Abriendo Minijuego Runner");
            frm5.setVisible(false);
            SG5 correr7 = new SG5();
        }

    }
}