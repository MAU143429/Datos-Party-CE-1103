package Juego;

import Casillas.Casilla;
import EstructurasDatos.CircularList;
import EstructurasDatos.CircularNode;
import EstructurasDatos.SimpleList;
import javafx.animation.AnimationTimer;

import javax.swing.*;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Player {
    private Player self;
    public Casilla casillaActual;
    public int posX, posY, absPos, movimientosTotales, monedas, estrellas,referencia,sumadado;
    public boolean estaena, estaenb, estaenc, estaenReversa, estaend, salirD, moviendose, jugado;
    public AnimationTimer timerEStrellas;
    protected AnimationTimer timerMovimiento, timerEstrellas, timerEvento;


    /**
     * @param jugadorNum el numero de jugador que será.
     */
    public Player(int jugadorNum) {
        referencia = jugadorNum;
        this.self = this;
        this.moveMainPath(12);
        this.timerEStrellas = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (Jmain.getInstance().rounds > 0 && Jmain.getInstance().playing == self && posX == Star.getInstance().posX && posY == Star.getInstance().posY) {
                    timerMovimiento.stop();
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (monedas >= Star.getInstance().precio) {
                        estrellas++;
                        monedas -= Star.getInstance().precio;
                        Jmain.getInstance().estrella.setVisible(false);
                        Star.getInstance().placeStar();
                    }
                    Jmain.getInstance().actualizarLabels();
                    timerMovimiento.start();
                    this.stop();
                }

            }
        };
        /**
        this.timerMovimiento = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(estaenc && estaenReversa){
                    moveBackwardsC();
                }
                else if(estaend && estaenReversa){
                    moveBackwardsD();
                }
                else if(estaenb){
                    moveB();
                }
                else if(estaena){
                    moveA();
                }
                else if(estaenc){
                    moveC();
                }
                else if(estaend){
                    moveD();
                }
                else{
                    moveMainPath();
                }
                if(jugadorNum==1){
                    Jmain.getInstance().mario.setLocation(posX,posY);
                }
                if(jugadorNum==2){
                    Jmain.getInstance().luigi.setLocation(posX,posY);
                }
                if(jugadorNum==3){
                    Jmain.getInstance().toad.setLocation(posX,posY);
                }
                if(jugadorNum==4){
                    Jmain.getInstance().yoshi.setLocation(posX,posY);
                }
            }
        };
         */
        this.timerEvento = new AnimationTimer() {
            @Override
            public void handle(long now) {
                casillaActual.evento(self);
                this.stop();
            }
        };
        this.posX = 720;
        this.posY = 845;
        this.absPos = 0;
        this.movimientosTotales = 0;
        this.casillaActual = null;
        this.monedas = 30;
        this.estrellas = 0;
        this.estaena = false;
        this.estaenb = false;
        this.estaenc = false;
        this.estaend = false;
        this.estaenReversa = false;
        this.salirD = false;
        this.jugado = false;
        this.moviendose = false;
        if(jugadorNum==1){
            Jmain.getInstance().mario.setLocation(posX,posY);
        }
        if(jugadorNum==2){
            Jmain.getInstance().luigi.setLocation(posX,posY);
        }
        if(jugadorNum==3){
            Jmain.getInstance().toad.setLocation(posX,posY);
        }
        if(jugadorNum==4){
            Jmain.getInstance().yoshi.setLocation(posX,posY);
        }

    }
    public void recibedado(int suma){
        sumadado = suma;
    }
    public void verifyPath(){
        if(posX == 280 && posY == 528){
            estaenb = true;
        }
        else if(posX == 417 && posY == 567){
            estaena = true;
        }
        else if(posX == 40 && posY == 114 && !estaenReversa){
            estaenc = true;
        }
        else if(posX == 149 && posY == 252 && !estaenc){
            estaenc = true;
            absPos = 2;
            movimientosTotales = 3;
            return;
        }
        else if(posX == 143 && posY == 118 && salirD){
            if(estaenReversa){
                movimientosTotales -= 1;
            }else{
                movimientosTotales -= 4;
            }
            estaenc = true;
            estaend = false;
            posX = 298;
            posY = 791;
            if(referencia==1){
                Jmain.getInstance().mario.setLocation(posX,posY);
            }
            if(referencia==2){
                Jmain.getInstance().luigi.setLocation(posX,posY);
            }
            if(referencia==3){
                Jmain.getInstance().toad.setLocation(posX,posY);
            }
            if(referencia==4){
                Jmain.getInstance().yoshi.setLocation(posX,posY);
            }
            absPos = 1;
            salirD = false;
            return;
        }else if(posX == 298 && posY == 791){
            if(estaenReversa){
                movimientosTotales += 1;
            }else{
                movimientosTotales += 4;
            }
            estaenc = false;
            estaend = true;
            posX = 502;
            posY = 510;
            if(referencia==1){
                Jmain.getInstance().mario.setLocation(posX,posY);
            }
            if(referencia==2){
                Jmain.getInstance().luigi.setLocation(posX,posY);
            }
            if(referencia==3){
                Jmain.getInstance().toad.setLocation(posX,posY);
            }
            if(referencia==4){
                Jmain.getInstance().yoshi.setLocation(posX,posY);
            }
            absPos = 2;
            return;
        }else{
            return;
        }
        absPos = -1;
        movimientosTotales = -1;
    }
    public void movePlayer(int moves){
        if(!moviendose){
            moviendose = true;
            verifyPath();
            movimientosTotales += moves;
            timerEstrellas.start();
            timerMovimiento.start();
        }
    }
    protected void verifyList(){
        SimpleList playerList = Jmain.getInstance().getPlayerList();
        if (estaena){ casillaActual = Map.getInstance().getCasilla(absPos,"a");}
        else if(estaenb){casillaActual = Map.getInstance().getCasilla(absPos,"b");}
        else if(estaenc){casillaActual = Map.getInstance().getCasilla(absPos,"c");}
        else if(estaend){casillaActual = Map.getInstance().getCasilla(absPos,"d");}
        else{casillaActual = Map.getInstance().getCasilla(absPos,"p");}
        Jmain.getInstance().actualizarLabels();
    }
    protected void moveMainPath(int numerodado){
        System.out.println("SI ME CORRO");
        while(numerodado != 0){
            Casilla casilla = (Casilla) Map.getInstance().getFase("p").getPos(absPos+1);
            posX = casilla.getPosX();
            posY = casilla.getPosY();
            Jmain.getInstance().mario.setLocation(posX,posY);
            numerodado -= 1;
            casillaActual = casilla;
            absPos++;
            System.out.println("ME ESTOY ENCICLANDO");
            System.out.println(posX);
            System.out.println(posY);
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
    }
