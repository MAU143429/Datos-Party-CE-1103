package com.dados;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Dados extends JFrame{
    JLabel pic1;
    JLabel pic2;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
            "dado1.png",//0
            "dado2.png",//1
            "dado3.png",//2
            "dado4.png",//3
            "dado5.png",//4
            "dado6.png"//5

    };

    public Dados(){
        super("Tiro de Dados");
        pic1 = new JLabel();
        pic2 = new JLabel();
        pic1.setBounds(10, 10, 200, 200);
        pic2.setBounds(220,10,200,200);
        SetImageSize(5);
        tm = new Timer(150,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x+=1;
                if(x >= list.length ){
                    x = 0;
                    int dado1,dado2;
                    dado1 = (int)(Math.random()*6)+1;
                    System.out.println("DADO 1: "+ dado1);
                    dado2 = (int)(Math.random()*6)+1;
                    System.out.println("DADO 2: "+ dado2);
                    tm.stop();

                    if(dado1 == 1){
                        ImageIcon dadoimg = new ImageIcon("dado1.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);

                    }
                    if(dado1 == 2){
                        ImageIcon dadoimg = new ImageIcon("dado2.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);
                    }
                    if(dado1 == 3){
                        ImageIcon dadoimg = new ImageIcon("dado3.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);
                    }
                    if(dado1 == 4){
                        ImageIcon dadoimg = new ImageIcon("dado4.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);
                    }
                    if(dado1 == 5){
                        ImageIcon dadoimg = new ImageIcon("dado5.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);
                    }
                    if(dado1 == 6){
                        ImageIcon dadoimg = new ImageIcon("dado6.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic1.setIcon(last_dado);
                    }
                    if(dado2 == 1){
                        ImageIcon dadoimg = new ImageIcon("dado1.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }
                    if(dado2 == 2){
                        ImageIcon dadoimg = new ImageIcon("dado2.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }
                    if(dado2 == 3){
                        ImageIcon dadoimg = new ImageIcon("dado3.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }
                    if(dado2 == 4){
                        ImageIcon dadoimg = new ImageIcon("dado4.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }
                    if(dado2 == 5){
                        ImageIcon dadoimg = new ImageIcon("dado5.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }
                    if(dado2 == 6){
                        ImageIcon dadoimg = new ImageIcon("dado6.png");
                        Image imagendado = dadoimg.getImage();
                        Image newImgdado = imagendado.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon last_dado = new ImageIcon(newImgdado);
                        pic2.setIcon(last_dado);
                    }

                    int SumaDados = dado1 + dado2;
                    System.out.println("Suma de los Dados " + SumaDados);
                    /*/
                    FALTA PONER QUE ESTE VALOR PUEDA USARSE DESDE OTRO PACKAGE
                    */




                }
            }
        });
        add(pic1);
        add(pic2);
        tm.start();
        setLayout(null);
        setSize(450, 260);
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void SetImageSize(int i){
        ImageIcon icon1 = new ImageIcon(list[i]);
        ImageIcon icon2 = new ImageIcon(list[i]);
        Image img1 = icon1.getImage();
        Image img2 = icon2.getImage();
        Image newImg1 = img1.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        Image newImg2 = img2.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc1 = new ImageIcon(newImg1);
        ImageIcon newImc2 = new ImageIcon(newImg2);
        pic1.setIcon(newImc1);
        pic2.setIcon(newImc2);

    }

    public static void main(String[] args){

        new Dados();
    }
}