package Juego;

import Casillas.Casilla;
import EstructurasDatos.SimpleList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Player {
    public Player self;
    public Casilla casillaActual;
    public int posX, posY, posJug, movTotal, monedas, estrellas, referencia, sumadado,n;
    public boolean estaena, estaenb, estaenc, estaenReversa, estaend, salirD, moviendose, jugado;
    public Timer timerMovimiento, timerEStrellas, timerEvento;


    /**
     * @param jugadorNum el numero de jugador que será.
     * @author JoseA
     * Constructor de la clase player
     */
    public Player(int jugadorNum) {
        this.self = this;
        referencia = jugadorNum;
        /**
         * Timer para revisar si se puede comprar la estrella del tablero
         */
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
        /**
         * Timer que revisa booleanos para mandar el método de movimiento que le toca al jugador
         * @author JoseA
         */
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
        /**
         * Timer que activa el evento de cada casilla
         * @autho Jose A.
         */
        this.timerEvento = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent u) {
                casillaActual.evento(self);
                timerEvento.stop();
            }
        });
        this.posX = 697;
        this.posY = 781;
        this.posJug = 0;
        this.movTotal = 0;
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

    /**
     * Mueve al jugador a la siguiente casilla
     * @param fase es la fase en la que se encuentra el jugador
     * @author Jose A.
     */
    public void moverSigCasilla(String fase){


        if(casillaActual == Map.getInstance().getCasilla(2,"a")){
            posJug++;
            return;
        }
        if(casillaActual == Map.getInstance().getCasilla(2,"b")){
            posJug++;
            return;
        }
        if(casillaActual == Map.getInstance().getCasilla(2,"c")){
            posJug++;
            return;
        }
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(posJug +1);
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
        posJug++;
        System.out.println("ABSPOS: " + posJug);
        System.out.println("MOVIMIENTOS TOTALES: " + movTotal);
    }
    /**
     * Mueve al jugador a la casilla anterior
     * @param fase es la fase en la que se encuentra el jugador
     * @author Jose A.
     */
    public void moverAntCasilla(String fase){
        if(casillaActual == Map.getInstance().getCasilla(0,"c")){
            posJug--;
            return;
        }
        Casilla casilla = (Casilla) Map.getInstance().getFase(fase).getPos(posJug -1);
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
        posJug--;
        System.out.println("ABSPOS: " + posJug);
        System.out.println("MOVIMIENTOS TOTALES: " + movTotal);
    }
    /**
     * Llama lo necesario para que el jugador se mueva la cantidad de casillas que entrar en el parametro
     * @param moves es la cantidad de movimientos que debería hacer el jugador
     * @author Jose A.
     */
    public void movePlayer(int moves) {
        System.out.println(moves);
        if (!moviendose) {
            moviendose = true;
            verifyPath();
            movTotal += moves;
            timerEStrellas.start();
            timerMovimiento.start();
        }
    }
    /**
     * Mueve al jugador a lo largo de la fase principal
     * @author Jose A.
     */
    public  void moveMainPath(){
        System.out.println("ESTOY EN CAMINO PRINCIPAL");
        if (posJug == movTotal) {
            Jmain.getInstance().corriendoJuego = false;
            moviendose = false;
            timerMovimiento.stop();

            if (posJug >= 45) {
                posJug -= 45;
                movTotal -= 45;
            }
            verifyList();
            return;
        }
        if(posJug >= 45){
            posJug = 0;
            movTotal -= 45;
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
    /**
     * Mueve al jugador a lo largo de la fase A
     * @author Jose A.
     */
    protected void moveA(){
        System.out.println(casillaActual.getMSG());
        if(posJug == 3){
            posJug = 38;
            movTotal += 35;
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
        if(posJug == movTotal){
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
    /**
     * Mueve al jugador a lo largo de la fase B
     * @author Jose A.
     */
    protected void moveB(){
        System.out.println(casillaActual.getMSG());
        if(posJug == 3){
            posJug = 36;
            movTotal += 33;
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
        if(posJug == movTotal){
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
    /**
     * Mueve al jugador a lo largo de la fase C
     * @author Jose A.
     */
    protected void moveC(){
        if(posJug == 3){
            posJug = 35;
            movTotal += 32;
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
        if(posJug == movTotal){
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
    /**
     * Mueve al jugador a lo largo de la fase D.
     * @author Jose A.
     */
    protected void moveD(){
        salirD = true;
        if(posJug == movTotal){
            moviendose = false;
            Jmain.getInstance().corriendoJuego = false;
            timerMovimiento.stop();
            if(posJug == 2){
                posJug = 1;
            }
            verifyList();
            return;
        }
        if(posJug >= 9){
            posJug = 0;
            movTotal -= 10;
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
    /**
     * Mueve al jugador a lo largo de la fase C estando en reversa
     * @author Jose A.
     */
    protected void moveBackwardsC(){
        System.out.println("ABSPOS ACTUAL: "+ posJug);
        System.out.println("MOVIMIENTOS: "+ movTotal);
        System.out.println(casillaActual.getMSG());
        if (posJug == -1){
            posJug = 16;
            movTotal += 13;
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
        if (posJug == movTotal - 2*(movTotal -1)){
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
    /**
     * Mueve al jugador a lo largo de la fase D estando en reversa
     * @author Jose A.
     */
    protected void moveBackwardsD(){
        System.out.println("CASILLA ACTUAL: "+ posJug + " COLOR DE LA CASILLA: "+casillaActual.getMSG() + " MOVIMIENTOS: " + movTotal);
        salirD = true;
        if(posJug == 0){
            n++;
            posJug = 10;
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
        if(posJug == movTotal - 2*(movTotal - 6) || posJug == (movTotal - 2*(movTotal - 6))+10*n){
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

    /**
     * Verifica la posición o coordenadas del jugador para cambiar sus booleanos y que se pued cambiar de método de movimiento en caso de un cambio de fase
     * @author Jose A.
     */
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
            System.out.println("ANTES DE CAMBIAR EL POS ERA: "+ posJug);
            posJug = 2;
            movTotal = -1;
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
                movTotal -= 10;
            }else{
                movTotal -= 2;
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
            posJug = 1;
            salirD = false;
            return;
        }
        else if(posX == 143 && posY == 118){
            if(estaenReversa){
                movTotal -= 2;
            }else{
                movTotal += 0;
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
            posJug = 2;
            return;
        }else{
            return;
        }
        posJug = -1;
        movTotal = -1;
    }

    /**
     * Revisa las coordenadas de la casilla donde fue teletransportado el jugador para cambiar sus booleanos
     * @author Jose A.
     */
    public void verifyTeleport(){
        if(posX == 434 && posY == 490 || posX == 502 && posY == 510 || posX == 501 && posY == 298){estaena = true; estaenb = false; estaenc = false; estaend = false; salirD = false; estaenReversa = false; }
        else if(posX == 275 && posY == 462 || posX == 275 && posY == 382 || posX == 275 && posY == 301){estaena = false; estaenb = true; estaenc = false; estaend = false; salirD = false; estaenReversa = false;}
        else if(posX == 92 && posY == 114 || posX == 143 && posY == 118 || posX == 140 && posY == 181){estaena = false; estaenb = false; estaenc = true; estaend = false; salirD = false; estaenReversa = false;}
        else if(posX == 80 && posY == 791 || posX == 174 && posY == 791 || posX == 298 && posY == 791|| posX == 415 && posY == 791|| posX == 537 && posY == 791|| posX == 537 && posY == 873|| posX == 415 && posY == 873|| posX == 298 && posY == 873|| posX == 174 && posY == 873|| posX == 80 && posY == 873 ){estaena = false; estaenb = false; estaenc = false; estaend = true; salirD = true; estaenReversa = false;}
        else{estaena = false; estaenb = false; estaenc = false; estaend = false; salirD = false; estaenReversa = false;}

        if (estaena){casillaActual = Map.getInstance().getCasilla(posJug, "a");}
        else if (estaenb){casillaActual = Map.getInstance().getCasilla(posJug, "b");}
        else if (estaenc){casillaActual = Map.getInstance().getCasilla(posJug, "c");}
        else if (estaend){casillaActual = Map.getInstance().getCasilla(posJug, "d");}
        else{casillaActual = Map.getInstance().getCasilla(posJug, "p");}

    }

    /**
     * Cambia la casilla actual del jugador por la nueva casilla y revisa si dos jugadores estan en la misma casilla para lanzar un duelo
     * @author Jose A.
     */
    public void verifyList(){
        SimpleList duelist = new SimpleList();
        duelist.add(self);
        if (estaena){ casillaActual = Map.getInstance().getCasilla(posJug,"a");}
        else if(estaenb){casillaActual = Map.getInstance().getCasilla(posJug,"b");}
        else if(estaenc){casillaActual = Map.getInstance().getCasilla(posJug,"c");}
        else if(estaend){casillaActual = Map.getInstance().getCasilla(posJug,"d");}
        else{casillaActual = Map.getInstance().getCasilla(posJug,"p");}
        Jmain.getInstance().actualizarLabels();

        if(Jmain.getInstance().rounds > 0) {
            for (int i = 0; i < Jmain.getInstance().getPlayerList().getLength();i++){
                System.out.println("ENTRE A CARGAR LOS DUELOS");

                Player player = (Player) Jmain.getInstance().getPlayerList().getPos(i);
                if (player != this && player.casillaActual.getReferencia()  == this.casillaActual.getReferencia()) {
                    System.out.println("ENTRE AL CARGAR JUGADRES");
                    duelist.add(player);
                    System.out.println("me estoy preparando" + player.referencia);

                    break;
                }
            }

            if (duelist.getLength() > 1) {
                System.out.println("estoy listo para un duelo");
                System.out.println("LARGO DE LA LISTA" + duelist.getLength());
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                new DuelCasilla().ventanaEvento(duelist);
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                while(duelist.getLength() != 0 ){
                    duelist.delete(0);
                }
                System.out.println("LARGO DE LA LISTA" + duelist.getLength());
                return;
            }
        }

        this.timerEvento.start();
        Jmain.getInstance().actualizarLabels();
    }

}