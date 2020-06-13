package Minijuegos.TTT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TicTacToe
 * Esta clase hereda frame y se encanrga de la parte gráfica del minijuego Tic tac toe
 * @author Naheem J.
 */

public class TicTacToe extends JFrame {
    public ImageIcon logoImage, bgImage, tttBase;
    public JPanel buttonContainer;
    public JLabel bgLabel, backgroundGame, gameLogo;
    boolean temp = false;
    JButton[][] TableroGrafico = new JButton[3][3];
    Juego juego = new Juego();

    /**
     * TicTacToe
     * Contructor de la clase TicTacToe en donde se colocan todos los aspectos gráficos de la GUI
     * @author Naheem J.
     */
    public TicTacToe(){
        this.setTitle("Tic-Tac-Toe");
        this.setBounds(250,30,900,720);
        this.setPreferredSize(new Dimension(900,720));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        //this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        Container container = this.getContentPane();
        container.setLayout(null);

        bgLabel = new JLabel();
        bgImage = new ImageIcon(getClass().getResource("/Minijuegos/TTT/bg.png"));
        bgLabel.setIcon(bgImage);
        bgLabel.setBackground(Color.blue);

        tttBase = new ImageIcon(getClass().getResource("/Minijuegos/TTT/tttBase.png"));

        logoImage = new ImageIcon(getClass().getResource("/Minijuegos/TTT/gameLogo.png"));

        JLabel gameLabel = new JLabel();
        gameLabel.setIcon(logoImage);

        buttonContainer = new JPanel();
        buttonContainer.setLayout(null);
        buttonContainer.setOpaque(false);

        backgroundGame = new JLabel();
        backgroundGame.setIcon(tttBase);


        JButton btn1 = new JButton();
        btn1.setBackground(new Color(83, 148, 252));
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setOpaque(false);

        JButton btn2 = new JButton();
        btn2.setBackground(new Color(83, 148, 252));
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setOpaque(false);

        JButton btn3 = new JButton();
        btn3.setBackground(new Color(83, 148, 252));
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setOpaque(false);

        JButton btn4 = new JButton();
        btn4.setBackground(new Color(83, 148, 252));
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setOpaque(false);

        JButton btn5 = new JButton();
        btn5.setBackground(new Color(83, 148, 252));
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setOpaque(false);

        JButton btn6 = new JButton();
        btn6.setBackground(new Color(83, 148, 252));
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setOpaque(false);

        JButton btn7 = new JButton();
        btn7.setBackground(new Color(83, 148, 252));
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setOpaque(false);

        JButton btn8 = new JButton();
        btn8.setBackground(new Color(83, 148, 252));
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setOpaque(false);

        JButton btn9 = new JButton();
        btn9.setBackground(new Color(83, 148, 252));
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setOpaque(false);

        JButton btn10 = new JButton();
        btn10.setText("Cerrar");
        btn10.setBackground(new Color(83, 148, 252));
        btn10.addActionListener(new ActionListener() {
            /**
             *actionPerformed
             * Método asociado al botón cerrar
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrar();
            }
        });


        bgLabel.setBounds(0, 0, 900,720);
        gameLabel.setBounds(0, 0, 500,100);
        buttonContainer.setBounds(180,180, 512, 420);
        backgroundGame.setBounds(210, 150,512, 420);
        btn1.setBounds(10, 8, 100, 100);
        btn2.setBounds(165, 8, 100, 100);
        btn3.setBounds(320, 8, 100, 100);
        btn4.setBounds(10, 138, 100, 100);
        btn5.setBounds(165, 138, 100, 100);
        btn6.setBounds(320, 138, 100, 100);
        btn7.setBounds(10, 260, 100, 100);
        btn8.setBounds(165, 260, 100, 100);
        btn9.setBounds(320, 260, 100, 100);
        btn10.setBounds(750, 600, 100, 30);


        buttonContainer.add(btn9);
        buttonContainer.add(btn8);
        buttonContainer.add(btn7);
        buttonContainer.add(btn6);
        buttonContainer.add(btn5);
        buttonContainer.add(btn4);
        buttonContainer.add(btn3);
        buttonContainer.add(btn2);
        buttonContainer.add(btn1);
        container.add(backgroundGame);
        container.add(buttonContainer);
        container.add(btn10);
        container.add(gameLabel);
        container.add(bgLabel);
        GenerarTableroGrafico();
        JOptionPane.showMessageDialog(null, "Tic tac toe, el primer jugador va a tener asociado una ´X´ y el segundo jugador va a tener asociado un ´O´ \n Una vez finalizado el juego, darle al botón de cerrar!  ");
        this.setVisible(true);


    }

    /**
     * GenerarTableroGrafico
     * Método que genera el genera el tablero gráfico, asocia la parte lógica del juego con la parte gráfica, generando una matriz de botones
     * a los cuales les agrega un actionlistener conforme se recorre en el for la matriz de botones
     * @author Naheem J.
     */
    void GenerarTableroGrafico(){
        int c = 0;
        int f = 0;
        for (int i=0; i < 9; i++){
            TableroGrafico[c][f] = (JButton) buttonContainer.getComponents()[i];
            final int columna = c;
            final int fila = f;
            TableroGrafico[c][f].addActionListener((ActionEvent ae) -> {
                juego.registrarJugada(columna, fila);
                SincronizarTablero();
            });
            c++;
            if (c >= 3){
                c = 0;
                f++;
            }
        }

    }

    /**
     * SincronizarTablero
     * Este método se encarga de sincronizar el tablero de manera que va escribiendo una ¨X¨ o ¨Y¨ dependiendo de la casilla
     * @author Naheem J.
     */
    void SincronizarTablero() {
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                switch (juego.Tablero[c][f]) {
                    case 0:
                        TableroGrafico[c][f].setText("");
                        break;
                    case 1:
                        TableroGrafico[c][f].setText("X");
                        TableroGrafico[c][f].setFont(new Font("Arial", Font.BOLD, 40));
                        break;
                    case 2:
                        TableroGrafico[c][f].setText("O");
                        TableroGrafico[c][f].setFont(new Font("Arial", Font.BOLD, 40));
                        break;
                }
            }
        }

    }

    /**
     * cerrar
     * Método void que se encarga de cerrar la interfaz
     * @author Naheem J
     */
    void cerrar(){
        this.setVisible(false);
        this.dispose();
    }

    /**
     * main
     * @param Args
     * Método main de la clase TicTacToe
     * @author Naheem J.
     */
    public static void main(String[] Args){
        new TicTacToe();

    }
}
