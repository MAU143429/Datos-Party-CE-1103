package Eventos;

import Juego.Player;

public class Win5Stars extends Evento {
    @Override
    public void evento(Player player) {
        int strganadas = 5;
        player.estrellas += strganadas;
        System.out.println("ganaste 5 estrellas");
    }

    @Override
    public void ventanaEvento(Player player) {

    }
}
