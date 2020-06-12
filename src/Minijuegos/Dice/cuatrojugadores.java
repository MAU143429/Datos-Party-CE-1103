package Minijuegos.Dice;

import Juego.Jmain;

import javax.swing.*;
import java.awt.*;

public class cuatrojugadores extends JFrame{
    JLabel dado1,dado12,dado2,dado22,dado3,dado32,dado4,dado42,titulo1,titulo2,fondo,jug1,jug2,jug3,jug4,foto1,foto2,foto3,foto4;
    JButton tirar1,tirar2,tirar3,tirar4;
    ImageIcon imgboton,uno,dos,tres,cuatro,cinco,seis;
    int tiro1,tiro2,tiro3,tiro4,tiro5,tiro6,tiro7,tiro8;
    int suma1 = 0;
    int suma2 = 0;
    int suma3 = 0;
    int suma4 = 0;
    String winner,second,third,fourth = "";


    public cuatrojugadores(){
        this.setBounds(10, 10, 1400, 550);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1400, 550));
        this.setTitle("DICE GAME!");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        dado4 = new JLabel();
        dado42 = new JLabel();
        jug1 = new JLabel();
        jug2 = new JLabel();
        jug3 = new JLabel();
        jug4 = new JLabel();
        foto1 = new JLabel();
        foto2 = new JLabel();
        foto3 = new JLabel();
        foto4 = new JLabel();

        ImageIcon ifondo = new ImageIcon(getClass().getResource("/Minijuegos/Dice/fondo_juego_dados.png"));
        ImageIcon ititulo1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/good.png"));
        ImageIcon ititulo2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/luck.png"));
        ImageIcon idado1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado12 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon idado2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado22 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon idado3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado32 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon idado4 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice1.png"));
        ImageIcon idado42 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/dice2.png"));
        ImageIcon ijug1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/mario.png"));
        ImageIcon ijug2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/luigi.png"));
        ImageIcon ijug3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/toad.png"));
        ImageIcon ijug4 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/yoshi.png"));
        ImageIcon ifoto1 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P1.png"));
        ImageIcon ifoto2 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P2.png"));
        ImageIcon ifoto3 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P3.png"));
        ImageIcon ifoto4 = new ImageIcon(getClass().getResource("/Minijuegos/Dice/P4.png"));

        fondo.setIcon(ifondo);
        titulo1.setIcon(ititulo1);
        titulo2.setIcon(ititulo2);
        dado1.setIcon(idado1);
        dado12.setIcon(idado12);
        dado2.setIcon(idado2);
        dado22.setIcon(idado22);
        dado3.setIcon(idado3);
        dado32.setIcon(idado32);
        dado4.setIcon(idado4);
        dado42.setIcon(idado42);
        jug1.setIcon(ijug1);
        jug2.setIcon(ijug2);
        jug3.setIcon(ijug3);
        jug4.setIcon(ijug4);
        foto1.setIcon(ifoto1);
        foto2.setIcon(ifoto2);
        foto3.setIcon(ifoto3);
        foto4.setIcon(ifoto4);

        tirar1 = new JButton("TIRAR1");
        tirar2 = new JButton("TIRAR2");
        tirar3 = new JButton("TIRAR3");
        tirar4 = new JButton("TIRAR4");

        tirar1.setBorderPainted(false);
        tirar1.setContentAreaFilled(false);
        tirar1.setOpaque(false);
        tirar2.setBorderPainted(false);
        tirar2.setContentAreaFilled(false);
        tirar2.setOpaque(false);
        tirar3.setBorderPainted(false);
        tirar3.setContentAreaFilled(false);
        tirar3.setOpaque(false);
        tirar4.setBorderPainted(false);
        tirar4.setContentAreaFilled(false);
        tirar4.setOpaque(false);

        imgboton = new ImageIcon(getClass().getResource("/Minijuegos/Dice/throw.png"));

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/Minijuegos/Dice/fondo_juego_dados.png"));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(1400, 550,  Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        fondo.setIcon(imageIcon);

        uno = new ImageIcon(getClass().getResource("/Minijuegos/Dice/1.png"));
        dos = new ImageIcon(getClass().getResource("/Minijuegos/Dice/2.png"));
        tres = new ImageIcon(getClass().getResource("/Minijuegos/Dice/3.png"));
        cuatro = new ImageIcon(getClass().getResource("/Minijuegos/Dice/4.png"));
        cinco = new ImageIcon(getClass().getResource("/Minijuegos/Dice/5.png"));
        seis = new ImageIcon(getClass().getResource("/Minijuegos/Dice/6.png"));

        tirar1.setIcon(imgboton);
        tirar2.setIcon(imgboton);
        tirar3.setIcon(imgboton);
        tirar4.setIcon(imgboton);


        fondo.setBounds(0,0,1400,550);
        titulo1.setBounds(500,50,186,52);
        titulo2.setBounds(700,50,187,55);
        dado1.setBounds(60,300,100,100);
        dado12.setBounds(170,300,100,100);
        dado2.setBounds(400,300,100,100);
        dado22.setBounds(510,300,100,100);
        dado3.setBounds(740,300,100,100);
        dado32.setBounds(850,300,100,100);
        dado4.setBounds(1080,300,100,100);
        dado42.setBounds(1190,300,100,100);
        jug1.setBounds(50,135,301,53);
        jug2.setBounds(410,135,299,53);
        jug3.setBounds(740,135,289,53);
        jug4.setBounds(1055,135,300,53);
        tirar1.setBounds(40,420,260,52);
        tirar2.setBounds(380,420,260,52);
        tirar3.setBounds(720,420,260,52);
        tirar4.setBounds(1060,420,260,52);
        foto1.setBounds(135,220,50,50);
        foto2.setBounds(475,220,50,50);
        foto3.setBounds(815,220,50,50);
        foto4.setBounds(1155,220,50,50);

        container.add(titulo1);
        container.add(titulo2);
        container.add(dado1);
        container.add(dado12);
        container.add(dado2);
        container.add(dado22);
        container.add(dado3);
        container.add(dado32);
        container.add(dado4);
        container.add(dado42);
        container.add(jug1);
        container.add(jug2);
        container.add(jug3);
        container.add(jug4);
        container.add(tirar1);
        container.add(tirar2);
        container.add(tirar3);
        container.add(tirar4);
        container.add(foto1);
        container.add(foto2);
        container.add(foto3);
        container.add(foto4);
        container.add(fondo);

        tirar1.addActionListener(e -> {
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
        });
        tirar2.addActionListener(e -> {
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

            }
        });
        tirar4.addActionListener(e -> {
            String command = e.getActionCommand();
            if(command.equals("TIRAR4")){
                tiro7 = (int)(Math.random()*6)+1;
                tiro8 = (int)(Math.random()*6)+1;
                System.out.println(tiro7);
                System.out.println(tiro8);
                if(tiro7==1){
                    dado4.setIcon(uno);
                }
                if(tiro7==2){
                    dado4.setIcon(dos);
                }
                if(tiro7==3){
                    dado4.setIcon(tres);
                }
                if(tiro7==4){
                    dado4.setIcon(cuatro);
                }
                if(tiro7==5){
                    dado4.setIcon(cinco);
                }
                if(tiro7==6){
                    dado4.setIcon(seis);
                }
                if(tiro8==1){
                    dado42.setIcon(uno);
                }
                if(tiro8==2){
                    dado42.setIcon(dos);
                }
                if(tiro8==3){
                    dado42.setIcon(tres);
                }
                if(tiro8==4){
                    dado42.setIcon(cuatro);
                }
                if(tiro8==5){
                    dado42.setIcon(cinco);
                }
                if(tiro8==6){
                    dado42.setIcon(seis);
                }
                tirar4.setEnabled(false);
                suma4 = tiro7 + tiro8;
                System.out.println(suma1);

                if (suma1 > suma2 && suma1 > suma3 && suma1 > suma4){
                    Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    winner = "Mario";
                    if(suma2 > suma3 && suma2 > suma4) {
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Luigi";
                        if (suma3 > suma4) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third="Toad";
                            fourth="Yoshi";
                        } else {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            fourth="Toad";
                            third="Yoshi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma3 > suma2 && suma3 > suma4){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Toad";
                        if(suma2 > suma4){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third = "Luigi";
                            fourth = "Yoshi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            fourth = "Luigi";
                            third = "Yoshi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma4 > suma2 && suma4 > suma3){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Yoshi";
                        if(suma3 > suma2){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            third = "Toad";
                            fourth = "Luigi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            fourth = "Toad";
                            third = "Luigi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }
                if (suma2 > suma1 && suma2 > suma3 && suma2 > suma4) {
                    Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    winner = "Luigi";
                    if(suma1 > suma3 && suma1 > suma4) {
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Mario";
                        if (suma3 > suma4) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third = "Toad";
                            fourth = "Yoshi";
                        } else {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            third = "Yoshi";
                            fourth = "Toad";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma3 > suma1 && suma3 > suma4){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Toad";
                        if(suma1 > suma4){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third = "Mario";
                            fourth = "Yoshi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Yoshi";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma4 > suma1 && suma4 > suma3){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Yoshi";
                        if(suma1 > suma3){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            third = "Mario";
                            fourth = "Toad";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Toad";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }
                if (suma3 > suma1 && suma3 > suma2 && suma3 > suma4) {
                    Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    winner = "Toad";
                    if(suma1 > suma2 && suma1 > suma4) {
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Mario";
                        if (suma2 > suma4) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third = "Luigi";
                            fourth = "Yoshi";
                        } else {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            third = "Yoshi";
                            fourth = "Luigi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma2 > suma1 && suma2 > suma4){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Luigi";
                        if(suma1 > suma4){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 10;
                            third = "Mario";
                            fourth = "Yoshi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Yoshi";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma4 > suma1 && suma4 > suma2){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Yoshi";
                        if(suma1 > suma2){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            third = "Mario";
                            fourth = "Luigi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Luigi";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }
                if (suma4 > suma1 && suma4 > suma2 && suma4 > suma3) {
                    Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(3)).monedas += 50;
                    Jmain.getInstance().actualizarLabels();
                    winner = "Yoshi";
                    if(suma1 > suma2 && suma1 > suma3) {
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Mario";
                        if (suma2 > suma3) {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            third = "Luigi";
                            fourth = "Toad";
                        } else {
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            third = "Toad";
                            fourth = "Luigi";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma2 > suma1 && suma2 > suma3){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Luigi";
                        if(suma1 > suma3){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                            third = "Mario";
                            fourth = "Toad";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Toad";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                    if(suma3 > suma2 && suma3 > suma1){
                        Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                        Jmain.getInstance().actualizarLabels();
                        second = "Toad";
                        if(suma1 > suma2){
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                            third = "Mario";
                            fourth = "Luigi";
                        }else{
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 20;
                            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                            third = "Luigi";
                            fourth = "Mario";
                        }
                        Jmain.getInstance().actualizarLabels();
                    }
                }

                }

            JOptionPane.showMessageDialog(null,"SCORES: "+"\nMario: "+suma1+"\nLuigi: "+suma2+"\nToad: "+suma3+"\nYoshi: "+suma4+"\n\nSTANDINGS: " + "\n 1° PLACE: " + winner + "\n 2° PLACE: " + second + "\n 3° PLACE: "+third +"\n 4° PLACE: " + fourth);
            setVisible(false);
            dispose();
        });


        this.pack();
        this.validate();
        this.setVisible(true);
    }
}