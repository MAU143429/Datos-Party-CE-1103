package Casillas;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
import java.util.Random;


/**
 * Clase de la casillaRoja
 * Crea a la casillaRoja
 * @author Jose A.
 *
 */
public class CasillaRoja extends Casilla {
    /**
     * Constructor de la casillaRoja
     * Da referencia y posicion a la casilla
     *
     * @param posX
     * @param posY
     * @param posList
     * @param referencia
     * @author Jose A.
     */
    public CasillaRoja(int posX, int posY, int posList, int referencia) {
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Roja";
    }

    /**
     * Metodo evento
     * Recibe un jugador al cual se le ejecutara un evento
     * @param player
     * @author Jose A.
     */
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

