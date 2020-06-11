package Eventos;

import Casillas.Casilla;
import Juego.Jmain;
import Juego.Map;
import Juego.Player;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Teleport extends Evento{

    public  JLabel bg18;
    public  JFrame frmtele;
    @Override
    public void evento(Player player) {
        Casilla casilla = Map.getInstance().getRandomTile();
        player.absPos = casilla.getPosList();
        player.posX = casilla.getPosX();
        player.posY = casilla.getPosY();
        player.movimientosTotales = player.absPos;
        if(Jmain.getInstance().playing.referencia == 1){
            Jmain.getInstance().mario.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 2){
            Jmain.getInstance().luigi.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 3){
            Jmain.getInstance().toad.setLocation((player.posX-22),(player.posY-28));
        }
        if(Jmain.getInstance().playing.referencia == 4){
            Jmain.getInstance().yoshi.setLocation((player.posX-22),(player.posY-28));
        }
        player.verifyTeleport();

        return;
    }

    @Override
    public void ventanaEvento(Player player) {
        Jmain.getInstance().corriendoJuego = true;


        frmtele = new JFrame();
        frmtele.setBounds(740, 130, 450, 305);
        frmtele.setUndecorated(true);
        frmtele.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel100 = new JPanel();
        panel100.setLayout(null);
        panel100.setSize(600, 410);
        frmtele.add(panel100);

        bg18 = new JLabel();
        bg18.setBounds(0, 0, 450, 310);
        ImageIcon bgurl100 = new ImageIcon(getClass().getResource("/Eventos/teletransporte.png"));
        bg18.setIcon(bgurl100);


        panel100.add(bg18);


        frmtele.setVisible(true);


        evento(player);
        Jmain.getInstance().actualizarLabels();
        JOptionPane.showMessageDialog(null, "TE ESTAS TELETRANSPORTANDO");


        frmtele.dispose();


        Jmain.getInstance().corriendoJuego = false;
    }
}
