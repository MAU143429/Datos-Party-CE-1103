package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;
/**
 * Win2Stars
 * Clase del evento de ganar 5 estrellas
 * @author Mauricio C.
 * @author Naheem J.
 */
public class Win5Stars extends Evento {
    public JLabel bg13;
    public JFrame frmwin5;
    /**
     * evento
     * @param player
     * Método heredado de la clase padre que contiene la lógica de sumarle cinco estrellas al jugador
     * @author Mauricio C.
     * @author Naheem J.
     */
    @Override
    public void evento(Player player) {
        int strganadas = 5;
        player.estrellas += strganadas;

    }
    /**
     * ventanaEvento
     * @param player
     * Este método se encarga de crear la ventana de aviso en caso de que se de un evento
     */
    @Override
    public void ventanaEvento(Player player) {

        Jmain.getInstance().corriendoJuego = true;


        frmwin5 = new JFrame("Roba Estrella");
        frmwin5.setBounds(740, 130, 450, 305);
        frmwin5.setUndecorated(true);
        frmwin5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel101 = new JPanel();
        panel101.setLayout(null);
        panel101.setSize(600, 410);
        frmwin5.add(panel101);

        bg13 = new JLabel();
        bg13.setBounds(0, 0, 450, 310);
        ImageIcon bgurl120 = new ImageIcon(getClass().getResource("/Eventos/5estrellas.png"));
        bg13.setIcon(bgurl120);


        panel101.add(bg13);


        frmwin5.setVisible(true);

        evento(player);
        JOptionPane.showMessageDialog(null,"Ganaste 5 estrellas y te sientes aun mas muy cool");
        Jmain.getInstance().actualizarLabels();


        frmwin5.dispose();


        Jmain.getInstance().corriendoJuego = false;

    }


}
