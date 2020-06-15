package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;

/**
 * LoseStars
 * Clase del evento perder estrellas
 * @author Mauricio C.
 * @author Naheem J.
 */
public class LoseStars extends Evento {

    public Player regalar;
    public JLabel bg19;
    public JFrame frmrobar3;
    @Override
    public void evento(Player player) {
        regalar = Jmain.getInstance().getRandomPlayer();


        while (regalar == player ) {

            regalar = Jmain.getInstance().getRandomPlayer();


        }
        if (player.estrellas == 0) {
            return;

        } else {
            player.estrellas--;
            regalar.estrellas++;



        }

    }
    /**
     * ventanaEvento
     * @param player
     * Este método se encarga de crear la ventana de aviso en caso de que se de un evento
     */
    @Override
    public void ventanaEvento(Player player) {
        frmrobar3 = new JFrame();
        frmrobar3.setBounds(740, 130, 450, 305);
        frmrobar3.setUndecorated(true);
        frmrobar3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel100 = new JPanel();
        panel100.setLayout(null);
        panel100.setSize(600, 410);
        frmrobar3.add(panel100);

        bg19 = new JLabel();
        bg19.setBounds(0, 0, 450, 310);
        ImageIcon bgurl100 = new ImageIcon(getClass().getResource("/Eventos/per1estrella.png"));
        bg19.setIcon(bgurl100);


        panel100.add(bg19);


        frmrobar3.setVisible(true);

        evento(player);
        Jmain.getInstance().actualizarLabels();
        if (player.estrellas == 0){
            JOptionPane.showMessageDialog(null , "No tienes la cantidad de estrellas necesarias");
        }
        else{
            JOptionPane.showMessageDialog(null , "HAS PERDIDO UNA ESTRELLA");
        }
        frmrobar3.dispose();


        Jmain.getInstance().corriendoJuego = false;
    }
}
