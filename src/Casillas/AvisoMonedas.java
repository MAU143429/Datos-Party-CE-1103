package Casillas;

import javax.swing.*;

public class AvisoMonedas {
    private String msj;
    ImageIcon ant1 = new ImageIcon(getClass().getResource("/Market/ganamoneda.png"));
    ImageIcon ant2 = new ImageIcon(getClass().getResource("/Market/pierdemoneda.png"));

    /**
     * Muestra un aviso sobre las monedas.
     *
     * @param accion  "p" indica que pierde y "g" indica que gana;
     * @param monedas cantidad de monedas que ganará o perderá.
     */
    protected AvisoMonedas(char accion, int monedas) {


        if (accion == 'g') {
            JOptionPane.showMessageDialog(null, "", "GANASTE MONEDAS", JOptionPane.INFORMATION_MESSAGE, ant1);

        }
        else if (accion == 'p') {
            JOptionPane.showMessageDialog(null, "","PERDISTE MONEDAS",JOptionPane.INFORMATION_MESSAGE,ant2);
        }

    }

    public static void main(String[] args) {
        AvisoMonedas avisoMonedas = new AvisoMonedas('p',45);
    }

}