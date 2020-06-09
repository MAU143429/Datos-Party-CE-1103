package Eventos;

import Juego.Jmain;
import Juego.Player;

public class Win2Stars extends Evento {
    @Override
    public void evento(Player player) {
        int strganadas = 2;
        player.estrellas += strganadas;
        System.out.println("ganaste 2 estrellas");
    }

    @Override
    public void ventanaEvento(Player player) {

    }
}
