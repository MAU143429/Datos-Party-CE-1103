package Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 * Dados
 * Clase que contiene la lógica de los dados del juego
 * @author Jose A.
 */
public class Dados {
    Timer tm, xm,sm;
    int x = 0;
    ImageIcon dadoimg1, dadoimg2, dadoimg3, dadoimg4, dadoimg5, dadoimg6, dadoroll;
    public int dado1, dado2, SumaDados, dadoani1, dadoani2;
    public static Dados instance = null;
    //Images Path In Array
    String[] list = {
            "/Juego/dado1.png",//0
            "/Juego/dado2.png",//1
            "/Juego/dado3.png",//2
            "/Juego/dado4.png",//3
            "/Juego/dado5.png",//4
            "/Juego/dado6.png"//5

    };
    int num = 0;

    /**
     * Dados
     * constructor que contiene las ubicaciones de las imagenes de los dados
     * @author Jose A.
     */
    public Dados() {
        dadoimg1 = new ImageIcon(getClass().getResource("/Juego/dado1.png"));
        dadoimg2 = new ImageIcon(getClass().getResource("/Juego/dado2.png"));
        dadoimg3 = new ImageIcon(getClass().getResource("/Juego/dado3.png"));
        dadoimg4 = new ImageIcon(getClass().getResource("/Juego/dado4.png"));
        dadoimg5 = new ImageIcon(getClass().getResource("/Juego/dado5.png"));
        dadoimg6 = new ImageIcon(getClass().getResource("/Juego/dado6.png"));
        dadoroll = new ImageIcon(getClass().getResource("/Juego/dadoroll1.png"));

        xm = new Timer(2000, new ActionListener() {
            /**
             *actionPerformed
             * Método asociado al timer xm que se encarga de cargar las imagenes de los dados
             * @author Jose A.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Jmain.getInstance().dado1.setIcon(dadoroll);
                Jmain.getInstance().dado2.setIcon(dadoroll);
                xm.stop();
            }
        });
        tm = new Timer(100, new ActionListener() {
            /**
             *actionPerformed
             * Método en donde contiene la lógica del timer tm en donde se va a realizar la suma de los datos del dado
             * @author Jose A.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                System.out.println(x);
                if (x >= list.length) {
                    x = 0;
                    dado1 = (int) (Math.random() * 6) + 1;
                    System.out.println("DADO 1: " + Dados.getInstance().dado1);
                    dado2 = (int) (Math.random() * 6) + 1;
                    System.out.println("DADO 2: " + Dados.getInstance().dado2);
                    SumaDados = dado1 + dado2;
                    System.out.println("Suma de los Dados " + SumaDados);
                    tm.stop();
                    sm.start();
                }
            }
        });
        sm = new Timer(100, new ActionListener() {
            /**
             *actionPerformed
             * Método relacionado con el timer sm que realiza un TimeUnit.Sleep
             * @author Jose A.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                PutFinal1((Jmain.getInstance().dado.dado1)-1);
                PutFinal2((Jmain.getInstance().dado.dado2)-1);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(num);
                Jmain.getInstance().playing.movePlayer(SumaDados);
                sm.stop();
                xm.start();
            }
        });


    }

    /**
     * SetImageSize
     * @param i
     * Le entra un parámetro i al método el cual lo usa para cambiar el icono del dado
     * @author Jose A.
     */
    public void SetImageSize(int i) {
        ImageIcon icon1 = new ImageIcon(getClass().getResource(list[i]));
        ImageIcon icon2 = new ImageIcon(getClass().getResource(list[i]));
        Jmain.getInstance().dado1.setIcon(icon1);
        Jmain.getInstance().dado2.setIcon(icon2);

    }

    /**
     * PutFinal1
     * @param i
     * Método que carga imagen del parametro i
     * @author Jose A.
     */
    public void PutFinal1(int i){
        ImageIcon icon1 = new ImageIcon(getClass().getResource(list[i]));
        Jmain.getInstance().dado1.setIcon(icon1);
    }

    /**
     * PutFinal2
     * @param i
     * Método que carga una imagen del parametro i
     * @author Jose A.
     */
    public void PutFinal2(int i){
        ImageIcon icon2 = new ImageIcon(getClass().getResource(list[i]));
        Jmain.getInstance().dado2.setIcon(icon2);
    }

    /**
     * getInstance
     * @return instance
     * Método singleton para generar la instancia del dado
     * @author Jose A.
     */
    public static Dados getInstance() {
        if (instance == null) {
            instance = new Dados();
        }
        return instance;
    }

    /**
     * tirarDado
     * @return SumaDados
     * Método que realiza un return de SumaDados
     * @author Jose A.
     */
    public int tirarDado() {
        return SumaDados;
    }
}