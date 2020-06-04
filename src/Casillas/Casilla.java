package Casillas;

import EstructurasDatos.SimpleNode;
import Juego.Player;

public abstract class Casilla {
    protected int posX, posY, posList,referencia;
    protected String msg;
    public Casilla self;

    public int getReferencia(){
        return referencia;
    }
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
