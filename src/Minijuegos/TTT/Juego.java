package Minijuegos.TTT;

public class Juego {
    int Jugador = 1;
    int[][] Tablero = new int[3][3];

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
    public Juego(){
        LimpiarTablero();
    }
    void reiniciarJuego() {
        LimpiarTablero();
        Ganador = 0;
        Linea_terminar = TERMINAR_NA;
    }
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
    void terminarJuego() {
        Linea_terminar = BuscarFin();
        if (Linea_terminar != TERMINAR_NA) {
            switch (Linea_terminar) {
                case TERMINAR_COL1:
                case TERMINAR_COL2:
                case TERMINAR_COL3:
                    Ganador = Tablero[Linea_terminar][0];
                    break;
                case TERMINAR_FIL1:
                case TERMINAR_FIL2:
                case TERMINAR_FIL3:
                    Ganador = Tablero[0][Linea_terminar - 3];
                    break;
                case TERMINAR_DIAG1:
                    Ganador = Tablero[0][0];
                    break;
                case TERMINAR_DIAG2:
                    Ganador = Tablero[0][2];
                    break;
            }
        }
    }
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
    void LimpiarTablero(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Tablero[i][j] = 0;
            }
        }
    }
}
