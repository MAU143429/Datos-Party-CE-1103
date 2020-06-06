package Eventos;

import Juego.Jmain;
import Juego.Player;
import EstructurasDatos.SimpleList;

import javax.swing.*;
import java.util.Random;


public class StealCoins extends Evento {
    @Override
    public void evento(Player player) {

    }

    @Override
    public void ventanaEvento(Player player) {
        Jmain.getInstance().corriendoJuego = true;
        int robadas = new Random().nextInt(30)+10;
        JFrame frameRobar = new JFrame();
        JPanel panelRobar = new JPanel();
        SimpleList listajugadores = Jmain.getInstance().getPlayerList();
        JLabel labeltitulo = new JLabel("ROBAR MONEDAS");

    }
    public void evento(Player player, Player robado, int robadas){

    }
}
