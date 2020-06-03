package Juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Dados {
    ;
    Timer tm, xm;
    int x = 0;
    ImageIcon dadoimg1, dadoimg2, dadoimg3, dadoimg4, dadoimg5, dadoimg6, dadoroll;
    public int dado1, dado2, SumaDados;
    private static Dados instance = null;
    //Images Path In Array
    String[] list = {
            "/Juego/dado1.png",//0
            "/Juego/dado2.png",//1
            "/Juego/dado3.png",//2
            "/Juego/dado4.png",//3
            "/Juego/dado5.png",//4
            "/Juego/dado6.png"//5

    };

    public Dados() {
        dadoimg1 = new ImageIcon(getClass().getResource("/Juego/dado1.png"));
        dadoimg2 = new ImageIcon(getClass().getResource("/Juego/dado2.png"));
        dadoimg3 = new ImageIcon(getClass().getResource("/Juego/dado3.png"));
        dadoimg4 = new ImageIcon(getClass().getResource("/Juego/dado4.png"));
        dadoimg5 = new ImageIcon(getClass().getResource("/Juego/dado5.png"));
        dadoimg6 = new ImageIcon(getClass().getResource("/Juego/dado6.png"));
        dadoroll = new ImageIcon(getClass().getResource("/Juego/dadoroll1.png"));

    }

    public void SetImageSize(int i) {
        ImageIcon icon1 = new ImageIcon(getClass().getResource(list[i]));
        ImageIcon icon2 = new ImageIcon(getClass().getResource(list[i]));
        Jmain.getInstance().dado1.setIcon(icon1);
        Jmain.getInstance().dado2.setIcon(icon2);

    }

    public int retornarsuma() {
        return SumaDados;
    }

    public static Dados getInstance() {
        if (instance == null) {
            instance = new Dados();
        }
        return instance;
    }

    public void tirarDado() {
        Jmain.getInstance().nowplaying = true;
        dado1 = (int) (Math.random() * 6) + 1;
        System.out.println("DADO 1: " + Dados.getInstance().dado1);
        dado2 = (int) (Math.random() * 6) + 1;
        System.out.println("DADO 2: " + Dados.getInstance().dado2);
        tm = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                System.out.println(x);
                if (x >= list.length) {
                    x = 0;
                    tm.stop();
                    if (dado1 == 1) {
                        Jmain.getInstance().dado1.setIcon(dadoimg1);
                    }
                    if (dado1 == 2) {
                        Jmain.getInstance().dado1.setIcon(dadoimg2);
                    }
                    if (dado1 == 3) {
                        Jmain.getInstance().dado1.setIcon(dadoimg3);
                    }
                    if (dado1 == 4) {
                        Jmain.getInstance().dado1.setIcon(dadoimg4);
                    }
                    if (dado1 == 5) {
                        Jmain.getInstance().dado1.setIcon(dadoimg5);
                    }
                    if (dado1 == 6) {
                        Jmain.getInstance().dado1.setIcon(dadoimg6);
                    }
                    if (dado2 == 1) {
                        Jmain.getInstance().dado2.setIcon(dadoimg1);
                    }
                    if (dado2 == 2) {
                        Jmain.getInstance().dado2.setIcon(dadoimg2);
                    }
                    if (dado2 == 3) {
                        Jmain.getInstance().dado2.setIcon(dadoimg3);
                    }
                    if (dado2 == 4) {
                        Jmain.getInstance().dado2.setIcon(dadoimg4);
                    }
                    if (dado2 == 5) {
                        Jmain.getInstance().dado2.setIcon(dadoimg5);
                    }
                    if (dado2 == 6) {
                        Jmain.getInstance().dado2.setIcon(dadoimg6);
                    }
                    xm = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Jmain.getInstance().dado1.setIcon(dadoroll);
                            Jmain.getInstance().dado2.setIcon(dadoroll);
                            Jmain.getInstance().playing.movePlayer(SumaDados);
                            xm.stop();
                        }
                    });
                    xm.start();
                }

            }
        });
        tm.start();
        SumaDados = dado1 + dado2;
        Jmain.getInstance().playing.jugado = true;
        System.out.println("Suma de los Dados " + SumaDados);

        }
    }




