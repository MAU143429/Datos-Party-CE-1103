package Juego;
import javax.swing.*;

public class Jmain extends JFrame {

    public JFrame frm2;
    public JLabel bg2;
    public Jmain() {

        frm2 = new JFrame("Datos Party 1");
        frm2.pack();
        frm2.setBounds(0, 0, 1295, 947);
        frm2.setTitle("Datos Party 1");
        frm2.setVisible(true);
        frm2.setLocationRelativeTo(null);
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        bg2 = new JLabel();
        bg2.setBounds(0,0,1280,900);
        ImageIcon bgurl1 = new ImageIcon(getClass().getResource("/Juego/Jfondo.png"));
        bg2.setIcon(bgurl1);
        validate();

        frm2.add(bg2);

        }





    public static void main(String args [])
    {
        Jmain start = new Jmain ();




    }
}
