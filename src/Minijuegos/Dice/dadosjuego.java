package Minijuegos.Dice;

import javax.swing.*;
import java.awt.*;

public class dadosjuego extends JFrame {
    JButton boton2,boton3,boton4;
    JLabel start1;

    public dadosjuego() {
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 150));
        this.setTitle("DICE GAME!");
        this.setResizable(false);
        Container container = this.getContentPane();
        container.setLayout(null);
        start1 = new JLabel("PLEASE SELECT THE AMOUNT OF PLAYERS FOR THE GAME");

        start1.setFont(new Font("Serif", Font.BOLD, 14));

        boton2 = new JButton("2 PLAYERS");
        boton3 = new JButton("3 PLAYERS");
        boton4 = new JButton("4 PLAYERS");
        start1.setBounds(48, 10, 400, 14);

        boton2.setBounds(65, 40, 100, 50);
        boton3.setBounds(195, 40, 100, 50);
        boton4.setBounds(325, 40, 100, 50);

        container.add(start1);
        container.add(boton2);
        container.add(boton3);
        container.add(boton4);

        this.pack();
        this.setVisible(true);

    }








    public static void main(String[] args) {
        new dadosjuego();
    }
}