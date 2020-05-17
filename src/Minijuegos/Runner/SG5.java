package Minijuegos.Runner;

/**
 * SG5
 *Esta clase se encarga de ejecutar el minijuego runner dependiendo de la cantidad de jugadores
 *@author Mauricio C.

 */
public class SG5 {
    int tltplayers = 0;

    /**
     * SG3
     *@param players int
     *               este parametro es la cantidad de jugadores en juego
     *Este constructor utiliza la cantidad de jugadores para definir el minijuego que sera ejecutado
     *@author Mauricio C.

     */
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

