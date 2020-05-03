package Juego;
import Dados.Dados;
import Market.market;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jmain extends JFrame implements ActionListener {

    public JFrame frm2;
    public JLabel bg2,cnp1,cnp2,cnp3,cnp4,str1,str2,str3,str4,round,pgame;
    public JButton btnmkt, btndados;

    public Jmain() {
        //############################Frame###############################
        frm2 = new JFrame("Datos Party 1");
        frm2.setBounds(0, 0, 1295, 947);
        frm2.setTitle("Datos Party 1");
        frm2.setLocationRelativeTo(null);
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //############################Panel###############################
        JPanel panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setSize(1330, 947);
        frm2.add(panel4);

        //############################Botones###############################
        btnmkt = new JButton();
        btnmkt.setBounds(1184, 811, 80, 80);
        ImageIcon btnurl7 = new ImageIcon(getClass().getResource("/Juego/carrito.png"));
        btnmkt.setIcon(btnurl7);
        btnmkt.setBorderPainted(false);
        btnmkt.setContentAreaFilled(false);
        btnmkt.setOpaque(false);
        btnmkt.addActionListener(this);

        panel4.add(btnmkt);


        btndados = new JButton("TIRAR DADOS");
        btndados.setBounds(870, 700, 385, 82);
        ImageIcon btnurl12 = new ImageIcon(getClass().getResource("/Juego/roll.png"));
        btndados.setIcon(btnurl12);
        btndados.addActionListener(this);

        panel4.add(btndados);

        //############################Labels###############################

        //##Coins##
        cnp1 = new JLabel("0");
        cnp1.setFont(new Font("Serif",Font.BOLD,24));
        cnp1.setForeground(Color.WHITE);
        cnp1.setBounds(132,690,150,40);
        panel4.add(cnp1);




        //##Stars##




        bg2 = new JLabel();
        bg2.setBounds(0, 0, 1280, 900);
        ImageIcon bgurl1 = new ImageIcon(getClass().getResource("/Juego/Jfondo.png"));
        bg2.setIcon(bgurl1);
        validate();

        panel4.add(bg2);

        frm2.setVisible(true);


    }


    public static void main(String args[]) {
        Jmain start = new Jmain();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnmkt) {
            System.out.println("Abriendo Market");
            System.out.println("Market abierto");
            market prueba1 = new market();


        }

        if (e.getSource() == btndados) {
            System.out.println("Se estan tirando los dados");
            System.out.println("Dados tirados");
            Dados prueba2 = new Dados();


        }
    }
}

