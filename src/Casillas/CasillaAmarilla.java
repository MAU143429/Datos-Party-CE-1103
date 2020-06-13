package Casillas;

import Eventos.*;
import Juego.EventStack;
import Juego.Jmain;
import Juego.Player;
import Minijuegos.Clicker.ClickerDL;
import Minijuegos.RPS.rpsdl;
import Minijuegos.Runner.RunnerDL;

import java.util.concurrent.TimeUnit;
/**
 * Clase de la casilla amarilla
 * Crea a la casilla amarilla
 * @author Jose A.
 *
 */
public class CasillaAmarilla extends Casilla {
    /**
     * Constructor de la casillaAmarilla
     * Da referencia y posicion a la casilla
     *
     * @param posX
     * @param posY
     * @param posList
     * @param referencia
     * @author Jose A.
     */
    public CasillaAmarilla(int posX, int posY, int posList,int referencia) {
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Amarilla";
    }

    /**
     * Metodo evento
     * Recibe un jugador al cual se le ejecutara un evento
     * @param player
     * @author Jose A.
     */

    @Override
    public void evento(Player player) {

        if (EventStack.getInstance().getStack().isEmpty()) {
            EventStack.instance = null;
        }
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        castToEvent(EventStack.getInstance().getStack().pop()).ventanaEvento(player);
        Jmain.getInstance().actualizarLabels();
        return;

    }
    /**
     * Metodo castToEvent
     * Recibe un objeto y lo transforma a uno de tipo Evento
     * @param object
     * @author Jose A.
     */
    public Evento castToEvent (Object object){
        return (Evento) object;







    }
}


