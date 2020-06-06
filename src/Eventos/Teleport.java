package Eventos;

import Casillas.Casilla;
import Juego.Jmain;
import Juego.Map;
import Juego.Player;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Teleport extends Evento{

    @Override
    public void evento(Player player) {
        Casilla casilla = Map.getInstance().getRandomTile();
        player.absPos = casilla.getPosList();
        player.posX = casilla.getPosX();
        player.posY = casilla.getPosY();
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation((player.posX-22),(player.posY-28));
        }
        player.verifyTeleport();
        return;
    }

    @Override
    public void ventanaEvento(Player player) {
        JOptionPane.showMessageDialog(null,"SERÁS TELETRANSPORTADO");
        try{
            TimeUnit.MILLISECONDS.sleep(400);
        }catch(InterruptedException interrupted){
            interrupted.printStackTrace();
        }
        evento(player);
        Jmain.getInstance().corriendoJuego = false;
        return;
    }
}
