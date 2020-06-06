package Casillas;

import javax.swing.*;

public class AvisoMonedas {
    private String msj;

    /**
     * Muestra un aviso sobre las monedas.
     *
     * @param accion  "p" indica que pierde y "g" indica que gana;
     * @param monedas cantidad de monedas que ganará o perderá.
     */
    protected AvisoMonedas(char accion, int monedas) {

        if (accion == 'g') {
            JOptionPane.showMessageDialog(null, "FELICIDADES! \n GANASTE 30 MONEDAS");

        } else if (accion == 'p') {
            JOptionPane.showMessageDialog(null, "FELICIDADES! \n PERDISTE 15 MONEDAS");
        }

    }

    public static void main(String[] args) {
        AvisoMonedas avisoMonedas = new AvisoMonedas('p',45);
    }

}