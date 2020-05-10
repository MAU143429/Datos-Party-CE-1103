package Juego;

import Minijuegos.Runner.Runner2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DS extends JFrame implements ActionListener {
    private JButton btnckr, btndice, btnlftt, btnrps, btnrun, btnttt;
    private JFrame frm6;
    private JLabel bg6;

    public DS() {
        frm6 = new JFrame();
        frm6.setBounds(0, 0, 470, 720);
        frm6.setTitle("DUELS");
        frm6.setLocationRelativeTo(null);
        frm6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setSize(470, 800);
        frm6.add(panel5);

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
        panel5.add(btnckr);

        btndice.setBounds(80, 200, 300, 70);
        ImageIcon btnurl24 = new ImageIcon(getClass().getResource("/Juego/btndice.png"));
        btndice.addActionListener(this);
        btndice.setIcon(btnurl24);
        panel5.add(btndice);

        btnlftt.setBounds(80, 300, 300, 70);
        ImageIcon btnurl25 = new ImageIcon(getClass().getResource("/Juego/btnlftt.png"));
        btnlftt.addActionListener(this);
        btnlftt.setIcon(btnurl25);
        panel5.add(btnlftt);

        btnrun.setBounds(80, 500, 300, 70);
        ImageIcon btnurl27 = new ImageIcon(getClass().getResource("/Juego/btnrun.png"));
        btnrun.addActionListener(this);
        btnrun.setIcon(btnurl27);
        panel5.add(btnrun);

        btnrps.setBounds(80, 400, 300, 70);
        ImageIcon btnurl26 = new ImageIcon(getClass().getResource("/Juego/btnrps.png"));
        btnrps.addActionListener(this);
        btnrps.setIcon(btnurl26);
        panel5.add(btnrps);

        btnttt.setBounds(80, 600, 300, 70);
        ImageIcon btnurl28 = new ImageIcon(getClass().getResource("/Juego/btnttt.png"));
        btnttt.addActionListener(this);
        btnttt.setIcon(btnurl28);
        panel5.add(btnttt);

        //btn.setBounds(80, 100, 300, 70);
        //ImageIcon btnurl29 = new ImageIcon(getClass().getResource("/Juego/btn.png"));
        //btn.addActionListener(this);
        // btn.setIcon(btnurl29);
        // panel4.add(btn);

        //#######################Labels##################################################
        bg6 = new JLabel();
        bg6.setBounds(0, 0, 520, 720);
        ImageIcon bgurl1 = new ImageIcon(getClass().getResource("/Juego/dfondo.png"));
        bg6.setIcon(bgurl1);
        validate();

        panel5.add(bg6);


        frm6.setVisible(true);
        JOptionPane.showMessageDialog(null, "Duels!! \n Select a game to continue!\n Play and win coins! \n Enjoy!");

    }


    public static void main(String args[]) {

        DS window5 = new DS();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnckr) {
            System.out.println("Abriendo Minijuego Clicker");
            frm6.setVisible(false);
        }
        if (e.getSource() == btndice) {
            System.out.println("Abriendo Minijuego Dice");
            frm6.setVisible(false);
        }
        if (e.getSource() == btnlftt) {
            System.out.println("Abriendo Minijuego Looking for the Treasure");
            frm6.setVisible(false);
        }
        if (e.getSource() == btnrun) {
            System.out.println("Abriendo Minijuego Runner");
            Runner2 corer1 = new Runner2();
            frm6.setVisible(false);
        }
        //if (e.getSource() == btn) {
        // System.out.println("Abriendo Minijuego Rock Paper Scissors");
        // frm5.setVisible(false);
        //}
        if (e.getSource() == btnrps) {
            System.out.println("Abriendo MiniDuelo Rock Paper Scissors");
            frm6.setVisible(false);
        }
        if (e.getSource() == btnttt) {
            System.out.println("Abriendo MiniDuelo Tic Tac Toe");
            frm6.setVisible(false);
        }
    }
}