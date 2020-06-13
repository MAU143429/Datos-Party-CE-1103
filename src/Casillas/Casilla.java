package Casillas;

import EstructurasDatos.SimpleNode;
import Juego.Player;

/**
 * Clase casilla
 * Esta clase padre permite crear casillas que contengan su propia posiciones en x y y , posicion en la lista y referencias
 * @author Jose A.
 */
public abstract class Casilla {
    protected int posX, posY, posList,referencia;
    protected String msg;
    public Casilla self;

    /**
     * Metodo getMGS
     * Permite obtener un mensaje de la casilla
     * @return msg
     * @author Jose A.
     */
    public String getMSG(){
        return msg;
    }
    /**
     * Metedo getReferencia
     * Permite obtener la referencia de la casilla
     * @return referencia
     * @author Jose A.
     *
     */
    public int getReferencia(){
        return referencia;
    }
    /**
     * Metodo getPosX
     * permite obetener la posion de la casilla en X
     * @return posX
     * @author Jose A.
     *
     */
    public int getPosX(){
        return posX;
    }
    /**
     * Metodo getPosY
     * permite obetener la posion de la casilla en Y
     * @return posY
     * @author Jose A.
     *
     */
    public int getPosY(){
        return posY;
    }
    /**
     * Metodo getPosList
     * permite obetener la posion de la casilla en la lista
     * @author Jose A.
     * @return poslist
     */

    public int getPosList(){
        return posList;
    }
    /**
     * Metodo evento
     *metodo abrastracto del evento que recibe a un jugador
     * @param player
     * @author Jose A.
     *
     */

    public abstract void evento(Player player);
}
