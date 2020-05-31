package Casillas;

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
            msj = "GANASTE " + monedas + " MONEDA(S)";
            System.out.println(msj);
        } else if (accion == 'p') {
            msj = "PERDISTE " + monedas + " MONEDA(S)";
            System.out.println(msj);
        }

    }

    public static void main(String[] args) {
        AvisoMonedas avisoMonedas = new AvisoMonedas('p',45);
    }

}