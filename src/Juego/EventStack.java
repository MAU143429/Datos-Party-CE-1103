package Juego;

import EstructurasDatos.Stack;
import Eventos.*;

public class EventStack {

    public static EventStack instance = null;

    protected Stack stack;

    private EventStack(){
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());
        stack.push(new Teleport());

        stack.mezclar();

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
