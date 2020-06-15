package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * GiveOutCoins
 * Clase del evento de dar monedas
 * @author Mauricio C.
 * @author Naheem J.
 */
public class GiveOutCoins extends Evento{

    public JLabel bg10;
    public JFrame frmdar;
    int randomInt;

    /**
     * evento
     * @param player
     * Método heredado de la clase padre evento que se encarga de quitarle las monedas a un jugador mientras entre
     * los 3 jugadores restantes el resto de monedas
     * @author Naheem J.
     * @author Mauricio C.
     */
    @Override
    public void evento(Player player) {


        randomInt = ThreadLocalRandom.current().nextInt(10, 30);
        System.out.println("VOY A REGALAR" + randomInt + "MONEDAS");

        while(randomInt /(Jmain.getInstance().getPlayerList().getLength() -1) % 2 != 0) {

            randomInt = ThreadLocalRandom.current().nextInt(10, 30);

        }

        int dar = (randomInt / (Jmain.getInstance().getPlayerList().getLength()-1));
        System.out.println("LE TOCAN ESTAS MONEDAS A CADA JUGADOR" + dar);

        for (int i = 0; i < Jmain.getInstance().getPlayerList().getLength(); i++) {

            if(Jmain.getInstance().getPlayerList().getPos(i) == player){
                if(player.monedas > randomInt){
                    player.monedas = 0;
                }else {
                    player.monedas -= randomInt;

                }
            }else{
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(i)).monedas += dar;

            }

        }

    }

    /**
     * ventanaEvento
     * @param player
     * Este método se encarga de crear la ventana de aviso en caso de que se de un evento
     */

    @Override
    public void ventanaEvento(Player player) {

        Jmain.getInstance().corriendoJuego = true;


        frmdar = new JFrame("Regala Monedas");
        frmdar.setBounds(740, 130, 450, 305);
        frmdar.setUndecorated(true);
        frmdar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel100 = new JPanel();
        panel100.setLayout(null);
        panel100.setSize(600, 410);
        frmdar.add(panel100);

        bg10 = new JLabel();
        bg10.setBounds(0, 0, 450, 310);
        ImageIcon bgurl100 = new ImageIcon(getClass().getResource("/Eventos/regamonedas.png"));
        bg10.setIcon(bgurl100);


        panel100.add(bg10);


        frmdar.setVisible(true);

        evento(player);
        Jmain.getInstance().actualizarLabels();
        JOptionPane.showMessageDialog(null,"ANDA REGALON, REGALASTE" + " " + randomInt + " " +"MONEDAS");

        frmdar.dispose();


        Jmain.getInstance().corriendoJuego = false;
    }
}
