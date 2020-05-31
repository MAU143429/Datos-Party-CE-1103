package Casillas;

import Juego.Player;

public class CasillaVerde extends Casilla {
    public CasillaVerde(int posX, int posY, int posList){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.msg = "Verde";
    }

    @Override
    public void evento(Player player) {
        System.out.println("GANO MONEDAS");
    }
}