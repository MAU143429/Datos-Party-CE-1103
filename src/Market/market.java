package Market;

import javax.swing.*;
import java.awt.*;

public class market extends JFrame {

    public JLabel bgMarket;
    public JButton buyX1, buyX2, buyX3;


    public market() {

        this.setBounds(100, 100, 1295, 947);
        this.setTitle("Market");

        Container container = this.getContentPane();
        container.setLayout(null);

        bgMarket = new JLabel();
        ImageIcon bgurl11 = new ImageIcon(getClass().getResource("/Market/Market.png"));
        bgMarket.setIcon(bgurl11);
        validate();


        buyX1 = new JButton();
        buyX2 = new JButton();
        buyX3 = new JButton();

        ImageIcon btnurl8 = new ImageIcon(getClass().getResource("/Market/X1.png"));
        buyX1.setIcon(btnurl8);

        ImageIcon btnurl9 = new ImageIcon(getClass().getResource("/Market/X2.png"));
        buyX2.setIcon(btnurl9);

        ImageIcon btnurl10 = new ImageIcon(getClass().getResource("/Market/X3.png"));
        buyX3.setIcon(btnurl10);


        bgMarket.setBounds(0, 0, 1290, 900);
        buyX1.setBounds(964, 298, 282, 100);
        buyX2.setBounds(964, 483, 282, 100);
        buyX3.setBounds(964, 655, 282, 100);

        container.add(buyX1);
        container.add(buyX2);
        container.add(buyX3);
        container.add(bgMarket);


        this.setVisible(true);
    }
    public static void main(String args[]) {
        market prueba1  = new market();


    }


}
        /*
        if (e.getSource()==miBoton1){
            System.out.println("Compraste una estrella");
            Coins-=50;
            Stars+=1;
            System.out.println(Coins);
            System.out.println(Stars);
        }
        if (e.getSource()==miBoton2){
            System.out.println("Compraste dos estrella");
            Coins-=100;
            Stars+=2;
            System.out.println(Coins);
            System.out.println(Stars);
        }
        if (e.getSource()==miBoton3){
            System.out.println("Compraste tres estrella");
            Coins-=150;
            Stars+=3;
            System.out.println(Coins);
            System.out.println(Stars);
        }
        */




