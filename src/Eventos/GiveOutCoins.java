package Eventos;

import Juego.Jmain;
import Juego.Player;

import java.util.concurrent.ThreadLocalRandom;


public class GiveOutCoins extends Evento{

    @Override
    public void evento(Player player) {


        int randomInt = ThreadLocalRandom.current().nextInt(10, 30);
        System.out.println("VOY A REGALAR" + randomInt + "MONEDAS");

        while(randomInt /(Jmain.getInstance().getPlayerList().getLength() -1) % 2 != 0) {

            randomInt = ThreadLocalRandom.current().nextInt(10, 30);

        }

        int dar = (randomInt / (Jmain.getInstance().getPlayerList().getLength()-1));
        System.out.println("LE TOCAN ESTAS MONEDAS A CADA JUGADOR" + dar);

        for (int i = 0; i < Jmain.getInstance().getPlayerList().getLength(); i++) {

            if(Jmain.getInstance().getPlayerList().getPos(i) == player){
                player.monedas -= randomInt;
                System.out.println ("No recibo monedas");
            }else{
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(i)).monedas += dar;
            }

        }

    }

    @Override
    public void ventanaEvento(Player player) {

    }
}
