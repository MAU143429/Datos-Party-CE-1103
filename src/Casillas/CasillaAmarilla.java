package Casillas;

import Inicio.Player;
import Inicio.EventStack;

import java.util.concurrent.TimeUnit;

public class CasillaAmarilla extends Casilla {
    public CasillaAmarilla(int posX, int posY, int posList) {
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.msg = "Amarilla";
    }

    /**
     * Hace pop a un evento de la pila de eventos. Si la pila está vacía, la vuelve a crear.
     */
    @Override
    public void evento(Player player) {
        System.out.println("SE LLAMÓ UN EVENTO");
    }

}