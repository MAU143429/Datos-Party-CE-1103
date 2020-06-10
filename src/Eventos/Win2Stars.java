package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;

public class Win2Stars extends Evento {
    public JFrame frmwin2;
    public JLabel bg12;

    @Override
    public void evento(Player player) {
        int strganadas = 2;
        player.estrellas += strganadas;
        System.out.println("ganaste 2 estrellas");
    }

    @Override
    public void ventanaEvento(Player player) {

        Jmain.getInstance().corriendoJuego = true;


        frmwin2 = new JFrame("Roba Estrella");
        frmwin2.setBounds(740, 130, 450, 305);
        frmwin2.setUndecorated(true);
        frmwin2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel101 = new JPanel();
        panel101.setLayout(null);
        panel101.setSize(600, 410);
        frmwin2.add(panel101);

        bg12 = new JLabel();
        bg12.setBounds(0, 0, 450, 310);
        ImageIcon bgurl120 = new ImageIcon(getClass().getResource("/Eventos/2estrellas.png"));
        bg12.setIcon(bgurl120);


        panel101.add(bg12);


        frmwin2.setVisible(true);

        evento(player);
        JOptionPane.showMessageDialog(null,"Ganaste 2 estrellas y te sientes muy cool");
        Jmain.getInstance().actualizarLabels();


        frmwin2.dispose();


        Jmain.getInstance().corriendoJuego = false;

    }
}
