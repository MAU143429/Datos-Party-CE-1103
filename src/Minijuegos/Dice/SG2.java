    package Minijuegos.Dice;


public class SG2 {

    int tltplayers;

    public SG2(int players) {
        tltplayers = players;

        if (tltplayers == 2) {
            dosjugadores player2 = new dosjugadores();

        }
        if (tltplayers == 3) {
            tresjugadores player3 = new tresjugadores();

        }
        if (tltplayers == 4) {
            cuatrojugadores player4 = new cuatrojugadores();

        }
    }
}