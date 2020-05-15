package Minijuegos.LFTT;


public class SG3 {

    int tltplayers = 0;

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
