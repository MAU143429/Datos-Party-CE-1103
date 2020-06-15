package Market;

import Juego.Jmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


/**
 * Clase Market
 * Crea el marketplace dentro del juego y lo aloja en una ventana

 * @author Naheem J.
 */
public class market extends JFrame implements ActionListener {

    public JLabel bgMarket;
    public JButton buyX1, buyX2, buyX3;

    /**
     * Constructor de la market
     * Genera toda la interfaz del marketplace y las funcionalidades del mismo
     * @author Naheem J.
     */
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

        buyX1.addActionListener(this);
        buyX2.addActionListener(this);
        buyX3.addActionListener(this);

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
    /**
     * Metodo abstracto actionPerformed
     * Da funcionalidades a los botones
     *
     * @param e
     * @author Naheem J.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buyX1) {
            if(Jmain.getInstance().playing.monedas >= 50){
                Jmain.getInstance().playing.monedas -= 50;
                Jmain.getInstance().playing.estrellas += 1;
                Jmain.getInstance().actualizarLabels();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR NO TIENES SUFICIENTES MONEDAS", "ALERT", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == buyX2) {
            if(Jmain.getInstance().playing.monedas >= 90){
                Jmain.getInstance().playing.monedas -= 90;
                Jmain.getInstance().playing.estrellas += 2;
                Jmain.getInstance().actualizarLabels();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR NO TIENES SUFICIENTES MONEDAS", "ALERT", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == buyX3) {
            if(Jmain.getInstance().playing.monedas >= 135){
                Jmain.getInstance().playing.monedas -= 135;
                Jmain.getInstance().playing.estrellas += 3;
                Jmain.getInstance().actualizarLabels();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR NO TIENES SUFICIENTES MONEDAS", "ALERT", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}







