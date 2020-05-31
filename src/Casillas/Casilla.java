package Casillas;

import Inicio.Player;

public abstract class Casilla {
    protected int posX, posY, posList;
    protected String msg;

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
