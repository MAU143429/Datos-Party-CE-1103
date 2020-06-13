    package Minijuegos.Dice;


    import Juego.Jmain;
    /**
     * SG2
     *Esta clase se encarga de ejecutar el minijuego Dice dependiendo de la cantidad de jugadores
     *@author Jose A..
     */
    public class SG2 {
        /**
         * SG2
         *
         *Este constructor utiliza la cantidad de jugadores para definir el minijuego que sera ejecutado
         *@author Jose A.
         *
         */
    public SG2() {


        if (Jmain.getInstance().getPlayerList().getLength() == 2) {
            dosjugadores player2 = new dosjugadores();

        }
        if (Jmain.getInstance().getPlayerList().getLength() == 3) {
            tresjugadores player3 = new tresjugadores();

        }
        if (Jmain.getInstance().getPlayerList().getLength() == 4) {
            cuatrojugadores player4 = new cuatrojugadores();

        }
    }
}