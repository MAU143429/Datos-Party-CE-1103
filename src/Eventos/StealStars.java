package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;


public class StealStars extends Evento{
    Player res;
    @Override
    public void evento(Player player) {

          res = Jmain.getInstance().getRandomPlayer();

         while (res == player) {
             res = Jmain.getInstance().getRandomPlayer();
         }


         if (player.estrellas == 0){
             JOptionPane.showMessageDialog(null,"El jugador no tiene suficientes estrellas \n Evento Cancelado");
             return;
         }else{
             player.estrellas--;
             res.estrellas ++;
         }


    }

    @Override
    public void ventanaEvento(Player player) {

    }
}
