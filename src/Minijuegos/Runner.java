package Minijuegos;

import Inicio.Window;
import Juego.Jmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Runner extends JFrame {

        private JFrame frm3;
        private JLabel jugador1, jugador2, jugador3, jugador4, text1, text2, text3, text4;


        public Runner () {
            frm3 = new JFrame("Runners");
            frm3.setBounds(0, 0, 1280, 900);
            frm3.setLocationRelativeTo(null);
            frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel3 = new JPanel();
            panel3.setLayout(null);
            panel3.setSize(1280,900);
            frm3.add(panel3);



            jugador1 = new JLabel();
            jugador1.setBounds(146,485,50,50);
            ImageIcon bgurlp1 = new ImageIcon(getClass().getResource("/Minijuegos/P1.png"));
            jugador1.setIcon(bgurlp1);
            validate();

            panel3.add(jugador1);

            jugador2 = new JLabel();
            jugador2.setBounds(146,535,50,50);
            ImageIcon bgurlp2 = new ImageIcon(getClass().getResource("/Minijuegos/P2.png"));
            jugador2.setIcon(bgurlp2);
            validate();

            panel3.add(jugador2);

            jugador3 = new JLabel();
            jugador3.setBounds(146,585,50,50);
            ImageIcon bgurlp3 = new ImageIcon(getClass().getResource("/Minijuegos/P3.png"));
            jugador3.setIcon(bgurlp3);
            validate();

            panel3.add(jugador3);

            jugador4 = new JLabel();
            jugador4.setBounds(146,635,50,50);
            ImageIcon bgurlp4 = new ImageIcon(getClass().getResource("/Minijuegos/P4.png"));
            jugador4.setIcon(bgurlp4);
            validate();

            panel3.add(jugador4);

            text1 = new JLabel(" Mario [A]");
            text1.setFont(new Font("Serif",Font.BOLD,24));
            text1.setForeground(Color.WHITE);
            text1.setBounds(132,690,150,40);
            panel3.add(text1);

            text2 = new JLabel(" Luigi [C]");
            text2.setFont(new Font("Serif",Font.BOLD,24));
            text2.setForeground(Color.WHITE);
            text2.setBounds(310,690,150,40);
            panel3.add(text2);

            text3 = new JLabel(" Toad [N]");
            text3.setFont(new Font("Serif",Font.BOLD,24));
            text3.setForeground(Color.WHITE);
            text3.setBounds(488,690,150,40);
            panel3.add(text3);

            text4 = new JLabel(" Yoshi [K]");
            text4.setFont(new Font("Serif",Font.BOLD,24));
            text4.setForeground(Color.WHITE);
            text4.setBounds(666,690,150,40);
            panel3.add(text4);


            JLabel bg3 = new JLabel();
            bg3.setBounds(0,0,1280,900);
            ImageIcon bgurl3 = new ImageIcon(getClass().getResource("/Minijuegos/pista.png"));
            bg3.setIcon(bgurl3);
            validate();

            panel3.add(bg3);


            frm3.setVisible(true);


            
            JOptionPane.showMessageDialog(null, "Lets play Runners!! \n When you press OK you will see the key bindings for each player! \n 3, 2, 1 RUN!! \n Enjoy!");
        }

        public static void main(String args[]) {

            Runner game1 = new Runner();





        }

}
