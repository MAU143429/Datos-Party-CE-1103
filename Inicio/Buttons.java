package Inicio;

import javax.swing.*;
import java.awt.event.*;

public class Buttons extends JFrame implements ActionListener{

    private JButton btn2p,btn3p,btn4p;
    public Buttons(){

        setLayout(null);
        btn2p=new JButton("2P");
        btn2p.setBounds(960,534,90,30);
        add(btn2p);
        btn2p.addActionListener(this);
        btn3p=new JButton("3P");
        btn3p.setBounds(960,667,90,30);
        add(btn3p);
        btn3p.addActionListener(this);
        btn4p=new JButton("4P");
        btn4p.setBounds(960,791,90,30);
        add(btn4p);
        btn4p.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        int players;
        if (e.getSource()==btn2p) {
            System.out.println("Jugaran 2 jugadores");
            players = 2;
            System.out.println(players+ " Jugadores Jugando ahora");
            System.exit(0);

        }
        if (e.getSource()==btn3p) {
            System.out.println("Jugaran 2 jugadores");
            players = 3;
            System.out.println(players + " Jugadores Jugando ahora");
            System.exit(0);

        }
        if (e.getSource()==btn4p) {
            System.out.println("Jugaran 2 jugadores");
            players = 4;
            System.out.println(players+ " Jugadores Jugando ahora");
            System.exit(0);
        }
    }
}
