package Juego;

import EstructurasDatos.SimpleList;
import Eventos.Evento;
import Minijuegos.Dice.DiceCAS;
import Minijuegos.Runner.RunnerCAS;
import Minijuegos.TTT.TicTacToe;


import java.util.concurrent.ThreadLocalRandom;
/**
 * Clase DuelCasilla
 * Permite crear los eventos en caso de que dos jugadores esten en la misma casilla
 * @author Jose A. , Mauricio C.
 */
public class DuelCasilla extends Evento {

    /**
     * Metodo abstracto evento
     * Permite crear un evento
     * @param player
     * @author Naheem J , Mauricio C.
     */
    @Override
    public void evento(Player player) {

    }
    /**
     * Metodo abstracto ventanaEvento
     * Permite crear una ventana de evento
     * @param player
     * @author Naheem J , Mauricio C.
     */
    @Override
    public void ventanaEvento(Player player) {

    }
    /**
     * Metodo abstracto ventanaEvento
     * Permite crear una ventana de evento
     * @param duelist
     * @author Naheem J , Mauricio C.
     */
    public void ventanaEvento(SimpleList duelist) {

        int suerte = ThreadLocalRandom.current().nextInt(1, 3);


        if(suerte == 1){
            RunnerCAS prueba = new RunnerCAS(duelist);
        }
        if(suerte == 2){
            DiceCAS prueba = new DiceCAS();
        }
        if(suerte == 3){
            //TicTacToe prueba = new TicTacToe(duelist);

        }

    }

}
