package Eventos;

import Juego.Jmain;
import Juego.Player;

import javax.swing.*;


public class StealStars extends Evento{
    Player res;
    public JFrame frmrobar2;
    public JLabel bg11;
    @Override
    public void evento(Player player) {

          res = Jmain.getInstance().getRandomPlayer();

         while (res == player) {
             res = Jmain.getInstance().getRandomPlayer();
         }


         if (player.estrellas == 0){
             JOptionPane.showMessageDialog(null,"El jugador no tiene suficientes estrellas \n Evento Cancelado");
             return;
         }else{
             player.estrellas--;
             res.estrellas ++;
             JOptionPane.showMessageDialog(null,"ACABAS DE PERDER UNA ESTRELLA");
         }


    }

    @Override
    public void ventanaEvento(Player player) {
        Jmain.getInstance().corriendoJuego = true;


        frmrobar2 = new JFrame("Roba Estrella");
        frmrobar2.setBounds(740, 130, 450, 305);
        frmrobar2.setUndecorated(true);
        frmrobar2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel101 = new JPanel();
        panel101.setLayout(null);
        panel101.setSize(600, 410);
        frmrobar2.add(panel101);

        bg11 = new JLabel();
        bg11.setBounds(0, 0, 450, 310);
        ImageIcon bgurl120 = new ImageIcon(getClass().getResource("/Eventos/robaestrellas.png"));
        bg11.setIcon(bgurl120);


        panel101.add(bg11);


        frmrobar2.setVisible(true);

        evento(player);
        Jmain.getInstance().actualizarLabels();


        frmrobar2.dispose();


        Jmain.getInstance().corriendoJuego = false;

    }
}
