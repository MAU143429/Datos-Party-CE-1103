package Casillas;

import javax.swing.*;
/**
 * AvisoMonedas
 *Esta clase identifica la casilla en la cual se encuentra el jugador y dependiendo de eso da o quita monedas
 *
 *@author Jose A.

 */
public class AvisoMonedas {
    private String msj;
    ImageIcon ant1 = new ImageIcon(getClass().getResource("/Market/ganamoneda.png"));
    ImageIcon ant2 = new ImageIcon(getClass().getResource("/Market/pierdemoneda.png"));


    /**
     *
     * AvisoMonedas
     *Este constructor recibe dos parametros uno de monedas y otro la accion
     * @param accion
     * @param monedas
     *@author Jose A.
     */


    protected AvisoMonedas(char accion, int monedas) {


        if (accion == 'g') {
            JOptionPane.showMessageDialog(null, "", "GANASTE MONEDAS", JOptionPane.INFORMATION_MESSAGE, ant1);

        }
        else if (accion == 'p') {
            JOptionPane.showMessageDialog(null, "","PERDISTE MONEDAS",JOptionPane.INFORMATION_MESSAGE,ant2);
        }

    }


    /**
     * Main de la clase AvisoMoneda
     * @param args
     * @author Jose A.
     */
    public static void main(String[] args) {
        AvisoMonedas avisoMonedas = new AvisoMonedas('p',45);
    }

}