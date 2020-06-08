package Minijuegos.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class mainGUI extends JFrame {
    public ImageIcon logoImage, bgImage;
    public JPanel buttonContainer;
    JButton[][] TableroGrafico = new JButton[3][3];
    Juego juego = new Juego();
    mainGUI(){
        this.setTitle("Tic-Tac-Toe");
        this.setBounds(250,30,900,720);
        this.setPreferredSize(new Dimension(900,720));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        JLabel bgLabel = new JLabel();

        JLabel gameLabel = new JLabel();
        gameLabel.setText("Game logo");

        buttonContainer = new JPanel();
        //buttonContainer.setBackground(Color.blue);
        buttonContainer.setLayout(null);

        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();
        JButton btn5 = new JButton();
        JButton btn6 = new JButton();
        JButton btn7 = new JButton();
        JButton btn8 = new JButton();
        JButton btn9 = new JButton();

        bgLabel.setBounds(0, 0, 900,720);
        gameLabel.setBounds(0, 0, 300,100);
        buttonContainer.setBounds(180,180, 512, 420);
        btn1.setBounds(80, 0, 100, 100);
        btn2.setBounds(195, 0, 100, 100);
        btn3.setBounds(310, 0, 100, 100);
        btn4.setBounds(80, 120, 100, 100);
        btn5.setBounds(195, 120, 100, 100);
        btn6.setBounds(310, 120, 100, 100);
        btn7.setBounds(80, 240, 100, 100);
        btn8.setBounds(195, 240, 100, 100);
        btn9.setBounds(310, 240, 100, 100);

        buttonContainer.add(btn9);
        buttonContainer.add(btn8);
        buttonContainer.add(btn7);
        buttonContainer.add(btn6);
        buttonContainer.add(btn5);
        buttonContainer.add(btn4);
        buttonContainer.add(btn3);
        buttonContainer.add(btn2);
        buttonContainer.add(btn1);
        container.add(buttonContainer);
        container.add(gameLabel);
        container.add(bgLabel);
        GenerarTableroGrafico();

        this.setVisible(true);
    }
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
            if (c >= 3) {
                c = 0;
                f++;
            }
        }
    }
    void SincronizarTablero() {
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                switch (juego.Tablero[c][f]) {
                    case 0:
                        TableroGrafico[c][f].setText("");
                        break;
                    case 1:
                        TableroGrafico[c][f].setText("X");
                        break;
                    case 2:
                        TableroGrafico[c][f].setText("O");
                        break;
                }
            }
        }
    }
}
