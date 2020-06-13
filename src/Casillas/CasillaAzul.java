package Casillas;

import Juego.Player;
/**
 * Clase de la casillaAzul
 * Crea a la casilla azul
 * @author Jose A.
 *
 */
public class CasillaAzul extends Casilla {
    /**
     * Constructor de la casillaAzul
     * Da referencia y posicion a la casilla
     *
     * @param posX
     * @param posY
     * @param posList
     * @param referencia
     * @author Jose A.
     */
    public CasillaAzul(int posX, int posY, int posList,int referencia){
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Azul";
    }
    /**
     * Metodo evento
     * Recibe un jugador al cual se le ejecutara un evento
     * @param player
     * @author Jose A.
     */
    @Override
    public void evento(Player player){}
}