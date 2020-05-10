package Minijuegos.Runner;


import Inicio.Window;

public class SG5 {

    int players = 0;

    public SG5(int pl){
        players = pl;

        if(pl == 2){
            Runner2 player2 = new Runner2();

        }
        if(pl== 3){
            Runner3 player3 = new Runner3();

        }
        if(pl == 4){
            Runner4 player4 = new Runner4();

        }







    }



}

