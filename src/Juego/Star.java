package Juego;

import Casillas.Casilla;

import javax.swing.*;
import java.awt.*;

public class Star {
    private static Star instance = null;
    protected int precio, posX, posY;

    private Star(){
        this.precio = 30;
        placeStar();


    }
    public static Star getInstance(){
        if(instance == null){
            instance = new Star();
        }
        return instance;
    }
    public void placeStar(){
        Casilla tile = Map.getInstance().getRandomTile();
        posX = tile.getPosX();
        posY = tile.getPosY();
        Jmain.getInstance().estrella.setBounds(posX,posY,50,50);

    }
}
