package Casillas;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
import java.util.Random;

public class CasillaRoja extends Casilla {
    public CasillaRoja(int posX, int posY, int posList, int referencia) {
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Roja";
    }

    @Override
    public void evento(Player player) {
        int perdidas = 15;
        new AvisoMonedas('p', perdidas);

        if (player.monedas < perdidas) {
            player.monedas = 0;
        } else {
            player.monedas -= perdidas;

        }
        Jmain.getInstance().actualizarLabels();
        return;
    }
}

