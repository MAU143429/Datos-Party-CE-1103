package Juego;

import EstructurasDatos.SimpleList;
import Eventos.Evento;
import Minijuegos.Clicker.ClickerDL;
import Minijuegos.Dice.DiceCAS;
import Minijuegos.RPS.rpsdl;
import Minijuegos.Runner.RunnerCAS;
import Minijuegos.Runner.RunnerDL;
import Minijuegos.TTT.TicTacToe;

import java.util.concurrent.ThreadLocalRandom;

public class DuelCasilla extends Evento {


    @Override
    public void evento(Player player) {

    }

    @Override
    public void ventanaEvento(Player player) {

    }

    public void ventanaEvento(SimpleList duelist) {

        //int suerte = ThreadLocalRandom.current().nextInt(1, 3);
        int suerte = 1;

        if(suerte == 1){
            RunnerCAS prueba = new RunnerCAS(duelist);
        }
        if(suerte == 2){
            DiceCAS prueba = new DiceCAS();
        }
        if(suerte == 3){
            //TicTacToe prueba = new TicTacToe();
            System.out.println("NO SIRVO AUN");
        }

    }

}
