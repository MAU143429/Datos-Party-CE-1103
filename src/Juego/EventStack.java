package Juego;

import EstructurasDatos.Stack;
import Eventos.*;

public class EventStack {

    public static EventStack instance = null;

    protected Stack stack;

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

        /**stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());
        stack.push(new PlaceSwap());*/

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

    public static EventStack getInstance(){
        if(instance == null){
            instance = new EventStack();
        }
        return instance;
    }

    public Stack getStack(){
        return stack;
    }







}
