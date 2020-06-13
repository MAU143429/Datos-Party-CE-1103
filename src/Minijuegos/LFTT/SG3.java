package Minijuegos.LFTT;

import Juego.Jmain;

/**
 * SG3
 *Esta clase es la elije el modo de juego dependiendo de la cantidad de jugadores
 *@author Mauricio C.

 */
public class SG3 {

    /**
     * SG3
     *Este constructor permite la ejecucion de un jugo dependiendo de la cantidad de jugadores
     *
     *@author Mauricio C.

     */
    public SG3() {

        if (Jmain.getInstance().PlayerList.getLength()  == 2) {
            Treasure2 player2 = new Treasure2();

        }
        if (Jmain.getInstance().PlayerList.getLength()  == 3) {
            Treasure3 player3 = new Treasure3();

        }
        if (Jmain.getInstance().PlayerList.getLength()  == 4) {
            Treasure4 player4 = new Treasure4();

        }


    }

}
