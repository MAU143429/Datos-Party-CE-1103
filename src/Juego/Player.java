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
    public int posX, posY, absPos, movimientosTotales, monedas, estrellas, referencia, sumadado;
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
        this.posX = 697;
        this.posY = 781;
        this.absPos = 0;
        this.movimientosTotales = 0;
        this.monedas = 30;
        this.estrellas = 0;
        this.estaena = false;
        this.estaenb = false;
        this.estaenc = false;
        this.estaend = false;
        this.estaenReversa = false;
        this.salirD = false;
        if (jugadorNum == 1) {
            Jmain.getInstance().mario.setLocation(posX, posY);
        }
        if (jugadorNum == 2) {
            Jmain.getInstance().luigi.setLocation(posX, posY);
        }
        if (jugadorNum == 3) {
            Jmain.getInstance().toad.setLocation(posX, posY);
        }
        if (jugadorNum == 4) {
            Jmain.getInstance().yoshi.setLocation(posX, posY);
        }


    }
}
