package Eventos;

import Juego.DuelStack;
import Juego.Jmain;
import Juego.Player;
import Minijuegos.Clicker.ClickerDL;
import Minijuegos.RPS.rpsdl;
import Minijuegos.Runner.RunnerDL;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Duel extends Evento {

    public JFrame frmduel;
    public JLabel bg15;

    @Override
    public void evento(Player player) {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 3);
        if(randomInt == 1){
            RunnerDL rpueba = new RunnerDL();
        }
        if(randomInt == 2){
            rpsdl rpueba = new rpsdl();
        }
        if(randomInt == 3){
            ClickerDL rpueba = new ClickerDL();
        }


    }

    @Override
    public void ventanaEvento(Player player) {

        Jmain.getInstance().corriendoJuego = true;


        frmduel = new JFrame();
        frmduel.setBounds(740, 130, 450, 305);
        frmduel.setUndecorated(true);
        frmduel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel100 = new JPanel();
        panel100.setLayout(null);
        panel100.setSize(600, 410);
        frmduel.add(panel100);

        bg15 = new JLabel();
        bg15.setBounds(0, 0, 450, 310);
        ImageIcon bgurl100 = new ImageIcon(getClass().getResource("/Eventos/cambiolug.png"));
        bg15.setIcon(bgurl100);


        panel100.add(bg15);


        frmduel.setVisible(true);

        evento(player);
        Jmain.getInstance().actualizarLabels();


        frmduel.dispose();


        Jmain.getInstance().corriendoJuego = false;
    }

    }

