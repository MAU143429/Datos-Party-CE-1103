package Juego;

import Casillas.Casilla;
import EstructurasDatos.CircularList;
import EstructurasDatos.CircularNode;
import EstructurasDatos.SimpleList;
import javafx.animation.AnimationTimer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Player {
    private Player self;
    public Casilla casillaActual;
    public int posX, posY, absPos, movimientosTotales, monedas, estrellas,referencia,sumadado;
    public boolean estaena, estaenb, estaenc, estaenReversa, estaend, salirD, moviendose, jugado;
    public AnimationTimer timerEStrellas;
    protected AnimationTimer timerMovimiento, timerEstrellas, timerEvento;
    public Timer tm;


    /**
     * @param jugadorNum el numero de jugador que será.
     */
    public Player(int jugadorNum) {
        referencia = jugadorNum;
        this.self = this;
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

            }
        };
        this.timerEvento = new AnimationTimer() {
            @Override
            public void handle(long now) {
                casillaActual.evento(self);
                this.stop();
            }
        };


        this.posX = 697;
        this.posY = 781;
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
    public void moverSigCasilla(String fase){
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(absPos+1);
        posX = (casilla.getPosX()-22);
        posY = (casilla.getPosY()-28);
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation(posX,posY);
        }
        Jmain.getInstance().panel4.repaint();
        System.out.println("ME ESTOY ENCICLANDO");
        System.out.println(posX);
        System.out.println(posY);
        casillaActual = casilla;
        absPos++;
    }
    public void moverAntCasilla(String fase){
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(absPos-1);
        posX = (casilla.getPosX()-22);
        posY = (casilla.getPosY()-28);
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation(posX,posY);
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation(posX,posY);
        }
        Jmain.getInstance().panel4.repaint();
        System.out.println("ME ESTOY ENCICLANDO");
        System.out.println(posX);
        System.out.println(posY);
        casillaActual = casilla;
        absPos--;
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
    public  void moveMainPath(){
        if (absPos == movimientosTotales){
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();

            if(absPos >= 46){
                absPos -= 46;
                movimientosTotales -= 46;
            }
            verifyList();
            return;
        }
        else{
            moverSigCasilla("p");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveA(){
        if(absPos == 3){
            absPos = 38;
            movimientosTotales += 6;
            estaena = false;
        }
        if(absPos == movimientosTotales){
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();
            verifyList();
        }
        else{
            moverSigCasilla("a");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveB(){
        if(absPos == 3){
            absPos = 36;
            movimientosTotales -= 8;
            estaenb = false;
        }
        if(absPos == movimientosTotales){
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();
            verifyList();
        }
        else{
            moverSigCasilla("b");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    protected void moveC(){
        if(absPos == 3){
            absPos = 35;
            movimientosTotales += 24;
            estaenc = false;
        }
        if(absPos == movimientosTotales){
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();
            verifyList();
        }
        else{
            moverSigCasilla("c");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveD(){
        salirD = true;
        if(absPos == movimientosTotales){
            moviendose = false;
            Jmain.getInstance().corriendoJuego = false;
            timerMovimiento.stop();
            if(absPos >= 10){
                absPos -= 10;
                movimientosTotales -= 10;
            }
            verifyList();
            return;
        }
        else{
            moverSigCasilla("d");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveBackwardsC(){
        if (absPos == -1){
            absPos = 16;
            estaenc = false;
        }
        if (absPos == movimientosTotales - 2*(movimientosTotales-6)){
            moviendose = false;
            Jmain.getInstance().corriendoJuego = false;
            timerMovimiento.stop();
            verifyList();
        }else{
            moverAntCasilla("c");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveBackwardsD(){
        salirD = true;
        if(absPos == 0){
            absPos = 11;
            movimientosTotales -= 12;
        }
        if(absPos == movimientosTotales - 2*(movimientosTotales - 10)){
            moviendose = false;
            Jmain.getInstance().corriendoJuego = false;
            timerMovimiento.stop();
            verifyList();
            return;
        }
        else{
            moverAntCasilla("d");
        }
        absPos--;
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
            if(Jmain.getInstance().playing == self && referencia==1){
                Jmain.getInstance().mario.setLocation(posX,posY);
            }
            if(Jmain.getInstance().playing == self && referencia==2){
                Jmain.getInstance().luigi.setLocation(posX,posY);
            }
            if(Jmain.getInstance().playing == self && referencia==3){
                Jmain.getInstance().toad.setLocation(posX,posY);
            }
            if(Jmain.getInstance().playing == self && referencia==4){
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
    public void verifyTeleport(){
        if(posX == 434 && posY == 490 || posX == 502 && posY == 510 || posX == 501 && posY == 298){estaena = true; estaenb = false; estaenc = false; estaend = false; salirD = false; estaenReversa = false; }
        else if(posX == 275 && posY == 462 || posX == 275 && posY == 382 || posX == 275 && posY == 301){estaena = false; estaenb = true; estaenc = false; estaend = false; salirD = false; estaenReversa = false;}
        else if(posX == 92 && posY == 114 || posX == 143 && posY == 118 || posX == 140 && posY == 181){estaena = false; estaenb = false; estaenc = true; estaend = false; salirD = false; estaenReversa = false;}
        else if(posX == 80 && posY == 791 || posX == 174 && posY == 791 || posX == 298 && posY == 791|| posX == 415 && posY == 791|| posX == 537 && posY == 791|| posX == 537 && posY == 873|| posX == 415 && posY == 873|| posX == 298 && posY == 873|| posX == 174 && posY == 873|| posX == 80 && posY == 873 ){estaena = false; estaenb = false; estaenc = false; estaend = true; salirD = true; estaenReversa = false;}
        else{estaena = false; estaenb = false; estaenc = false; estaend = false; salirD = false; estaenReversa = false;}

        if (estaena){casillaActual = Map.getInstance().getCasilla(absPos, "a");}
        else if (estaenb){casillaActual = Map.getInstance().getCasilla(absPos, "b");}
        else if (estaenc){casillaActual = Map.getInstance().getCasilla(absPos, "c");}
        else if (estaend){casillaActual = Map.getInstance().getCasilla(absPos, "d");}
        else{casillaActual = Map.getInstance().getCasilla(absPos, "p");}

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
    public int recibirsuma(){
        sumadado = Dados.getInstance().SumaDados;
        return sumadado;
    }

}