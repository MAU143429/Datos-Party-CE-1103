package Inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Window extends JFrame {


    public Image imagenfondo;
    public URL bg1;

    public  Window(){

        this.setBounds(0,0,1280,900);
        this.setTitle("Datos Party 1");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        bg1= this.getClass().getResource("/Inicio/Fondo1.png");
        imagenfondo = new ImageIcon(bg1).getImage();

        Container ctn = getContentPane();
        ctn.add(panel1);



}
    public JPanel panel1 = new JPanel() {

        public void paintComponent(Graphics g) {

            g.drawImage(imagenfondo, 0, 0, getWidth(), getHeight(), this);
        }

    };


    public static void main(String args[]){

    Window window1 = new Window();
    Buttons button = new Buttons();



    }
}