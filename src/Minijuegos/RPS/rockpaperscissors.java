package Minijuegos.RPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Field;

/**
 * rockpaperscissors
 * Esta clase crea el minijuego de dos personas rockpaperscissors
 * @author Jose A.
 */
public class rockpaperscissors extends JFrame {
    JLabel background,title,player1,player2,versus,scissors1,scissors2,paper1,paper2,rock1,rock2,bind1,bind2,bind3,binda,bindb,bindc;
    JButton boton;
    int Sel1 = 0;
    int Sel2 = 0;
    String pl1,pl2;
    JTextField campotexto1,campotexto2;

    /**
     * rockpaperscissors
     * Constructor de la clase rockpaperscissors en donde se colocan todos los elementos gráficos
     * @author Jose A.
     */
    public rockpaperscissors(){
        this.setBounds(100,100,1000,533);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000,533));
        this.setTitle("ROCK - PAPER - SCISSORS!");

        Container container = this.getContentPane();
        container.setLayout(null);


        background = new JLabel();
        title = new JLabel();
        player1 = new JLabel();
        player2 = new JLabel();
        versus = new JLabel();
        rock1 = new JLabel();
        rock2 = new JLabel();
        paper1 = new JLabel();
        paper2 = new JLabel();
        scissors1 = new JLabel();
        scissors2 = new JLabel();
        campotexto1 = new JTextField();


        ImageIcon ibackground = new ImageIcon(getClass().getResource("/Minijuegos/RPS/fondo.png"));
        ImageIcon ititle= new ImageIcon(getClass().getResource("/Minijuegos/RPS/titulo.png"));
        ImageIcon iplayer1 = new ImageIcon(getClass().getResource("/Minijuegos/RPS/player1.png"));
        ImageIcon iplayer2 = new ImageIcon(getClass().getResource("/Minijuegos/RPS/player2.png"));
        ImageIcon iversus = new ImageIcon(getClass().getResource("/Minijuegos/RPS/vs.png"));
        ImageIcon irock = new ImageIcon(getClass().getResource("/Minijuegos/RPS/piedra.png"));
        ImageIcon ipaper = new ImageIcon(getClass().getResource("/Minijuegos/RPS/papel.png"));
        ImageIcon iscissors = new ImageIcon(getClass().getResource("/Minijuegos/RPS/tijera.png"));

        background.setIcon(ibackground);
        title.setIcon(ititle);
        player1.setIcon(iplayer1);
        player2.setIcon(iplayer2);
        versus.setIcon(iversus);
        rock1.setIcon(irock);
        rock2.setIcon(irock);
        paper1.setIcon(ipaper);
        paper2.setIcon(ipaper);
        scissors1.setIcon(iscissors);
        scissors2.setIcon(iscissors);

        boton = new JButton("RESULT");

        bind1 = new JLabel("[A]");
        bind1.setFont(new Font("Serif",Font.BOLD,24));
        bind1.setForeground(Color.WHITE);

        bind2 = new JLabel("[S]");
        bind2.setFont(new Font("Serif",Font.BOLD,24));
        bind2.setForeground(Color.WHITE);

        bind3 = new JLabel("[D]");
        bind3.setFont(new Font("Serif",Font.BOLD,24));
        bind3.setForeground(Color.WHITE);

        binda = new JLabel("[J]");
        binda.setFont(new Font("Serif",Font.BOLD,24));
        binda.setForeground(Color.WHITE);

        bindb = new JLabel("[K]");
        bindb.setFont(new Font("Serif",Font.BOLD,24));
        bindb.setForeground(Color.WHITE);

        bindc = new JLabel("[L]");
        bindc.setFont(new Font("Serif",Font.BOLD,24));
        bindc.setForeground(Color.WHITE);

        background.setBounds(0,0,1000,533);
        title.setBounds(100,15,767,63);
        player1.setBounds(100,180,301,53);
        player2.setBounds(600,180,299,53);
        versus.setBounds(450,180,106,52);
        rock1.setBounds(65,250,119,119);
        rock2.setBounds(570,250,119,119);
        paper1.setBounds(184,250,119,119);
        paper2.setBounds(689,250,119,119);
        scissors1.setBounds(303,250,119,119);
        scissors2.setBounds(808,250,119,119);
        bind1.setBounds(105,360,60,60);
        bind2.setBounds(224,360,60,60);
        bind3.setBounds(343,360,60,60);
        binda.setBounds(610,360,60,60);
        bindb.setBounds(729,360,60,60);
        bindc.setBounds(848,360,60,60);
        boton.setBounds(436,250,119,119);
        campotexto1.setBounds(     0,  0,1,1);

        container.add(title);
        container.add(boton);

        container.add(campotexto1);

        container.add(bind1);
        container.add(bind2);
        container.add(bind3);
        container.add(binda);
        container.add(bindb);
        container.add(bindc);
        container.add(player1);
        container.add(player2);
        container.add(versus);
        container.add(rock1);
        container.add(rock2);
        container.add(paper1);
        container.add(paper2);
        container.add(scissors1);
        container.add(scissors2);
        container.add(background);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(command.equals("RESULT")) {
                    if(Sel1 == 1){
                        if(Sel2 == 1){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nIT'S A DRAW!");
                        }
                        if(Sel2 == 2){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 2 WINS!");
                        }
                        if(Sel2 == 3){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 1 WINS!");
                        }
                    }
                    if(Sel1 == 2){
                        if(Sel2 == 1){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 1 WINS!");
                        }
                        if(Sel2 == 2){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nIT'S A DRAW!");
                        }
                        if(Sel2 == 3){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 2 WINS!");
                        }
                    }
                    if(Sel1 == 3){
                        if(Sel2 == 1){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 2 WINS!");
                        }
                        if(Sel2 == 2){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nPLAYER 1 WINS!");
                        }
                        if(Sel2 == 3){
                            JOptionPane.showMessageDialog(null,"PLAYER 1 CHOSE: "+pl1+"\nPLAYER 2 CHOSE: "+pl2+"\nIT'S A DRAW!");
                        }
                    }

                }

            }
        });

        JugadorEscoje oyente1 = new JugadorEscoje();
        campotexto1.addKeyListener(oyente1);
        campotexto1.setForeground(Color.WHITE);
        this.pack();
        this.setVisible(true);

        JOptionPane.showMessageDialog(null,"Lets play Rock, Paper, Scissors! \n When you press OK you will see the key bindings for each player! \n Choose wisely!! \n NO peeking allowed! \n WARNING: DO NOT PRESS RESULT BEFORE BOTH PLAYERS HAVE MADE THEIR PICKS!");




    }

    /**
     * JugadorEscoje
     * Clase que implemente keylistener y funciona para la funcionalidad de los botones
     * @author Jose A.
     */
        class JugadorEscoje implements KeyListener{
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()=='a'){
                    Sel1 = 1;
                    pl1 = "ROCK";
                    JOptionPane.showMessageDialog(null,"HOLA");
                }
                if(e.getKeyChar()=='s'){
                    Sel1 = 2;
                    pl1 = "PAPER";
                }
                if(e.getKeyChar()=='d'){
                    Sel1 = 3;
                    pl1 = "SCISSORS";
                }
                if(e.getKeyChar()=='j'){
                    Sel2 = 1;
                    pl2 = "ROCK";
                }
                if(e.getKeyChar()=='k'){
                    Sel2 = 2;
                    pl2 = "PAPER";
                }
                if(e.getKeyChar()=='l'){
                    Sel2 = 3;
                    pl2 = "SCISSORS";
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }


}