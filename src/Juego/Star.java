package Juego;

import Casillas.Casilla;

import javax.swing.*;
import java.awt.*;
/**
 * Clase Star
 * Permite crear una estrella en el mapa
 * @author Naheem J.
 */
public class Star {
    private static Star instance = null;
    protected int precio, posX, posY;
    /**
     * Constructor Star
     * establece el precio de la estrella
     * @author Naheem J.
     */
    private Star(){
        this.precio = 30;
        placeStar();


    }
    /**
     * Instancia de la estrella
     * Singleton aplicado
     * @return instance
     * @author Naheem J.
     */
    public static Star getInstance(){
        if(instance == null){
            instance = new Star();
        }
        return instance;
    }
    /**
     * Metodo placestar
     * Ubica a la estrella en una posicion del mapa
     * @author Naheem J.
     */
    public void placeStar(){
        Casilla tile = Map.getInstance().getRandomTile();
        posX = tile.getPosX();
        posY = tile.getPosY();
        Jmain.getInstance().estrella.setBounds((posX -22),(posY -28),50,50);
        Jmain.getInstance().estrella.setVisible(true);

    }
}
