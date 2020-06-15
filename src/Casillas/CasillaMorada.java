package Casillas;

import Juego.Player;
/**
 * Clase de la casillaMorada
 * Crea a la casilla Morada
 * @author Jose A.
 *
 */
public class CasillaMorada extends Casilla {
    /**
     * Constructor de la casillaMorada
     * Da referencia y posicion a la casilla
     *
     * @param posX
     * @param posY
     * @param posList
     * @param referencia
     * @author Jose A.
     */
    public CasillaMorada (int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Morada";
    }

    /**
     * Metodo evento
     * Recibe un jugador al cual se le ejecutara un evento
     * @param player
     * @author Jose A.
     */
    @Override
    public void evento(Player player) {

    }
}
