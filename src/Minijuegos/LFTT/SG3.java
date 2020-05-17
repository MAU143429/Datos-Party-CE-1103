package Minijuegos.LFTT;

/**
 * SG3
 *Esta clase es la elije el modo de juego dependiendo de la cantidad de jugadores
 *@author Mauricio C.

 */
public class SG3 {

    int tltplayers = 0;
    /**
     * SG3
     *Este constructor permite la ejecucion de un jugo dependiendo de la cantidad de jugadores
     * @param players int
     *                variable que indica la cantidad de jugadores
     *@author Mauricio C.

     */
    public SG3(int players) {
        tltplayers = players;

        if (tltplayers == 2) {
            Treasure2 player2 = new Treasure2();

        }
        if (tltplayers == 3) {
            Treasure3 player3 = new Treasure3();

        }
        if (tltplayers == 4) {
            Treasure4 player4 = new Treasure4();

        }


    }

}
