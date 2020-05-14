package Minijuegos.TOF;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Tof4 extends JFrame  {


    private JFrame frm6;
    private JPanel panel6;
    private JTextField text5;
    private JLabel question, image;
    private int num,player;



    public Tof4() {

        num = (int) (Math.random() * 1) + 1;
        System.out.println(num);

        frm6 = new JFrame("True or False");
        frm6.setBounds(0, 0, 1295, 947);
        frm6.setLocationRelativeTo(null);
        frm6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setSize(1280, 900);
        frm6.add(panel6);



        text5 = new JTextField();
        text5.setBounds(0, 0, 1, 1);
        panel6.add(text5);
        validate();
        Movimiento2 oyente1 = new Movimiento2();
        text5.addKeyListener(oyente1);
        text5.setForeground(Color.WHITE);

        image = new JLabel();
        validate();
        panel6.add(image);


        question = new JLabel();
        question.setFont(new Font("Serif", Font.BOLD, 60));
        question.setForeground(Color.WHITE);
        panel6.add(question);


//##########################################QUESTIONS###############################################################################################
        //##################MODULO1################################################################
        if (num ==  1) {
                question.setBounds(300, 50, 1000, 250);
                question.setText("Napoleon was of below average height?");
                image.setBounds(470, 260, 419, 217);
                ImageIcon bgurl42 = new ImageIcon(getClass().getResource("/Minijuegos/TOF/napoleon.png"));
                image.setIcon(bgurl42);

            }


                //##################MODULO2################################################################
        if (num ==  2) {

                question.setBounds(300, 50, 1000, 250);
                question.setText("There are more moves in chess than there are atoms in the universe?");
                image.setBounds(470, 260, 419, 217);
                ImageIcon bgurl43 = new ImageIcon(getClass().getResource("/Minijuegos/TOF/chess.png"));
                image.setIcon(bgurl43);
        }
        //##################MODULO3##########################################################################
        if (num ==  3) {

                question.setBounds(300, 50, 1000, 250);
                question.setText("The mathematical name for the shape of a Pringle is hyperbolic paraboloid");
                image.setBounds(470, 260, 419, 217);
                ImageIcon bgurl42 = new ImageIcon(getClass().getResource("/Minijuegos/TOF/pringle.png"));
                image.setIcon(bgurl42);


            }

        JLabel qtn = new JLabel();
        qtn.setBounds(0, 0, 1280, 900);
        ImageIcon bgurl9 = new ImageIcon(getClass().getResource("/Minijuegos/TOF/ftof4p.png"));
        qtn.setIcon(bgurl9);
        validate();
        panel6.add(qtn);

        frm6.setVisible(true);

        JOptionPane.showMessageDialog(null, "Lets play True of False!! \n Answer the question!!\n Answer Fast and WIN more Coins!! \n Enjoy!");
        player += 1;
        JOptionPane.showMessageDialog(null, "Turno del jugador" + " " +player);
    }

    class Movimiento2 implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

            if (num == 1) {
                player = 1;
                String r1, r2, r3, r4;

                if (player == 1) {

                    if (e.getKeyChar() == '1') {
                        r1 = "True";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);

                    }
                    if (e.getKeyChar() == '2') {
                        r1 = "False";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);
                    }
                }
                if (player == 2) {

                    if (e.getKeyChar() == '3') {
                        r2 = "True";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);

                    }
                    if (e.getKeyChar() == '4') {
                        r2 = "False";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);

                    }
                }
                if (player == 3) {


                    if (e.getKeyChar() == '5') {
                        r3 = "True";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador" + " "+ player);


                    }
                    if (e.getKeyChar() == '6') {
                        r3 = "False";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);
                    }
                }

                if (player == 4) {

                    if (e.getKeyChar() == '7') {
                        r4 = "True";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);

                    }
                    if (e.getKeyChar() == '8') {
                        r4 = "False";
                        player += 1;
                        num += 1;
                        JOptionPane.showMessageDialog(null, "Turno del Jugador"+ " " + player);

                    }

                }

                if (player == 4) {
                    JOptionPane.showMessageDialog(null, "Juego Terminado");


                }
            }
        }
    }
        public static void main(String args[]) {

            Tof4 game6 = new Tof4();

        }








}
