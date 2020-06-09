package Minijuegos.Clicker;

import Juego.Jmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Clicker3
 *Esta clase ejecuta el minijuego clicker para tres jugadores
 *@author Naheem J.

 */
public class Clicker3 extends JFrame implements ActionListener {
    public JLabel bgLabel, clickerTitle, timerGame, clickerCounter1, clickerCounter2, clickerCounter3, clickerImage, clickerImage1, clickerImage2;
    public ImageIcon ButtonImage, coinLabel, bgClicker, minigameTitle;
    public JButton coinButton, startButton;
    public int player1, player2, player3, secondsPassed, playerTimes;
    public Timer timer;
    public TimerTask task;
    public boolean temp = false;


    public Clicker3() {
        playerTimes = 1;
        this.setTitle("Clicker Minigame");
        this.setBounds(30, 30, 1280, 720);
        this.setPreferredSize(new Dimension(1280, 720));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.setLayout(null);

        bgLabel = new JLabel();
        clickerTitle = new JLabel();

        bgClicker = new ImageIcon(getClass().getResource("/Minijuegos/Clicker/bgMinigame.png"));
        bgLabel.setIcon(bgClicker);

        minigameTitle = new ImageIcon(getClass().getResource("/Minijuegos/Clicker/Clicker.png"));
        clickerTitle.setIcon(minigameTitle);

        clickerImage = new JLabel();
        coinLabel = new ImageIcon(getClass().getResource("/Minijuegos/Clicker/coin2.png"));

        clickerImage.setIcon(coinLabel);

        clickerImage1 = new JLabel();
        clickerImage1.setIcon(coinLabel);

        clickerImage2 = new JLabel();
        clickerImage2.setIcon(coinLabel);

        timerGame = new JLabel();
        timerGame.setText("Game is not started yet");
        timerGame.setFont(new Font("Arial", Font.BOLD, 16));


        clickerCounter1 = new JLabel();
        clickerCounter1.setText("Mario: " + player1);
        clickerCounter1.setFont(new Font("Arial", Font.BOLD, 16));

        clickerCounter2 = new JLabel();
        clickerCounter2.setText("Luigi: " + player2);
        clickerCounter2.setFont(new Font("Arial", Font.BOLD, 16));

        clickerCounter3 = new JLabel();
        clickerCounter3.setText("Toad: " + player3);
        clickerCounter3.setFont(new Font("Arial", Font.BOLD, 16));

        coinButton = new JButton();
        ButtonImage = new ImageIcon(getClass().getResource("/Minijuegos/Clicker/coin.png"));
        coinButton.addActionListener(this);
        coinButton.setIcon(ButtonImage);
        coinButton.setBackground(new Color(104, 133, 253));
        coinButton.setBorderPainted(false);
        coinButton.setContentAreaFilled(false);
        coinButton.setOpaque(false);

        startButton = new JButton("START");
        startButton.setFont(new Font("Arial", Font.BOLD, 22));
        startButton.setBackground(new Color(104, 133, 253));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = true;
                coinButton.setEnabled(true);
                startButton.setEnabled(false);
                timer = new Timer();
                timer.scheduleAtFixedRate(task, 1000, 1000);

            }
        });
        task = new TimerTask() {
            @Override
            public void run() {
                secondsPassed++;
                if(playerTimes == 1){
                    timerGame.setText("Mario´s turn: " + secondsPassed + " seconds");
                }
                if(playerTimes == 2){
                    timerGame.setText("Luigi´s turn: " + secondsPassed + " seconds");
                }
                if(playerTimes == 3){
                    timerGame.setText("Toad´s turn: " + secondsPassed + " seconds");
                }
                if (secondsPassed == 15) {
                    if (playerTimes == 3) {
                        secondsPassed = 0;
                        timer.cancel();
                        setWinner();
                    } else {
                        secondsPassed = 0;
                        playerTimes++;
                    }
                }
            }
        };

        bgLabel.setBounds(0, 0, 1280, 720);
        clickerTitle.setBounds(0, 0, 335, 64);
        timerGame.setBounds(550, 100, 300, 100);
        clickerCounter1.setBounds(1100, 45, 150, 40);
        clickerCounter2.setBounds(1100, 80, 150, 40);
        clickerCounter3.setBounds(1100, 115, 150, 40);
        clickerImage.setBounds(1070, 15, 100, 100);
        clickerImage1.setBounds(1070, 50, 100, 100);
        clickerImage2.setBounds(1070, 85, 100, 100);
        coinButton.setBounds(550, 210, 166, 180);
        startButton.setBounds(730, 280, 178, 40);

        container.add(startButton);
        container.add(coinButton);
        container.add(clickerImage2);
        container.add(clickerImage1);
        container.add(clickerImage);
        container.add(clickerCounter3);
        container.add(clickerCounter2);
        container.add(clickerCounter1);
        container.add(timerGame);
        container.add(clickerTitle);
        container.add(bgLabel);


        this.pack();
        this.setVisible(true);
        JOptionPane.showMessageDialog(null, "Lets play Clicker! \n When you press the OK button you will see a big coin, that you have to click in order to win, the player who gets the most amount of clicks wins! \n Each player will have 5 seconds between each turn to get ready, once its passed 5 seconds, start clicking!  \n GOOD LUCK! ");
    }

    public void setWinner() {
        if (player1 > player2 && player1 > player3) {
            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 50;
            Jmain.getInstance().actualizarLabels();
            if(player2 > player3){
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                Jmain.getInstance().actualizarLabels();
            }else{
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                Jmain.getInstance().actualizarLabels();
            }
            JOptionPane.showMessageDialog(null, "MARIO WINS!!!");
            this.setVisible(false);
        }

        if (player2 > player1 && player2 > player3) {
            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 50;
            Jmain.getInstance().actualizarLabels();
            if(player1 > player3){
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 10;
                Jmain.getInstance().actualizarLabels();
            }else{
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 30;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                Jmain.getInstance().actualizarLabels();
            }
            JOptionPane.showMessageDialog(null, "LUIGI WINS!!!");
            this.setVisible(false);
        }
        if (player3 > player1 && player3 > player2) {
            Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(2)).monedas += 50;
            Jmain.getInstance().actualizarLabels();
            if(player1 > player2){
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 30;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 10;
                Jmain.getInstance().actualizarLabels();
            }else{
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(1)).monedas += 30;
                Jmain.getInstance().castToPlayer(Jmain.getInstance().getPlayerList().getPos(0)).monedas += 10;
                Jmain.getInstance().actualizarLabels();
            }
            JOptionPane.showMessageDialog(null, "TOAD WINS!!!");
            this.setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!temp) {
            coinButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "You have to click the start button first!!!");
        }
        if (temp) {
            if (secondsPassed > 5) {
                if (playerTimes == 1) {
                    player1++;
                    clickerCounter1.setText("Mario: " + player1);
                }
                if (playerTimes == 2) {
                    player2++;
                    clickerCounter2.setText("Luigi: " + player2);
                }
                if (playerTimes == 3) {
                    player3++;
                    clickerCounter3.setText("Toad: " + player3);
                }
            }
        }
    }
    /*
    public static void main(String[] Args){
        new Clicker3();
    }
     */
}