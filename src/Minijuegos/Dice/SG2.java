    package Minijuegos.Dice;


    import Juego.Jmain;

    public class SG2 {



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