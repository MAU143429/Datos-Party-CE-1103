package Casillas;

import Juego.Jmain;
import Juego.Player;

import java.util.Random;

public class CasillaVerde extends Casilla {
    public CasillaVerde(int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Verde";
    }

    @Override
    public void evento(Player player) {
        int ganadas = 30;
        new AvisoMonedas('g', ganadas);
        player.monedas += ganadas;
        Jmain.getInstance().actualizarLabels();
        return;
    }
}