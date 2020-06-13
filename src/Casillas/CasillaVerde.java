package Casillas;

import Juego.Jmain;
import Juego.Player;

import java.util.Random;
/**
 * Clase de la casillaVerde
 * Crea a la casillaVerde
 * @author Jose A.
 *
 */
public class CasillaVerde extends Casilla {

    /**
     * Constructor de la casillaVerde
     * Da referencia y posicion a la casilla
     *
     * @param posX
     * @param posY
     * @param posList
     * @param referencia
     * @author Jose A.
     */
    public CasillaVerde(int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Verde";
    }

    /**
     * Metodo evento
     * Recibe un jugador al cual se le ejecutara un evento
     * @param player
     * @author Jose A.
     */
    @Override
    public void evento(Player player) {
        int ganadas = 30;
        new AvisoMonedas('g', ganadas);
        player.monedas += ganadas;
        Jmain.getInstance().actualizarLabels();
        return;
    }
}