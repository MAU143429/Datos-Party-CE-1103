package Minijuegos.Clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Clicker4 extends JFrame implements ActionListener {
    public JLabel bgLabel, clickerTitle, timerGame, clickerCounter1, clickerCounter2, clickerCounter3, clickerCounter4, clickerImage, clickerImage1, clickerImage2, clickerImage3;
    public ImageIcon ButtonImage, coinLabel, bgClicker, minigameTitle;
    public JButton coinButton, startButton;
    public int player1, player2, player3, player4, secondsPassed, playerTimes;
    public Timer timer;
    public TimerTask task;
    public boolean temp = false;


    Clicker4(){
        playerTimes = 1;
        this.setTitle("Clicker Minigame");
        this.setBounds(30,30,1280,720);
        this.setPreferredSize(new Dimension(1280,720));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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

        clickerImage3 = new JLabel();
        clickerImage3.setIcon(coinLabel);

        timerGame = new JLabel();
        timerGame.setText("Game is not started yet :)");
        timerGame.setFont(new Font("Arial",Font.BOLD,16));


        clickerCounter1 = new JLabel();
        clickerCounter1.setText("Player 1: " + player1);
        clickerCounter1.setFont(new Font("Arial",Font.BOLD,16));

        clickerCounter2 = new JLabel();
        clickerCounter2.setText("Player 2: " + player2);
        clickerCounter2.setFont(new Font("Arial",Font.BOLD,16));

        clickerCounter3 = new JLabel();
        clickerCounter3.setText("Player 3: " + player3);
        clickerCounter3.setFont(new Font("Arial",Font.BOLD,16));

        clickerCounter4 = new JLabel();
        clickerCounter4.setText("Player 4: " + player4);
        clickerCounter4.setFont(new Font("Arial",Font.BOLD,16));

        coinButton = new JButton();
        ButtonImage = new ImageIcon(getClass().getResource("/Minijuegos/Clicker/coin.png"));
        coinButton.addActionListener(this);
        coinButton.setIcon(ButtonImage);
        coinButton.setBackground(new Color(104,133,253));
        coinButton.setBorderPainted(false);
        coinButton.setContentAreaFilled(false);
        coinButton.setOpaque(false);

        startButton = new JButton("START");
        startButton.setFont(new Font("Arial",Font.BOLD,22));
        startButton.setBackground(new Color(104,133,253));
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
                timerGame.setText("Player " + playerTimes + "´s turn: " + secondsPassed + " seconds");
                secondsPassed++;
                if (secondsPassed > 15){
                    if (playerTimes == 4){
                        secondsPassed = 0;
                        timerGame.setText(secondsPassed + " seconds passed");
                        timer.cancel();
                        setWinner();
                    }else{
                        secondsPassed = 0;
                        playerTimes++;
                        timerGame.setText("Player " + playerTimes + "´s turn: " + secondsPassed + " seconds");
                    }
                }
            }
        };

        bgLabel.setBounds(0,0,1280,720);
        clickerTitle.setBounds(0,0,335,64);
        timerGame.setBounds(550, 100, 300, 100);
        clickerCounter1.setBounds(1100, 45, 150, 40 );
        clickerCounter2.setBounds(1100, 80, 150,40);
        clickerCounter3.setBounds(1100, 115, 150 , 40);
        clickerCounter4.setBounds(1100, 150, 150, 40);
        clickerImage.setBounds(1070, 15,100,100);
        clickerImage1.setBounds(1070, 50, 100,100);
        clickerImage2.setBounds(1070,85, 100, 100 );
        clickerImage3.setBounds(1070, 120, 100, 100);
        coinButton.setBounds(550,210,166,180);
        startButton.setBounds(730, 280, 178, 40);

        container.add(startButton);
        container.add(coinButton);
        container.add(clickerImage3);
        container.add(clickerImage2);
        container.add(clickerImage1);
        container.add(clickerImage);
        container.add(clickerCounter4);
        container.add(clickerCounter3);
        container.add(clickerCounter2);
        container.add(clickerCounter1);
        container.add(timerGame);
        container.add(clickerTitle);
        container.add(bgLabel);
        JOptionPane.showMessageDialog(null, "Lets play Clicker! \n When you press the OK button you will see a big coin, that you have to click in order to win, the player who gets the most amount of clicks wins! \n Each player will have 5 seconds between each turn to get ready, once its passed 5 seconds, start clicking!  \n GOOD LUCK! ");

        this.pack();
        this.setVisible(true);
    }
    public void setWinner(){
        if (player1 > player2 && player1 > player3 && player1 > player4){
            JOptionPane.showMessageDialog(null, "The winner is player1");
        }if (player2 > player1 && player2 > player3 && player2 > player4 ){
            JOptionPane.showMessageDialog(null, "The winner is player2");
        }if (player3 > player1 && player3 > player2 && player3 > player4 ){
            JOptionPane.showMessageDialog(null, "The winner is player3");
        }if (player4 > player1 && player4 > player2 && player4 > player3 ){
            JOptionPane.showMessageDialog(null, "The winner is player4");
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!temp){
            coinButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "You have to click the start button first!!!");
        }if (temp){
            if (secondsPassed > 5){
                if (playerTimes == 1){
                    player1++;
                    clickerCounter1.setText("Player 1: " +  player1);
                }if (playerTimes == 2){
                    player2++;
                    clickerCounter2.setText("Player 2: " +  player2);
                }if (playerTimes == 3){
                    player3++;
                    clickerCounter3.setText("Player 3: " +  player3);
                }if (playerTimes == 4){
                    player4++;
                    clickerCounter4.setText("Player 4: " +  player4);
                }
            }
        }
    }

    public static void main(String[] Args){
        new Clicker4();
    }
}




