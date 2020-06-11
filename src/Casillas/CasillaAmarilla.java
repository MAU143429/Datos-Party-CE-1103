package Casillas;

import Eventos.*;
import Juego.EventStack;
import Juego.Jmain;
import Juego.Player;
import Minijuegos.Clicker.ClickerDL;
import Minijuegos.RPS.rpsdl;
import Minijuegos.Runner.RunnerDL;

import java.util.concurrent.TimeUnit;

public class CasillaAmarilla extends Casilla {
    public CasillaAmarilla(int posX, int posY, int posList,int referencia) {
        this.posX = posX;
        this.posY = posY;
        this.posList = posList;
        this.referencia = referencia;
        this.msg = "Amarilla";
    }

    /**
     * Hace pop a un evento de la pila de eventos. Si la pila está vacía, la vuelve a crear.
     */
    @Override
    public void evento(Player player) {

        if (EventStack.getInstance().getStack().isEmpty()) {
            EventStack.instance = null;
        }
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        castToEvent(EventStack.getInstance().getStack().pop()).ventanaEvento(player);
        Jmain.getInstance().actualizarLabels();
        return;

    }

    public Evento castToEvent (Object object){
        return (Evento) object;







    }
}


