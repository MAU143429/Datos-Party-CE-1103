package Eventos;

import Juego.Jmain;
import Juego.Player;
import EstructurasDatos.SimpleList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class StealCoins extends Evento implements ActionListener {

    public JFrame frmrobar;
    public JButton robado1,robado2,robado3;
    public JLabel bg9;


    @Override
    public void evento(Player player ) {

    }

    @Override
    public void ventanaEvento(Player player) {
        Jmain.getInstance().corriendoJuego = true;

        frmrobar = new JFrame("Robar Monedas");
        frmrobar.setBounds(0, 0, 465, 350);
        frmrobar.setLocationRelativeTo(null);
        frmrobar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel99 = new JPanel();
        panel99.setLayout(null);
        panel99.setSize(600, 410);
        frmrobar.add(panel99);


        robado1 = new JButton();
        robado1.setBounds(280, 89, 50, 50);
        ImageIcon bgurl87 = new ImageIcon(getClass().getResource("/Eventos/r1.png"));
        robado1.setIcon(bgurl87);
        robado1.setBorderPainted(false);
        robado1.setContentAreaFilled(false);
        robado1.setOpaque(false);
        robado1.addActionListener(this);


        panel99.add(robado1);

        robado2 = new JButton();
        robado2.setBounds(380, 89, 50, 50);
        ImageIcon bgurl88 = new ImageIcon(getClass().getResource("/Eventos/r2.png"));
        robado2.setIcon(bgurl88);
        robado2.setBorderPainted(false);
        robado2.setContentAreaFilled(false);
        robado2.setOpaque(false);
        robado2.addActionListener(this);


        panel99.add(robado2);

        robado3 = new JButton();
        robado3.setBounds(330, 160, 50, 50);
        ImageIcon bgurl89 = new ImageIcon(getClass().getResource("/Eventos/r3.png"));
        robado3.setIcon(bgurl89);
        robado3.setBorderPainted(false);
        robado3.setContentAreaFilled(false);
        robado3.setOpaque(false);
        robado3.addActionListener(this);


        panel99.add(robado3);

        bg9 = new JLabel();
        bg9.setBounds(0, 0, 450, 310);
        ImageIcon bgurl90 = new ImageIcon(getClass().getResource("/Eventos/robamonedas.png"));
        bg9.setIcon(bgurl90);


        panel99.add(bg9);


        frmrobar.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
