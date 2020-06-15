package Minijuegos.TTT;

import javax.swing.*;

import EstructurasDatos.SimpleList;
import Juego.*;
/**
 * Juego
 * Clase que se encarga de manejar la parte lógica del minijuego TicTacToe
 * @author Naheem J.
 */

public class Juego {
    int Jugador = 1;
    int[][] Tablero = new int[3][3];

    public Player player1, player2;

    public static final int TERMINAR_NA = -1;

    public static final int TERMINAR_COL1 = 0;
    public static final int TERMINAR_COL2 = 1;
    public static final int TERMINAR_COL3 = 2;

    public static final int TERMINAR_FIL1 = 3;
    public static final int TERMINAR_FIL2 = 4;
    public static final int TERMINAR_FIL3 = 5;

    public static final int TERMINAR_DIAG1 = 6;
    public static final int TERMINAR_DIAG2 = 7;

    int Ganador = 0;
    int Linea_terminar = -1;

    /**
     * Juego
     * Constructor de la clase Juego que recibe el método LimpiarTablero
     * @author Naheem J.
     */
    public Juego(SimpleList duelist){
        player1 = (Player)duelist.getPos(0);
        player2 = (Player)duelist.getPos(1);
    }

    /**
     * registrarJugada
     * @param c
     * Método registarJugada se encarga de registrar la jugada del jugador cambian la variable int de un 1 a un 2
     * @author Naheem J.
     */
    void registrarJugada(int c, int f){
        if (Ganador != 0) {
            return;
        }
        if (Tablero[c][f] != 0) {
            return;
        }
        Tablero[c][f] = Jugador;
        if (Jugador == 1) {
            Jugador = 2;
        } else {
            Jugador = 1;
        }
        terminarJuego();

    }

    /**
     * terminarJuego
     * Método terminarJuego se encarga de hacer un switch-case buscando los casos en donde se haya registrado una victoria
     * @author Naheem J
     */
    void terminarJuego() {
        Linea_terminar = BuscarFin();
        if (Linea_terminar != TERMINAR_NA) {
            switch (Linea_terminar) {
                case TERMINAR_COL1:
                case TERMINAR_COL2:
                case TERMINAR_COL3:
                    Ganador = Tablero[Linea_terminar][0];
                    if (Ganador == 1) {
                        JOptionPane.showMessageDialog(null, "PLAYER 1 WINS THE BATTLE!!");
                        player2.posJug--;
                        player2.movTotal = player2.posJug;
                        player2.casillaActual = Map.getInstance().getCasilla(player2.posJug, Map.getInstance().getFase2(player2.casillaActual));
                        player2.verifyTeleport();
                        player2.posX = player2.casillaActual.getPosX();
                        player2.posY = player2.casillaActual.getPosY();
                        if(player2.referencia == 1){
                            Jmain.getInstance().mario.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 3){
                            Jmain.getInstance().toad.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    } else {
                        JOptionPane.showMessageDialog(null, "PLAYER 2 WINS THE BATTLE!!");
                        player1.posJug--;
                        player1.movTotal = player1.posJug;
                        player1.casillaActual = Map.getInstance().getCasilla(player1.posJug,Map.getInstance().getFase2(player1.casillaActual));
                        player1.verifyTeleport();
                        player1.posX = player1.casillaActual.getPosX();
                        player1.posY = player1.casillaActual.getPosY();
                        if(player1.referencia  == 1){
                            Jmain.getInstance().mario.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia == 3){
                            Jmain.getInstance().toad.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    }

                    break;
                case TERMINAR_FIL1:
                case TERMINAR_FIL2:
                case TERMINAR_FIL3:
                    Ganador = Tablero[0][Linea_terminar - 3];
                    if (Ganador == 1) {
                        JOptionPane.showMessageDialog(null, "PLAYER 1 WINS THE BATTLE!!");
                        player2.posJug--;
                        player2.movTotal = player2.posJug;
                        player2.casillaActual = Map.getInstance().getCasilla(player2.posJug, Map.getInstance().getFase2(player2.casillaActual));
                        player2.verifyTeleport();
                        player2.posX = player2.casillaActual.getPosX();
                        player2.posY = player2.casillaActual.getPosY();
                        if(player2.referencia == 1){
                            Jmain.getInstance().mario.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 3){
                            Jmain.getInstance().toad.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");

                    } else {
                        JOptionPane.showMessageDialog(null, "PLAYER 2 WINS THE BATTLE!!");
                        player1.posJug--;
                        player1.movTotal = player1.posJug;
                        player1.casillaActual = Map.getInstance().getCasilla(player1.posJug,Map.getInstance().getFase2(player1.casillaActual));
                        player1.verifyTeleport();
                        player1.posX = player1.casillaActual.getPosX();
                        player1.posY = player1.casillaActual.getPosY();
                        if(player1.referencia  == 1){
                            Jmain.getInstance().mario.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia == 3){
                            Jmain.getInstance().toad.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");

                    }

                    break;
                case TERMINAR_DIAG1:
                    Ganador = Tablero[0][0];
                    if (Ganador == 1) {
                        JOptionPane.showMessageDialog(null, "PLAYER 1 WINS THE BATTLE!!");
                        player2.posJug--;
                        player2.movTotal = player2.posJug;
                        player2.casillaActual = Map.getInstance().getCasilla(player2.posJug, Map.getInstance().getFase2(player2.casillaActual));
                        player2.verifyTeleport();
                        player2.posX = player2.casillaActual.getPosX();
                        player2.posY = player2.casillaActual.getPosY();
                        if(player2.referencia == 1){
                            Jmain.getInstance().mario.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 3){
                            Jmain.getInstance().toad.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    } else {
                        JOptionPane.showMessageDialog(null, "PLAYER 2 WINS THE BATTLE!!");
                        player1.posJug--;
                        player1.movTotal = player1.posJug;
                        player1.casillaActual = Map.getInstance().getCasilla(player1.posJug,Map.getInstance().getFase2(player1.casillaActual));
                        player1.verifyTeleport();
                        player1.posX = player1.casillaActual.getPosX();
                        player1.posY = player1.casillaActual.getPosY();
                        if(player1.referencia  == 1){
                            Jmain.getInstance().mario.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia == 3){
                            Jmain.getInstance().toad.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    }

                    break;
                case TERMINAR_DIAG2:
                    Ganador = Tablero[0][2];
                    if (Ganador == 1) {

                        JOptionPane.showMessageDialog(null, "PLAYER 1 WINS THE BATTLE!!");
                        player2.posJug--;
                        player2.movTotal = player2.posJug;
                        player2.casillaActual = Map.getInstance().getCasilla(player2.posJug, Map.getInstance().getFase2(player2.casillaActual));
                        player2.verifyTeleport();
                        player2.posX = player2.casillaActual.getPosX();
                        player2.posY = player2.casillaActual.getPosY();
                        if(player2.referencia == 1){
                            Jmain.getInstance().mario.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 3){
                            Jmain.getInstance().toad.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        if(player2.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player2.posX-22),(player2.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    } else {

                        JOptionPane.showMessageDialog(null, "PLAYER 2 WINS THE BATTLE!!");
                        player1.posJug--;
                        player1.movTotal = player1.posJug;
                        player1.casillaActual = Map.getInstance().getCasilla(player1.posJug,Map.getInstance().getFase2(player1.casillaActual));
                        player1.verifyTeleport();
                        player1.posX = player1.casillaActual.getPosX();
                        player1.posY = player1.casillaActual.getPosY();
                        if(player1.referencia  == 1){
                            Jmain.getInstance().mario.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 2){
                            Jmain.getInstance().luigi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia == 3){
                            Jmain.getInstance().toad.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        if(player1.referencia  == 4){
                            Jmain.getInstance().yoshi.setLocation((player1.posX-22),(player1.posY-28));
                        }
                        JOptionPane.showMessageDialog(null, "EL PERDEDOR SERÁ ATRASADO UNA CASILLA");
                    }

                    break;
            }
        }
    }

    /**
     * BucarFin
     * Método que se encarga de buscar un fin en las filas, columnas o diagonales de la matriz
     * @return TERMINAR_NA
     * @author Naheem J.
     */
    int BuscarFin() {
        int col = BuscarFinColumnas();
        if (col != -1) {
            return col;
        }
        int fil = BuscarFinFilas();
        if (fil != -1) {
            return fil + 3;
        }
        if (BuscarFinDiagonalPrincipal()) {
            return TERMINAR_DIAG1;
        }
        if (BuscarFinDiagonalSecundaria()) {
            return TERMINAR_DIAG2;
        }
        return TERMINAR_NA;
    }

    /**
     * BuscarFinDiagonalPrincipal
     * @return false
     * Método que se encarga de buscar si hay un ganador en la diagonal principal}
     * @author Naheem J
     */
    boolean BuscarFinDiagonalPrincipal() {
        int piv = 1;
        for (int i = 0; i < 3; i++) {
            if (Tablero[i][i] == 0) {
                return false;
            }
            if (i == 0) {
                piv = Tablero[i][i];
            }
            if (Tablero[i][i] != piv) {
                return false;
            }
        }
        return true;
    }
    /**
     * BuscarFinDiagonalPrincipal
     * @return false
     * Método que se encarga de buscar si hay un ganador en la diagonal secundaria
     * @author Naheem J
     */
    boolean BuscarFinDiagonalSecundaria() {
        int piv = 1;
        for (int i = 0; i < 3; i++) {
            if (Tablero[i][2 - i] == 0) {
                return false;
            }
            if (i == 0) {
                piv = Tablero[i][2 - i];
            }
            if (Tablero[i][2 - i] != piv) {
                return false;
            }
        }
        return true;
    }
    /**
     * BuscarFinFilas
     * @return -1
     * Método que se encarga de buscar si hay un ganador en las filas
     * @author Naheem J
     */
    int BuscarFinFilas() {
        int piv = 1;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++){
                if (Tablero[c][f] == 0) {
                    break;
                }
                if (c == 0){
                    piv = Tablero[c][f];
                }
                if(Tablero[c][f] != piv){
                    break;
                }
                if (c == 2){
                    return f;
                }
            }
        }
        return -1;
    }
    /**
     * BuscarFinColumnas
     * @return c
     * Método que se encarga de buscar si hay un ganador en las columnas
     * @author Naheem J
     */
    int BuscarFinColumnas() {
        int piv = 1;
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++){
              if(Tablero[c][f] == 0){
                  break;
              }
              if (f==0){
                  piv = Tablero[c][f];
              }
              if(Tablero[c][f] != piv){
                  break;
              }
              if (f==2){
                  return c;
              }
            }
        }
        return -1;
    }

}
