package Minijuegos.Clicker;


import Juego.Jmain;
/**
 * SG1
 *Esta clase se encarga de ejecutar el minijuego clicker dependiendo de la cantidad de jugadores
 *@author Naheem J.

 */

public class SG1 {
    /**
     * SG1
     *
     *Este constructor utiliza la cantidad de jugadores para definir el minijuego que sera ejecutado
     *@author Naheem J.
     *
     */
    public SG1() {


        if (Jmain.getInstance().PlayerList.getLength() == 2) {
            Clicker2 player2 = new Clicker2();

        }
        if (Jmain.getInstance().PlayerList.getLength() == 3) {
            Clicker3 player3 = new Clicker3();

        }
        if (Jmain.getInstance().PlayerList.getLength() == 4) {
            Clicker4 player4 = new Clicker4();

        }
    }
}