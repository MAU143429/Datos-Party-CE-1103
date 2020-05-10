package Minijuegos.LFTT;


public class SG3 {

    int players = 0;

    public SG3(int pl) {
        players = pl;

        if (pl == 2) {
            Treasure2 player2 = new Treasure2();

        }
        if (pl == 3) {
            Treasure3 player3 = new Treasure3();

        }
        if (pl == 4) {
            Treasure4 player4 = new Treasure4();

        }


    }

}
