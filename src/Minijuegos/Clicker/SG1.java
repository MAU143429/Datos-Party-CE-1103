package Minijuegos.Clicker;


public class SG1 {

    int tltplayers;

    public SG1(int players) {
        tltplayers = players;

        if (tltplayers == 2) {
            Clicker2 player2 = new Clicker2();

        }
        if (tltplayers == 3) {
            Clicker3 player3 = new Clicker3();

        }
        if (tltplayers == 4) {
            Clicker4 player4 = new Clicker4();

        }
    }
}