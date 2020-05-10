package Juego;


import Minijuegos.Runner.Runner2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MGS extends JFrame implements ActionListener {


    private JButton btnckr, btndice, btnlftt, btnrps, btnrun, btnttt;
    private JFrame frm5;
    private JLabel bg5;


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
        btnrps = new JButton();
        btnrun = new JButton();
        btnttt = new JButton();
        //btn = new JButton();



        btnckr.setBounds(80, 100, 300, 70);
        ImageIcon btnurl23 = new ImageIcon(getClass().getResource("/Juego/btnckr.png"));
        btnckr.addActionListener(this);
        btnckr.setIcon(btnurl23);
        panel4.add(btnckr);

        btndice.setBounds(80, 200, 300, 70);
        ImageIcon btnurl24 = new ImageIcon(getClass().getResource("/Juego/btndice.png"));
        btndice.addActionListener(this);
        btndice.setIcon(btnurl24);
        panel4.add(btndice);

        btnlftt.setBounds(80, 300, 300, 70);
        ImageIcon btnurl25 = new ImageIcon(getClass().getResource("/Juego/btnlftt.png"));
        btnlftt.addActionListener(this);
        btnlftt.setIcon(btnurl25);
        panel4.add(btnlftt);

        btnrun.setBounds(80, 500, 300, 70);
        ImageIcon btnurl27 = new ImageIcon(getClass().getResource("/Juego/btnrun.png"));
        btnrun.addActionListener(this);
        btnrun.setIcon(btnurl27);
        panel4.add(btnrun);

        btnrps.setBounds(80, 400, 300, 70);
        ImageIcon btnurl26 = new ImageIcon(getClass().getResource("/Juego/btnrps.png"));
        btnrps.addActionListener(this);
        btnrps.setIcon(btnurl26);
        panel4.add(btnrps);

        btnttt.setBounds(80, 600, 300, 70);
        ImageIcon btnurl28 = new ImageIcon(getClass().getResource("/Juego/btnttt.png"));
        btnttt.addActionListener(this);
        btnttt.setIcon(btnurl28);
        panel4.add(btnttt);

        //btn.setBounds(80, 100, 300, 70);
        //ImageIcon btnurl29 = new ImageIcon(getClass().getResource("/Juego/btn.png"));
        //btn.addActionListener(this);
       // btn.setIcon(btnurl29);
       // panel4.add(btn);

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


    public static void main(String args[]) {

        MGS window4 = new MGS();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnckr) {
            System.out.println("Abriendo Minijuego Clicker");
            frm5.setVisible(false);
        }
        if (e.getSource() == btndice) {
                System.out.println("Abriendo Minijuego Dice");
            frm5.setVisible(false);
        }
        if (e.getSource() == btnlftt) {
            System.out.println("Abriendo Minijuego Looking for the Treasure");
            frm5.setVisible(false);
        }
        if (e.getSource() == btnrun) {
            System.out.println("Abriendo Minijuego Runner");
            Runner2 corer1 = new Runner2();
            frm5.setVisible(false);
        }
        //if (e.getSource() == btn) {
           // System.out.println("Abriendo Minijuego Rock Paper Scissors");
           // frm5.setVisible(false);
        //}
        if (e.getSource() == btnrps) {
            System.out.println("Abriendo MiniDuelo Rock Paper Scissors");
            frm5.setVisible(false);
        }
        if (e.getSource() == btnttt) {
            System.out.println("Abriendo MiniDuelo Tic Tac Toe");
            frm5.setVisible(false);
        }
    }
}