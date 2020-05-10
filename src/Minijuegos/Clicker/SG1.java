package Minijuegos.Clicker;


import Inicio.Window;

public class SG1 {

    int players = 0;

    public SG1(int pl) {
        players = pl;

        if (pl == 2) {
            Clicker2 player2 = new Clicker2();

        }
        if (pl == 3) {
            Clicker3 player3 = new Clicker3();

        }
        if (pl == 4) {
            Clicker4 player4 = new Clicker4();

        }
    }
}