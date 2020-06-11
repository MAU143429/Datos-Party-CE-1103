package Juego;

import Casillas.Casilla;
import EstructurasDatos.CircularList;
import EstructurasDatos.CircularNode;
import EstructurasDatos.SimpleList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.animation.AnimationTimer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Player {
    public Player self;
    public Casilla casillaActual;
    public int posX, posY, absPos, movimientosTotales, monedas, estrellas, referencia, sumadado,n;
    public boolean estaena, estaenb, estaenc, estaenReversa, estaend, salirD, moviendose, jugado;
    public Timer timerMovimiento, timerEStrellas, timerEvento;


    /**
     * @param jugadorNum el numero de jugador que será.
     */
    public Player(int jugadorNum) {
        this.self = this;
        referencia = jugadorNum;
        this.timerEStrellas = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
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
                    timerEStrellas.stop();
                }


            }

        });

        this.timerMovimiento = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent o) {
                if (estaenc && estaenReversa) {
                    moveBackwardsC();
                } else if (estaend && estaenReversa) {
                    moveBackwardsD();
                } else if (estaenb) {
                    moveB();
                } else if (estaena) {
                    moveA();
                } else if (estaenc) {
                    moveC();
                } else if (estaend) {
                    moveD();
                } else {
                    moveMainPath();
                }
                if(Jmain.getInstance().playing.referencia == 1){
                    Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
                }
                if(Jmain.getInstance().playing.referencia == 2){
                    Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
                }
                if(Jmain.getInstance().playing.referencia == 3){
                    Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
                }
                if(Jmain.getInstance().playing.referencia == 4){
                    Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
                }


            }
        });

        this.timerEvento = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent u) {
                casillaActual.evento(self);
                timerEvento.stop();
            }
        });
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
        if(casillaActual == Map.getInstance().getCasilla(2,"a")){
            absPos++;
            return;
        }
        if(casillaActual == Map.getInstance().getCasilla(2,"b")){
            absPos++;
            return;
        }
        if(casillaActual == Map.getInstance().getCasilla(2,"c")){
            absPos++;
            return;
        }
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(absPos+1);
        posX = (casilla.getPosX());
        posY = (casilla.getPosY());
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
        }
        Jmain.getInstance().panel4.repaint();
        casillaActual = casilla;
        absPos++;
        System.out.println("ABSPOS: " + absPos);
        System.out.println("MOVIMIENTOS TOTALES: " + movimientosTotales);
    }
    public void moverAntCasilla(String fase){
        if(casillaActual == Map.getInstance().getCasilla(0,"c")){
            absPos--;
            return;
        }
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(absPos-1);
        posX = (casilla.getPosX());
        posY = (casilla.getPosY());
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
        }
        Jmain.getInstance().panel4.repaint();
        casillaActual = casilla;
        absPos--;
        System.out.println("ABSPOS: " + absPos);
        System.out.println("MOVIMIENTOS TOTALES: " + movimientosTotales);
    }
    public void movePlayer(int moves) {
        System.out.println(moves);
        if (!moviendose) {
            moviendose = true;
            verifyPath();
            movimientosTotales += moves;
            timerEStrellas.start();
            timerMovimiento.start();
        }
    }
    public  void moveMainPath(){
        System.out.println("ESTOY EN CAMINO PRINCIPAL");
        if (absPos == movimientosTotales) {
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();

            if (absPos >= 45) {
                absPos -= 45;
                movimientosTotales -= 45;
            }
            verifyList();
            return;
        }
        if(absPos >= 45){
            absPos = 0;
            movimientosTotales -= 45;
            casillaActual = (Casilla) Map.getInstance().getFase("p").getPos(0);
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
        System.out.println(casillaActual.getMSG());
        if(absPos == 3){
            absPos = 38;
            movimientosTotales += 35;
            estaena = false;
            posX = 501;
            posY = 252;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            Jmain.getInstance().panel4.repaint();
            casillaActual = Map.getInstance().getCasilla(38,"p");
            return;
        }
        if(absPos == movimientosTotales){
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();
            verifyList();
        }
        else{
            System.out.println(casillaActual.getReferencia());
            moverSigCasilla("a");
        }
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void moveB(){
        System.out.println(casillaActual.getMSG());
        if(absPos == 3){
            absPos = 36;
            movimientosTotales += 33;
            estaenb = false;
            posX = 265;
            posY = 252;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            Jmain.getInstance().panel4.repaint();
            casillaActual = Map.getInstance().getCasilla(36,"p");
            return;
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
            movimientosTotales += 32;
            estaenc = false;
            posX = 149;
            posY = 252;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            Jmain.getInstance().panel4.repaint();
            casillaActual = Map.getInstance().getCasilla(35,"p");
            return;
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
            if(absPos == 2){
                absPos = 1;
            }
            verifyList();
            return;
        }
        if(absPos >= 9){
            absPos = 0;
            movimientosTotales -= 10;
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
        System.out.println("ABSPOS ACTUAL: "+absPos);
        System.out.println("MOVIMIENTOS: "+movimientosTotales);
        System.out.println(casillaActual.getMSG());
        if (absPos == -1){
            absPos = 16;
            movimientosTotales += 13;
            posX = 40;
            posY = 114;
            estaenc = false;
            estaenReversa = false;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            Jmain.getInstance().panel4.repaint();
            casillaActual = Map.getInstance().getCasilla(16,"p");
            return;
        }
        if (absPos == movimientosTotales - 2*(movimientosTotales-1)){
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
        System.out.println("CASILLA ACTUAL: "+ absPos + " COLOR DE LA CASILLA: "+casillaActual.getMSG() + " MOVIMIENTOS: " + movimientosTotales);
        salirD = true;
        if(absPos == 0){
            n++;
            absPos = 10;
            //movimientosTotales += 0;
            casillaActual = Map.getInstance().getCasilla(9,"d");
            posX = 80;
            posY = 873;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4) {
                Jmain.getInstance().yoshi.setLocation((posX - 22), (posY - 28));
            }
            Jmain.getInstance().panel4.repaint();
        }
        if(absPos == movimientosTotales - 2*(movimientosTotales - 6) || absPos == (movimientosTotales - 2*(movimientosTotales - 6))+10*n){
            moviendose = false;
            Jmain.getInstance().corriendoJuego = false;
            timerMovimiento.stop();
            verifyList();
            return;
        }
        else{
            moverAntCasilla("d");
        }
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
        else if(posX == 149 && posY == 252  && !estaenc){
            System.out.println("ANTES DE CAMBIAR EL POS ERA: "+    absPos);
            absPos = 2;
            movimientosTotales = -1;
            estaenc = true;
            estaenReversa = true;
            posX = 140;
            posY = 181;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }

            Jmain.getInstance().panel4.repaint();
            casillaActual = Map.getInstance().getCasilla(2,"c");
            return;


        }
        else if(posX == 298 && posY == 791 && salirD){
            if(estaenReversa){
                movimientosTotales -= 10;
            }else{
                movimientosTotales -= 2;
            }
            estaenc = true;
            estaend = false;
            posX = 143;
            posY = 118;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            casillaActual = Map.getInstance().getCasilla(1,"c");
            absPos = 1;
            salirD = false;
            return;
        }
        else if(posX == 143 && posY == 118){
            if(estaenReversa){
                movimientosTotales -= 2;
            }else{
                movimientosTotales += 0;
            }
            estaenc = false;
            estaend = true;
            posX = 298;
            posY = 791;
            n = 0;
            if(Jmain.getInstance().playing.referencia == 1){
                Jmain.getInstance().mario.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 2){
                Jmain.getInstance().luigi.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 3){
                Jmain.getInstance().toad.setLocation((posX-22),(posY-28));
            }
            if(Jmain.getInstance().playing.referencia == 4){
                Jmain.getInstance().yoshi.setLocation((posX-22),(posY-28));
            }
            casillaActual = Map.getInstance().getCasilla(0,"d");
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
    public void verifyList(){
        SimpleList playerList = Jmain.getInstance().getPlayerList();
        if (estaena){ casillaActual = Map.getInstance().getCasilla(absPos,"a");}
        else if(estaenb){casillaActual = Map.getInstance().getCasilla(absPos,"b");}
        else if(estaenc){casillaActual = Map.getInstance().getCasilla(absPos,"c");}
        else if(estaend){casillaActual = Map.getInstance().getCasilla(absPos,"d");}
        else{casillaActual = Map.getInstance().getCasilla(absPos,"p");}
        timerEvento.start();
        Jmain.getInstance().actualizarLabels();

        this.timerEvento.start();
        Jmain.getInstance().actualizarLabels();
    }


}