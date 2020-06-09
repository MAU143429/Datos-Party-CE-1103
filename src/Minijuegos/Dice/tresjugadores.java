package Minijuegos.Dice;
import Juego.Jmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tresjugadores extends JFrame{
    JLabel dado1,dado12,dado2,dado22,dado3,dado32,titulo1,titulo2,fondo,jug1,jug2,jug3,foto1,foto2,foto3;
    JButton tirar1,tirar2,tirar3;
    ImageIcon imgboton,uno,dos,tres,cuatro,cinco,seis;
    int tiro1,tiro2,tiro3,tiro4,tiro5,tiro6;
    int suma1 = 0;
    int suma2 = 0;
    int suma3 = 0;
    String winner,second,third = "";


    public tresjugadores(){
        this.setBounds(100, 100, 900, 900);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1050, 550));
        this.setTitle("DICE GAME!");
        this.setResizable(false);
        Container container = this.getContentPane();
        container.setLayout(null);

        fondo = new JLabel();
        titulo1 = new JLabel();
        titulo2 = new JLabel();
        dado1 = new JLabel();
        dado12 = new JLabel();
        dado2 = new JLabel();
        dado22 = new JLabel();
        dado3 = new JLabel();
        dado32 = new JLabel();
        jug1 = new JLabel();
        jug2 = new JLabel();
        jug3 = new JLabel();
        foto1 = new JLabel();
        foto2 = new JLabel();
        foto3 = new JLabel();

        ImageIcon ifondo = new ImageIcon(getClass().getResource("/Minijuegos/Dice/fondo_juego_dados.png"));
        ImageIcon ititulo1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/good.png"));
        ImageIcon ititulo2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/luck.png"));
        ImageIcon idado1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado12 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon idado2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado22 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon idado3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado32 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon ijug1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/mario.png"));
        ImageIcon ijug2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/luigi.png"));
        ImageIcon ijug3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/toad.png"));
        ImageIcon ifoto1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P1.png"));
        ImageIcon ifoto2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P2.png"));
        ImageIcon ifoto3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P3.png"));

        fondo.setIcon(ifondo);
        titulo1.setIcon(ititulo1);
        titulo2.setIcon(ititulo2);
        dado1.setIcon(idado1);
        dado12.setIcon(idado12);
        dado2.setIcon(idado2);
        dado22.setIcon(idado22);
        dado3.setIcon(idado3);
        dado32.setIcon(idado32);
        jug1.setIcon(ijug1);
        jug2.setIcon(ijug2);
        jug3.setIcon(ijug3);
        foto1.setIcon(ifoto1);
        foto2.setIcon(ifoto2);
        foto3.setIcon(ifoto3);

        tirar1 = new JButton("TIRAR1");
        tirar2 = new JButton("TIRAR2");
        tirar3 = new JButton("TIRAR3");

        tirar1.setBorderPainted(false);
        tirar1.setContentAreaFilled(false);
        tirar1.setOpaque(false);
        tirar2.setBorderPainted(false);
        tirar2.setContentAreaFilled(false);
        tirar2.setOpaque(false);
        tirar3.setBorderPainted(false);
        tirar3.setContentAreaFilled(false);
        tirar3.setOpaque(false);

        imgboton = new ImageIcon(getClass().getResource("throw.png"));

        uno = new ImageIcon(getClass().getResource("/Minijuegos/Dice/1.png"));
        dos = new ImageIcon(getClass().getResource("/Minijuegos/Dice/2.png"));
        tres = new ImageIcon(getClass().getResource("/Minijuegos/Dice/3.png"));
        cuatro = new ImageIcon(getClass().getResource("/Minijuegos/Dice/4.png"));
        cinco = new ImageIcon(getClass().getResource("/Minijuegos/Dice/5.png"));
        seis = new ImageIcon(getClass().getResource("/Minijuegos/Dice/6.png"));

        tirar1.setIcon(imgboton);
        tirar2.setIcon(imgboton);
        tirar3.setIcon(imgboton);

        fondo.setBounds(0,0,1050,656);
        titulo1.setBounds(320,50,186,52);
        titulo2.setBounds(520,50,187,55);
        dado1.setBounds(60,300,100,100);
        dado12.setBounds(170,300,100,100);
        dado2.setBounds(400,300,100,100);
        dado22.setBounds(510,300,100,100);
        dado3.setBounds(740,300,100,100);
        dado32.setBounds(850,300,100,100);
        jug1.setBounds(40,150,301,53);
        jug2.setBounds(410,150,299,53);
        jug3.setBounds(740,150,289,53);
        tirar1.setBounds(40,420,260,52);
        tirar2.setBounds(380,420,260,52);
        tirar3.setBounds(720,420,260,52);
        foto1.setBounds(130,220,50,50);
        foto2.setBounds(475,220,50,50);
        foto3.setBounds(810,220,50,50);

        container.add(titulo1);
        container.add(titulo2);
        container.add(dado1);
        container.add(dado12);
        container.add(dado2);
        container.add(dado22);
        container.add(dado3);
        container.add(dado32);
        container.add(jug1);
        container.add(jug2);
        container.add(jug3);
        container.add(tirar1);
        container.add(tirar2);
        container.add(tirar3);
        container.add(foto1);
        container.add(foto2);
        container.add(foto3);
        container.add(fondo);

        tirar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(command.equals("TIRAR1")){
                    tiro1 = (int)(Math.random()*6)+1;
                    tiro2 = (int)(Math.random()*6)+1;
                    System.out.println(tiro1);
                    System.out.println(tiro2);
                    if(tiro1==1){
                        dado1.setIcon(uno);
                    }
                    if(tiro1==2){
                        dado1.setIcon(dos);
                    }
                    if(tiro1==3){
                        dado1.setIcon(tres);
                    }
                    if(tiro1==4){
                        dado1.setIcon(cuatro);
                    }
                    if(tiro1==5){
                        dado1.setIcon(cinco);
                    }
                    if(tiro1==6){
                        dado1.setIcon(seis);
                    }
                    if(tiro2==1){
                        dado12.setIcon(uno);
                    }
                    if(tiro2==2){
                        dado12.setIcon(dos);
                    }
                    if(tiro2==3){
                        dado12.setIcon(tres);
                    }
                    if(tiro2==4){
                        dado12.setIcon(cuatro);
                    }
                    if(tiro2==5){
                        dado12.setIcon(cinco);
                    }
                    if(tiro2==6){
                        dado12.setIcon(seis);
                    }
                    tirar1.setEnabled(false);
                    suma1 = tiro1 + tiro2;
                    System.out.println(suma1);
                }
            }
        });
        tirar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(command.equals("TIRAR2")){
                    tiro3 = (int)(Math.random()*6)+1;
                    tiro4 = (int)(Math.random()*6)+1;
                    System.out.println(tiro3);
                    System.out.println(tiro4);
                    if(tiro3==1){
                        dado2.setIcon(uno);
                    }
                    if(tiro3==2){
                        dado2.setIcon(dos);
                    }
                    if(tiro3==3){
                        dado2.setIcon(tres);
                    }
                    if(tiro3==4){
                        dado2.setIcon(cuatro);
                    }
                    if(tiro3==5){
                        dado2.setIcon(cinco);
                    }
                    if(tiro3==6){
                        dado2.setIcon(seis);
                    }
                    if(tiro4==1){
                        dado22.setIcon(uno);
                    }
                    if(tiro4==2){
                        dado22.setIcon(dos);
                    }
                    if(tiro4==3){
                        dado22.setIcon(tres);
                    }
                    if(tiro4==4){
                        dado22.setIcon(cuatro);
                    }
                    if(tiro4==5){
                        dado22.setIcon(cinco);
                    }
                    if(tiro4==6){
                        dado22.setIcon(seis);
                    }
                    tirar2.setEnabled(false);
                    suma2 = tiro3 + tiro4;
                    System.out.println(suma2);
                }
            }
        });
        tirar3.addActionListener(e -> {
            String command = e.getActionCommand();
            if(command.equals("TIRAR3")){
                tiro5 = (int)(Math.random()*6)+1;
                tiro6 = (int)(Math.random()*6)+1;
                System.out.println(tiro5);
                System.out.println(tiro6);
                if(tiro5==1){
                    dado3.setIcon(uno);
                }
                if(tiro5==2){
                    dado3.setIcon(dos);
                }
                if(tiro5==3){
                    dado3.setIcon(tres);
                }
                if(tiro5==4){
                    dado3.setIcon(cuatro);
                }
                if(tiro5==5){
                    dado3.setIcon(cinco);
                }
                if(tiro5==6){
                    dado3.setIcon(seis);
                }
                if(tiro6==1){
                    dado32.setIcon(uno);
                }
                if(tiro6==2){
                    dado32.setIcon(dos);
                }
                if(tiro6==3){
                    dado32.setIcon(tres);
                }
                if(tiro6==4){
                    dado32.setIcon(cuatro);
                }
                if(tiro6==5){
                    dado32.setIcon(cinco);
                }
                if(tiro6==6){
                    dado32.setIcon(seis);
                }
                tirar3.setEnabled(false);
                suma3 = tiro5 + tiro6;
                System.out.println(suma3);

                if(suma1>suma2){
                    if(suma1>suma3){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 50;
                        Jmain.getInstance().actualizarLabels();
                        winner = "Mario";
                        if(suma2>suma3){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            second = "Luigi";
                            third = "Toad";
                        }
                        else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                            second = "Luigi";
                            third = "Toad";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }
                if(suma2>suma1){
                    if(suma2>suma3){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 50;
                        Jmain.getInstance().actualizarLabels();
                        winner = "Luigi";
                        if(suma1>suma3) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            second = "Mario";
                            third = "Toad";
                        }
                        else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                            second = "Toad";
                            third = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }
                if(suma3>suma1){
                    if(suma3>suma2){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 50;
                        Jmain.getInstance().actualizarLabels();
                        winner = "Toad";
                        if(suma2>suma1) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            second = "Luigi";
                            third = "Mario";
                        }
                        else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                            second = "Mario";
                            third = "Luigi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }

                JOptionPane.showMessageDialog(null,"SCORES: "+ "\nMario: " +  suma1 + "\nLuigi: " + suma2 + "\nToad: "+suma3+"\n\nSTANDINGS: " + "\n 1° PLACE: " + winner + "\n 2° PLACE: " + second + "\n 3° PLACE: "+third);
                setVisible(false);
                dispose();

            }
        });


        this.pack();
        this.validate();
        this.setVisible(true);
    }
}
