package Eventos;

import Juego.Jmain;
import Juego.Player;

public class LoseStars extends Evento {

    public Player regalar;
    @Override
    public void evento(Player player) {
        regalar = Jmain.getInstance().getRandomPlayer();
        System.out.println("VOY A ROBARLE A  " + regalar);

        while (regalar == player ) {

            regalar = Jmain.getInstance().getRandomPlayer();
            System.out.println("NO ME PUEDO ROBAR A MI MISMO VOY  A ROBARLE A  " + regalar);

        }
        if (player.estrellas == 0) {
            return;

        } else {
            player.estrellas--;
            regalar.estrellas++;
            System.out.println("LE ROBE A " + player);


        }

    }

    @Override
    public void ventanaEvento(Player player) {

    }
}
