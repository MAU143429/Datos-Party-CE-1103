package Minijuegos.Clicker;

import Juego.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Clicker4
 *Esta clase ejecuta el minijuego clicker para tres jugadores
 *@author Naheem J.
 */
public class ClickerDL extends JFrame implements ActionListener {
    public JLabel bgLabel, clickerTitle, timerGame, clickercounter1, clickerCounter2, clickerImage, clickerImage1;
    public ImageIcon ButtonImage, coinLabel, bgClicker, minigameTitle;
    public JButton coinButton, startButton;
    public int player1, player2, secondsPassed, playerTimes;
    public Timer timer;
    public TimerTask task;
    public boolean temp = false;
    public Player retador1, retador2;
    public String r1, r2 = "";

    /**
     * ClickerDL
     * Este constructor de la clase clicker4 lo que se encarga es de crear un frame, un container y aloja los objetos
     * en ellos
     * @author Naheem J
     */
    public ClickerDL() {
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

        timerGame = new JLabel();
        timerGame.setText("Game is not started yet");
        timerGame.setFont(new Font("Arial", Font.BOLD, 16));


        clickercounter1 = new JLabel();
        clickercounter1.setFont(new Font("Arial", Font.BOLD, 16));

        clickerCounter2 = new JLabel();
        clickerCounter2.setFont(new Font("Arial", Font.BOLD, 16));

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
        startButton.addActionListener(e -> {
            temp = true;
            coinButton.setEnabled(true);
            startButton.setEnabled(false);
            timer = new Timer();
            timer.scheduleAtFixedRate(task, 1000, 1000);

        });
        /**
         * TimerTask
         * Thread TimerTask que lo que hace es ejecutar un timer que contiene el conteo de los 15 segundos por jugador
         * @author Naheem J.
         */
        task = new TimerTask() {
            @Override
            public void run() {
                secondsPassed++;
                if (playerTimes == 1) {
                    timerGame.setText(r1+ ": "+ secondsPassed + " seconds");
                }
                if (playerTimes == 2) {
                    timerGame.setText(r2+ ": " + secondsPassed + " seconds");
                }
                if (secondsPassed > 15) {
                    if (playerTimes == 2) {
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
        clickercounter1.setBounds(1100, 45, 150, 40);
        clickerCounter2.setBounds(1100, 80, 150, 40);
        clickerImage.setBounds(1070, 15, 100, 100);
        clickerImage1.setBounds(1070, 50, 100, 100);
        coinButton.setBounds(550, 210, 166, 180);
        startButton.setBounds(730, 280, 178, 40);

        container.add(startButton);
        container.add(coinButton);
        container.add(clickerImage1);
        container.add(clickerImage);
        container.add(clickerCounter2);
        container.add(clickercounter1);
        container.add(timerGame);
        container.add(clickerTitle);
        container.add(bgLabel);


        this.pack();
        this.setVisible(true);

        retador1 = Jmain.getInstance().getRandomPlayer();
        retador2 = Jmain.getInstance().getRandomPlayer();

        while (retador1 == retador2) {
            retador2 = Jmain.getInstance().getRandomPlayer();
        }

        if (Jmain.getInstance().getPlayerList().getLength() == 4) {
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)) {
                r1 = "Mario";
                clickercounter1.setText(r1 + "  "+player1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)) {
                r1 = "Luigi";
                clickercounter1.setText(r1 + "  "+ player1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(2)){
                r1 = "Toad";
                clickercounter1.setText(r1+ "  " + player1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(3)){
                r1 = "Yoshi";
                clickercounter1.setText(r1+ "  " + player1);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)){
                r2 = "Mario";
                clickerCounter2.setText(r2+ "  " + player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)){
                r2 = "Luigi";
                clickerCounter2.setText(r2 + "  "+ player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(2)){
                r2 = "Toad";
                clickerCounter2.setText(r2+ "  " + player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(3)){
                r2 = "Yoshi";
                clickerCounter2.setText(r2+ "  " + player2);
            }
        }
        if(Jmain.getInstance().getPlayerList().getLength() == 3) {
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)) {
                r1 = "Mario";
                clickercounter1.setText(r1 + "  " + player1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)) {
                r1 = "Luigi";
                clickercounter1.setText(r1 + "  " + player1);

            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(2)) {
                r1 = "Toad";
                clickercounter1.setText(r1 + "  " + player1);
            }


            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)) {
                r2 = "Mario";
                clickercounter1.setText(r2 + "  " + player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)) {
                r2 = "Luigi";
                clickerCounter2.setText(r2 + "  " + player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(2)) {
                r2 = "Toad";
                clickerCounter2.setText(r2 + "  " + player2);
            }
        }

        if(Jmain.getInstance().getPlayerList().getLength() == 2){
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(0)) {
                r1 = "Mario";
                clickercounter1.setText(r1+ "  " + player1);
            }
            if (retador1 == Jmain.getInstance().getPlayerList().getPos(1)) {
                r1 = "Luigi";
                clickercounter1.setText(r1+ "  " + player1);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(0)){
                r2 = "Mario";
                clickerCounter2.setText(r2+ "  " + player2);
            }
            if (retador2 == Jmain.getInstance().getPlayerList().getPos(1)){
                r2 = "Luigi";
                clickerCounter2.setText(r2 + "  "+ player2);
            }
        }




        JOptionPane.showMessageDialog(null, "Lets play Clicker! \n RANDOM DUEL!!! \n When you press the OK button you will see a big coin, that you have to click in order to win, the player who gets the most amount of clicks wins! \n Each player will have 5 seconds between each turn to get ready, once its passed 5 seconds, start clicking!  \n GOOD LUCK! ");

    }
    /**
     * setWinner
     * Este método se encarga de elegir un primer, segundo, tercer y cuarto lugar, y darle las monedas correspondientes a los jugadores.
     * @author Naheem J
     */
    public void setWinner() {
        if (player1 > player2) {
            retador1.monedas += 50;
            Jmain.getInstance().actualizarLabels();
            if (retador2.monedas <= 50){
                retador2.monedas = 0;
            }else{
                retador2.monedas -= 50;
            }
            Jmain.getInstance().actualizarLabels();
            JOptionPane.showMessageDialog(null,"EL GANADOR ES" + " " + r1);
            this.setVisible(false);
            this.dispose();
        }if (player2 > player1) {
            retador2.monedas += 50;
            Jmain.getInstance().actualizarLabels();
            if (retador1.monedas <= 50){
                retador1.monedas = 0;
            }else{
                retador1.monedas -= 50;
            }
            Jmain.getInstance().actualizarLabels();
            JOptionPane.showMessageDialog(null,"EL GANADOR ES" + " "+ r2);
            this.setVisible(false);
            this.dispose();
        }
    }
    /**
     * actionPerformed
     * Este método abstracto se encarga de realizar una suma de 1 cada vez que se realice un clic, si la variable
     * seconds passed no es mayor que 5, el boton no se podrá ejecutar
     * @author Naheem J
     */
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
                    clickercounter1.setText(r1 + player1);
                }
                if (playerTimes == 2) {
                    player2++;
                    clickerCounter2.setText(r2 + player2);
                }
            }
        }
    }
}


