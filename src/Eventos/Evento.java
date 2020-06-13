package Eventos;

import EstructurasDatos.SimpleList;
import Juego.Player;

/**
 * Evento
 * clase padre de evento
 * @author Mauricio C.
 * @author Naheem J.
 */
public abstract class   Evento {
    public abstract void evento(Player player);
    public abstract void ventanaEvento(Player player);
}
