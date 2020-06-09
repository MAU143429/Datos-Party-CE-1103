package Casillas;

import Juego.Player;

public class CasillaMorada extends Casilla {
    public CasillaMorada (int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Morada";
    }

    @Override
    public void evento(Player player) {

        System.out.println("SE TELETRANPORTÓ");
    }
}
