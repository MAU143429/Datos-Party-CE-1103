package Dados;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Dados extends JFrame{
    JLabel pic1;
    JLabel pic2;
    Timer tm,xm;
    int x = 0;
    ImageIcon dadoimg1,dadoimg2,dadoimg3,dadoimg4,dadoimg5,dadoimg6;
    int dado1,dado2;
    //Images Path In Array
    String[] list = {
            "/Dados/dado1.png",//0
            "/Dados/dado2.png",//1
            "/Dados/dado3.png",//2
            "/Dados/dado4.png",//3
            "/Dados/dado5.png",//4
            "/Dados/dado6.png"//5

    };

    public Dados(){
        super("Tiro de Dados");
        pic1 = new JLabel();
        pic2 = new JLabel();
        pic1.setBounds(10, 40, 160, 160);
        pic2.setBounds(190,40,160,160);
        SetImageSize(5);
        dadoimg1 = new ImageIcon(getClass().getResource("/Dados/dado1.png"));
        dadoimg2 = new ImageIcon(getClass().getResource("/Dados/dado2.png"));
        dadoimg3 = new ImageIcon(getClass().getResource("/Dados/dado3.png"));
        dadoimg4 = new ImageIcon(getClass().getResource("/Dados/dado4.png"));
        dadoimg5 = new ImageIcon(getClass().getResource("/Dados/dado5.png"));
        dadoimg6 = new ImageIcon(getClass().getResource("/Dados/dado6.png"));
        tm = new Timer(150,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x+=1;
                System.out.println(x);
                if(x >= list.length ){
                    x = 0;
                    dado1 = (int)(Math.random()*6)+1;
                    System.out.println("DADO 1: "+ dado1);
                    dado2 = (int)(Math.random()*6)+1;
                    System.out.println("DADO 2: "+ dado2);
                    tm.stop();

                    if(dado1 == 1){
                        pic1.setIcon(dadoimg1);
                    }
                    if(dado1 == 2){
                        pic1.setIcon(dadoimg2);
                    }
                    if(dado1 == 3){
                        pic1.setIcon(dadoimg3);
                    }
                    if(dado1 == 4){
                        pic1.setIcon(dadoimg4);
                    }
                    if(dado1 == 5){
                        pic1.setIcon(dadoimg5);
                    }
                    if(dado1 == 6){
                        pic1.setIcon(dadoimg6);
                    }
                    if(dado2 == 1){
                        pic2.setIcon(dadoimg1);
                    }
                    if(dado2 == 2){
                        pic2.setIcon(dadoimg2);
                    }
                    if(dado2 == 3){
                        pic2.setIcon(dadoimg3);
                    }
                    if(dado2 == 4){
                        pic2.setIcon(dadoimg4);
                    }
                    if(dado2 == 5){
                        pic2.setIcon(dadoimg5);
                    }
                    if(dado2 == 6){
                        pic2.setIcon(dadoimg6);
                    }

                    int SumaDados = dado1 + dado2;
                    System.out.println("Suma de los Dados " + SumaDados);
                    /*/
                    FALTA PONER QUE ESTE VALOR PUEDA USARSE DESDE OTRO PACKAGE
                    */
                    xm = new Timer(3000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dispose();
                            xm.stop();
                        }
                    });
                    xm.start();
                    }
                }

        });
        add(pic1);
        add(pic2);
        tm.start();
        setLayout(null);
        setBounds(1200,500,450, 260);
        getContentPane().setBackground(Color.WHITE);
        //setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setVisible(true);
    }
    public void SetImageSize(int i){
        ImageIcon icon1 = new ImageIcon(getClass().getResource(list[i]));
        ImageIcon icon2 = new ImageIcon(getClass().getResource(list[i]));
        pic1.setIcon(icon1);
        pic2.setIcon(icon2);

    }

    public static void main(String[] args){

        new Dados();
    }
}