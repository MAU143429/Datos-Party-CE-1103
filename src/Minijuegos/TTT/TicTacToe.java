package Minijuegos.TTT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    public ImageIcon logoImage, bgImage;
    public JPanel buttonContainer;
    public JLabel bgLabel;
    boolean temp = false;
    JButton[][] TableroGrafico = new JButton[3][3];
    Juego juego = new Juego();
    public TicTacToe(){
        this.setTitle("Tic-Tac-Toe");
        this.setBounds(250,30,900,720);
        this.setPreferredSize(new Dimension(900,720));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        bgLabel = new JLabel();
        bgImage = new ImageIcon(getClass().getResource("/Minijuegos/TTT/bg.png"));
        bgLabel.setIcon(bgImage);
        bgLabel.setBackground(Color.blue);

        JLabel gameLabel = new JLabel();
        gameLabel.setText("Game logo");

        buttonContainer = new JPanel();
        buttonContainer.setLayout(null);
        buttonContainer.setOpaque(false);

        JButton btn1 = new JButton();
        btn1.setBackground(new Color(83, 148, 252));

        JButton btn2 = new JButton();
        btn2.setBackground(new Color(83, 148, 252));

        JButton btn3 = new JButton();
        btn3.setBackground(new Color(83, 148, 252));

        JButton btn4 = new JButton();
        btn4.setBackground(new Color(83, 148, 252));

        JButton btn5 = new JButton();
        btn5.setBackground(new Color(83, 148, 252));

        JButton btn6 = new JButton();
        btn6.setBackground(new Color(83, 148, 252));

        JButton btn7 = new JButton();
        btn7.setBackground(new Color(83, 148, 252));

        JButton btn8 = new JButton();
        btn8.setBackground(new Color(83, 148, 252));

        JButton btn9 = new JButton();
        btn9.setBackground(new Color(83, 148, 252));

        JButton btn10 = new JButton();
        btn10.setText("Cerrar");
        btn10.setBackground(new Color(83, 148, 252));
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrar();
            }
        });


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
        container.add(buttonContainer);
        container.add(btn10);
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
    void cerrar(){
        this.setVisible(false);
        this.dispose();
    }

    public static void main(String[] Args){
        new TicTacToe();

    }
}
