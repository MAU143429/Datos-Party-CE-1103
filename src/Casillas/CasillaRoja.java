package Casillas;

import java.util.Random;
import Inicio.Player;
import Inicio.Board;

public class CasillaRoja extends Casilla {
        public CasillaRoja(int posX, int posY, int posList){
            this.posX = posX;
            this.posY = posY;
            this.posList = posList;
            this.msg = "Roja";
        }

        @Override
        public void evento(Player player){
            System.out.println("PERDIO MONEDAS");
        }
    }

