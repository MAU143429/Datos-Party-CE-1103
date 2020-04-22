package com.dados;
/*/
FALTA HACER QUE CADA TURNO ESTE BOTON SE QUITE APENAS SE LE DA Y SE CONVIERTA EN UN "FINALIZAR TURNO"
O SEA SIMPLEMENTE QUE AL DARLE SE ESCONDA Y QUE APAREZCA AL MOMENTOE EL DE TERMINAR EL TURNO
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI_Temporal extends JFrame implements ActionListener {

    public GUI_Temporal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(100, 100);
        setLocation(100, 100);

        JButton button1 = new JButton("TIRAR DADOS!");
        button1.addActionListener(this);
        add(button1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Temporal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("TIRAR DADOS!")) {
            new Dados();

        }
    }

    }
