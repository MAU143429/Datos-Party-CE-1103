package Juego;

import EstructurasDatos.Stack;
import Minijuegos.Clicker.ClickerDL;
import Minijuegos.RPS.rpsdl;
import Minijuegos.Runner.RunnerDL;

public class DuelStack {

    public static DuelStack instance = null;
    protected Stack duelos;

    private DuelStack(){

        duelos = new Stack(15);


        duelos.push(new RunnerDL());
        duelos.push(new RunnerDL());
        duelos.push(new RunnerDL());
        duelos.push(new RunnerDL());
        duelos.push(new RunnerDL());

        duelos.push(new ClickerDL());
        duelos.push(new ClickerDL());
        duelos.push(new ClickerDL());
        duelos.push(new ClickerDL());
        duelos.push(new ClickerDL());

        duelos.push(new rpsdl());
        duelos.push(new rpsdl());
        duelos.push(new rpsdl());
        duelos.push(new rpsdl());
        duelos.push(new rpsdl());


        duelos = duelos.mezclar();

    }


    public static DuelStack getInstance(){
        if(instance == null){
            instance = new DuelStack();
        }
        return instance;
    }


    public Stack getStack(){
        return duelos;
    }







}
