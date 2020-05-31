package Juego;

import Casillas.Casilla;
import javafx.animation.AnimationTimer;

import java.util.Timer;

public class Player {
    private Player self;
    public Casilla casillaActual;
    public int posX, posY, absPos, movimientosTotales, monedas, estrellas;
    public boolean a, b, c, cR, d, salirD, moviendose, jugado;
    public AnimationTimer timerEStrellas;
    //protected AnimationTimer timerMovimiento, timerEstrellas, timerEvento;

    /**
     * @param jugadorNum el numero de jugador que será.
     */
    public Player(int jugadorNum) {
        this.self = this;
        this.timerEStrellas = new AnimationTimer(){
            @Override
            public void handle(long now) { }
        };
    }
}