package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;

public class Win5Stars extends Evento {
    public JLabel bg13;
    public JFrame frmwin5;

    @Override
    public void evento(Player player) {
        int strganadas = 5;
        player.estrellas += strganadas;
        System.out.println("ganaste 5 estrellas");
    }

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
