package Juego;

import EstructurasDatos.Stack;
import Eventos.*;

/**
 * EventStack
 * Clase que utiliza el stack para cargar los diferentes eventos
 * @author Mauricio C.
 * @author Jose A.
 */
public class EventStack {

    public static EventStack instance = null;

    protected Stack stack;

    /**
     * EventStack
     * Constructor de la clase EventStack
     * @author Mauricio C.
     * @author Jose A.
     */
    private EventStack(){

        stack = new Stack(42);

        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());

        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());
        stack.push(new StealCoins());

        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());
        stack.push(new GiveOutCoins());

        stack.push(new Win2Stars());
        stack.push(new Win2Stars());
        stack.push(new Win2Stars());


        stack.push(new Win5Stars());

        stack.push(new StealStars());
        stack.push(new StealStars());
        stack.push(new StealStars());
        stack.push(new StealStars());

        stack.push(new LoseStars());
        stack.push(new LoseStars());
        stack.push(new LoseStars());
        stack.push(new LoseStars());
        stack.push(new LoseStars());
        stack.push(new LoseStars());
        stack.push(new LoseStars());

        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());

        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());
        stack.push(new Duel());


        stack = stack.mezclar();

    }

    /**
     * getInstance
     * @return instance
     * Método singleton para realizar un get de la instancia
     * @author Mauricio C.
     * @author Jose A.
     */
    public static EventStack getInstance(){
        if(instance == null){
            instance = new EventStack();
        }
        return instance;
    }

    /**
     * getStack
     * @return stack
     * Método que realiza un return de la variable stack
     * @author Mauricio C.
     * @author Jose A.
     */
    public Stack getStack(){
        return stack;
    }







}
