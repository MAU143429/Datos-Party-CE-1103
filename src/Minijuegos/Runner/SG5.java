package Minijuegos.Runner;


public class SG5 {

    int tltplayers = 0;

    public SG5(int players){
        tltplayers = players;

        if(tltplayers == 2){
            Runner2 player2 = new Runner2();

        }
        if(tltplayers== 3){
            Runner3 player3 = new Runner3();

        }
        if(tltplayers == 4){
            Runner4 player4 = new Runner4();

        }







    }



}

