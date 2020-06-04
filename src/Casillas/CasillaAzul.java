package Casillas;

import Juego.Player;

public class CasillaAzul extends Casilla {
    public CasillaAzul(int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Azul";
    }

    @Override
    public void evento(Player player){}
}