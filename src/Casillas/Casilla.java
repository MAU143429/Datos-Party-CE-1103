package Casillas;

import EstructurasDatos.SimpleNode;
import Juego.Player;

public abstract class Casilla {
    protected int posX, posY, posList;
    protected String msg;
    public Casilla self;

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public int getPosList(){
        return posList;
    }

    public abstract void evento(Player player);
}
