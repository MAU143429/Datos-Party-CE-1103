package Minijuegos.Clicker;


import Juego.Jmain;

public class SG1 {



    public SG1() {


        if (Jmain.getInstance().getPlayerList().getLength() == 2) {
            Clicker2 player2 = new Clicker2();

        }
        if (Jmain.getInstance().getPlayerList().getLength()  == 3) {
            Clicker3 player3 = new Clicker3();

        }
        if (Jmain.getInstance().getPlayerList().getLength()  == 4) {
            Clicker4 player4 = new Clicker4();

        }
    }
}