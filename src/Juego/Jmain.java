package Juego;
import Casillas.Casilla;
import EstructurasDatos.SimpleList;
import Inicio.Main;
import Market.market;
import Music.musicstuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * Jmain
 *Esta clase es la que ejecuta la ventana donde se aloja el juego
 *@authors Mauricio C. , Naheem Johnson , Jose Espinoza

 */
public class Jmain extends JFrame implements ActionListener {
    public JFrame frm2,frmgcongra;
    public JLabel bg2, cnp1, cnp2, cnp3, cnp4, str1, str2, str3, str4, round, pgame, mario, luigi, toad, yoshi, dado1, dado2, estrella, preronda, preturno,bg31;
    public Casilla casillaActual;
    public JButton btnmkt, btndados, avanzar;
    public boolean corriendoJuego,ganadorf;
    protected Dados dado;
    public SimpleList PlayerList,StarList,CoinList,CLabelList,SLabelList;
    public Player pmario, pluigi, ptoad, pyoshi, playing;
    public int jugadores, rounds,ganador,ganador1;
    private Star star;
    public JPanel panel4;
    public JTextField textmovimientos;
    public Player winner;
    /**
     * Sinleton para Jmain
     */
    private static Jmain instance = null;
    /**
     * Jmain
     * Este constructor crea un frame, un panel y aloja objetos en ellos
     *
     * @authors Mauricio C. , Naheem Johnson , Jose Espinoza
     */
    public Jmain() {
        ganadorf = false;
        this.casillaActual = null;
        Map mapa = Map.getInstance();
        this.PlayerList = new SimpleList() {
        };
        this.rounds = 0;
        this.corriendoJuego = false;
        this.dado = new Dados();
        jugadores = Main.getInstance().getPlayers();
        System.out.println(jugadores);
        this.CLabelList = new SimpleList() {
        };
        CLabelList.add(cnp1);
        CLabelList.add(cnp2);
        CLabelList.add(cnp3);
        CLabelList.add(cnp4);
        this.SLabelList = new SimpleList() {
        };
        SLabelList.add(str1);
        SLabelList.add(str2);
        SLabelList.add(str3);
        SLabelList.add(str4);

        //############################Frame###############################

        frm2 = new JFrame("Datos Party 1");
        frm2.setBounds(0, 0, 1295, 947);
        frm2.setTitle("Datos Party 1");
        frm2.setLocationRelativeTo(null);
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //############################Panel###############################

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setSize(1330, 947);
        frm2.add(panel4);

        //############################Botones###############################

        avanzar = new JButton("Avanzar");
        avanzar.setBounds(1030, 609, 100, 50);
        avanzar.setVisible(false);
        avanzar.addActionListener(this);
        panel4.add(avanzar);
        btnmkt = new JButton();
        btnmkt.setBounds(1184, 811, 80, 80);
        ImageIcon btnurl7 = new ImageIcon(getClass().getResource("/Juego/carrito.png"));
        btnmkt.setIcon(btnurl7);
        btnmkt.setBorderPainted(false);
        btnmkt.setContentAreaFilled(false);
        btnmkt.setOpaque(false);
        btnmkt.addActionListener(this);
        panel4.add(btnmkt);
        btndados = new JButton("TIRAR DADOS");
        btndados.setBounds(870, 700, 385, 82);
        ImageIcon btnurl12 = new ImageIcon(getClass().getResource("/Juego/roll.png"));
        btndados.setIcon(btnurl12);
        btndados.addActionListener(this);
        panel4.add(btndados);

        //############################Labels###############################

        textmovimientos = new JTextField();
        textmovimientos.setBounds(950, 609, 50, 50);
        textmovimientos.setVisible(false);
        panel4.add(textmovimientos);

        //##Stars##

        str1 = new JLabel("0");
        str1.setFont(new Font("Serif", Font.BOLD, 40));
        str1.setForeground(Color.WHITE);
        str1.setBounds(1007, 75, 40, 40);
        panel4.add(str1);

        str2 = new JLabel("0");
        str2.setFont(new Font("Serif", Font.BOLD, 40));
        str2.setForeground(Color.WHITE);
        str2.setBounds(1007, 160, 40, 40);
        panel4.add(str2);

        str3 = new JLabel("0");
        str3.setFont(new Font("Serif", Font.BOLD, 40));
        str3.setForeground(Color.WHITE);
        str3.setBounds(1007, 235, 40, 40);
        panel4.add(str3);

        str4 = new JLabel("0");
        str4.setFont(new Font("Serif", Font.BOLD, 40));
        str4.setForeground(Color.WHITE);
        str4.setBounds(1007, 305, 40, 40);
        panel4.add(str4);

        //##Coins##

        cnp1 = new JLabel("0");
        cnp1.setFont(new Font("Serif", Font.BOLD, 40));
        cnp1.setForeground(Color.WHITE);
        cnp1.setBounds(1187, 75, 80, 40);
        panel4.add(cnp1);

        cnp2 = new JLabel("0");
        cnp2.setFont(new Font("Serif", Font.BOLD, 40));
        cnp2.setForeground(Color.WHITE);
        cnp2.setBounds(1187, 160, 80, 40);
        panel4.add(cnp2);

        cnp3 = new JLabel("0");
        cnp3.setFont(new Font("Serif", Font.BOLD, 40));
        cnp3.setForeground(Color.WHITE);
        cnp3.setBounds(1187, 235, 80, 40);
        panel4.add(cnp3);

        cnp4 = new JLabel("0");
        cnp4.setFont(new Font("Serif", Font.BOLD, 40));
        cnp4.setForeground(Color.WHITE);
        cnp4.setBounds(1187, 305, 80, 40);
        panel4.add(cnp4);

        pgame = new JLabel("Turn of Player: ");
        pgame.setFont(new Font("Serif", Font.BOLD, 30));
        pgame.setForeground(Color.WHITE);
        pgame.setBounds(867, 830, 400, 40);
        panel4.add(pgame);

        preturno = new JLabel();
        preturno.setFont(new Font("Serif", Font.BOLD, 30));
        preturno.setForeground(Color.WHITE);
        preturno.setBounds(1100, 800,80,80);
        panel4.add(preturno);


        round = new JLabel("0");
        round.setFont(new Font("Serif", Font.BOLD, 30));
        round.setForeground(Color.WHITE);
        round.setBounds(980, 795, 400, 40);
        panel4.add(round);

        estrella = new JLabel("star");
        estrella.setBounds(5000, 5000, 50, 50);
        ImageIcon fotostar = new ImageIcon(getClass().getResource("/Juego/estrella.png"));
        estrella.setIcon(fotostar);
        panel4.add(estrella);

        preronda = new JLabel("Round: ");
        preronda.setFont(new Font("Serif", Font.BOLD, 30));
        preronda.setForeground(Color.WHITE);
        preronda.setBounds(867, 795, 400, 40);
        panel4.add(preronda);

        //###########################Jugadores##########################################

        mario = new JLabel();
        mario.setBounds(697, 781, 50, 50);
        ImageIcon bgurl35 = new ImageIcon(getClass().getResource("/Juego/P1.png"));
        mario.setIcon(bgurl35);
        mario.setVisible(true);
        panel4.add(mario);
        validate();

        luigi = new JLabel();
        luigi.setBounds(697, 781, 50, 50);
        ImageIcon bgurl36 = new ImageIcon(getClass().getResource("/Juego/P2.png"));
        luigi.setIcon(bgurl36);
        luigi.setVisible(true);
        panel4.add(luigi);
        validate();

        toad = new JLabel();
        toad.setBounds(697, 781, 50, 50);
        ImageIcon bgurl37 = new ImageIcon(getClass().getResource("/Juego/P3.png"));
        toad.setIcon(bgurl37);
        toad.setVisible(true);
        panel4.add(toad);
        validate();

        yoshi = new JLabel();
        yoshi.setBounds(697, 781, 50, 50);
        ImageIcon bgurl38 = new ImageIcon(getClass().getResource("/Juego/P4.png"));
        yoshi.setIcon(bgurl38);
        yoshi.setVisible(true);
        panel4.add(yoshi);
        validate();

        //#####################DADOS#####################################################

        dado1 = new JLabel();
        dado1.setBounds(889, 432, 160, 160);
        ImageIcon imagendado = new ImageIcon(getClass().getResource("/Juego/dadoroll1.png"));
        dado1.setIcon(imagendado);

        dado2 = new JLabel();
        dado2.setBounds(1069, 432, 160, 160);
        dado2.setIcon(imagendado);

        panel4.add(dado1);
        panel4.add(dado2);

        //##Background####################################################################

        bg2 = new JLabel();
        bg2.setBounds(0, 0, 1280, 900);
        ImageIcon bgurl1 = new ImageIcon(getClass().getResource("/Juego/Jfondo.png"));
        bg2.setIcon(bgurl1);
        validate();
        panel4.add(bg2);
        frm2.setVisible(true);
    }


    ///////////////////////////////////////////CREAR JUGADORES//////////////////////////////////////////////////////////

    /**
     * createPlayers
     * @param jugadores
     * Método que crea los jugadores
     * @author Jose A.
     */
    public void createPlayers(int jugadores) {
        switch (jugadores) {
            case 1:
                pmario = new Player(1);
                PlayerList.add(pmario);
                luigi.setVisible(false);
                toad.setVisible(false);
                yoshi.setVisible(false);
                textmovimientos.setVisible(true);
                avanzar.setVisible(true);
                actualizarLabels();
                break;

            case 2:
                pmario = new Player(1);
                pluigi = new Player(2);
                PlayerList.add(pmario);
                PlayerList.add(pluigi);
                toad.setVisible(false);
                yoshi.setVisible(false);
                actualizarLabels();
                break;
            case 3:
                pmario = new Player(1);
                pluigi = new Player(2);
                ptoad = new Player(3);
                PlayerList.add(pmario);
                PlayerList.add(pluigi);
                PlayerList.add(ptoad);
                yoshi.setVisible(false);
                actualizarLabels();
                break;
            case 4:
                pmario = new Player(1);
                pluigi = new Player(2);
                ptoad = new Player(3);
                pyoshi = new Player(4);
                PlayerList.add(pmario);
                PlayerList.add(pluigi);
                PlayerList.add(ptoad);
                PlayerList.add(pyoshi);
                actualizarLabels();
                break;
        }
        CoinList = new SimpleList();
        StarList = new SimpleList();
        for (int i = 0; i < PlayerList.getLength(); i++) {
            CoinList.add(Integer.toString(castToPlayer(PlayerList.getPos(i)).monedas));
            StarList.add(Integer.toString(castToPlayer(PlayerList.getPos(i)).estrellas));
        }
    }

    /**
     * ganadoresEstrellas
     * Metodo que define los ganadores del juego por medio de estrellas
     * @author Naheem J.
     */
    public void ganadoresEstrellas() {
        int player1 = castToPlayer(PlayerList.getPos(0)).estrellas;
        int player2 = castToPlayer(PlayerList.getPos(1)).estrellas;
        int player3 = castToPlayer(PlayerList.getPos(2)).estrellas;
        int player4 = castToPlayer(PlayerList.getPos(3)).estrellas;
        if(PlayerList.getLength() == 2){
            if (player1 > player2) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
                ganadorf = true;
                return;
            }if (player2 > player1) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
                ganadorf = true;
                return;
            }
            if(player1 == player2  && ganadorf == false){
                ganadoresMonedas();
            }


        }
        if(PlayerList.getLength() == 3){
            if (player1 > player2 && player1 > player3) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
                ganadorf = true;
                return;
            }
            if (player2 > player1 && player2 > player3) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
                ganadorf = true;
                return;
            }
            if (player3 > player1 && player3 > player2) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Toad wins!!!");
                winner = castToPlayer(PlayerList.getPos(2));
                ganadorf = true;
                return;
            }
            if(player1 == player2 || player1 == player3 || player2 == player3  && ganadorf == false){
                ganadoresMonedas();
            }

        }
        if(PlayerList.getLength() == 4){
            if (player1 > player2 && player1 > player3 && player1 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
                ganadorf = true;
                return;
            }
            if (player2 > player1 && player2 > player3 && player2 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
                ganadorf = true;
                return;
            }
            if (player3 > player1 && player3 > player2 && player3 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of stars, Toad wins!!!");
                winner = castToPlayer(PlayerList.getPos(2));
                ganadorf = true;
                return;
            }
            if (player4 > player1 && player4 > player2 && player4 > player3){
                JOptionPane.showMessageDialog(null, "By the number of stars, Yoshi wins!!!");
                winner = castToPlayer(PlayerList.getPos(3));
                ganadorf = true;
                return;
            }
            if(player1 == player2 || player1 == player3 || player1 == player4 || player2 == player3 || player2 == player4 ||player3 == player4 && ganadorf == false){
                ganadoresMonedas();
            }
        }
    }

    /**
     * ganadoresMonedas
     * Metodo que define los ganadores del juego por medio de monedas
     * @author Naheem J.
     */
    public void ganadoresMonedas(){
        int player1 = castToPlayer(PlayerList.getPos(0)).monedas;
        int player2 = castToPlayer(PlayerList.getPos(1)).monedas;
        int player3 = castToPlayer(PlayerList.getPos(2)).monedas;
        int player4 = castToPlayer(PlayerList.getPos(3)).monedas;
        if(PlayerList.getLength() == 2){
            if (player1 > player2) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
            } else{
                JOptionPane.showMessageDialog(null, "By the number of coins, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
            }
        }
        if(PlayerList.getLength() == 3){
            if (player1 > player2 && player1 > player3) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
            }

            if (player2 > player1 && player2 > player3) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
            }
            if (player3 > player1 && player3 > player2) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Toad wins!!!");
                winner = castToPlayer(PlayerList.getPos(2));
            }
        }
        if(PlayerList.getLength() == 4){
            if (player1 > player2 && player1 > player3 && player1 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Mario wins!!!");
                winner = castToPlayer(PlayerList.getPos(0));
            }
            if (player2 > player1 && player2 > player3 && player2 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Luigi wins!!!");
                winner = castToPlayer(PlayerList.getPos(1));
            }
            if (player3 > player1 && player3 > player2 && player3 > player4) {
                JOptionPane.showMessageDialog(null, "By the number of coins, Toad wins!!!");
                winner = castToPlayer(PlayerList.getPos(2));
            }
            if (player4 > player1 && player4 > player2 && player4 > player3){
                JOptionPane.showMessageDialog(null, "By the number of coins, Yoshi wins!!!");
                winner = castToPlayer(PlayerList.getPos(3));
            }
        }
    }

    ////////////////////////////////////////////////////MANEJO DE TURNOS////////////////////////////////////////////////////////////////////

    /**
     * turns
     * Método para los turnos de los jugadores del juego
     * @author Jose A.
     * @author Mauricio C.
     */
    public void turns() {
        if (!corriendoJuego) {
            for (int i = 0; i < PlayerList.getLength(); i++) {
                if (!castToPlayer(PlayerList.getPos(i)).jugado) {
                    this.playing = castToPlayer(PlayerList.getPos(i));
                    System.out.println(Jmain.getInstance().playing.referencia);
                    castToPlayer(PlayerList.getPos(i)).jugado = true;
                    lanzarDado();

                    if (PlayerList.getLength() == 2) {

                        if (playing == PlayerList.getPos(0)) {
                            ImageIcon bgurl57 = new ImageIcon(getClass().getResource("/Juego/P1.png"));
                            preturno.setIcon(bgurl57);
                        }
                        if (playing == PlayerList.getPos(1)) {
                            ImageIcon bgurl58 = new ImageIcon(getClass().getResource("/Juego/P2.png"));
                            preturno.setIcon(bgurl58);

                        }
                    }
                    if (PlayerList.getLength() == 3) {
                        if (playing == PlayerList.getPos(0)) {
                            ImageIcon bgurl57 = new ImageIcon(getClass().getResource("/Juego/P1.png"));
                            preturno.setIcon(bgurl57);
                        }
                        if (playing == PlayerList.getPos(1)) {
                            ImageIcon bgurl58 = new ImageIcon(getClass().getResource("/Juego/P2.png"));
                            preturno.setIcon(bgurl58);
                        }
                        if (playing == PlayerList.getPos(2)) {
                            ImageIcon bgurl59 = new ImageIcon(getClass().getResource("/Juego/P3.png"));
                            preturno.setIcon(bgurl59);
                        }
                    }

                    if (PlayerList.getLength() == 4) {
                        if (playing == PlayerList.getPos(0)) {
                            ImageIcon bgurl57 = new ImageIcon(getClass().getResource("/Juego/P1.png"));
                            preturno.setIcon(bgurl57);
                        }
                        if (playing == PlayerList.getPos(1)) {
                            ImageIcon bgurl58 = new ImageIcon(getClass().getResource("/Juego/P2.png"));
                            preturno.setIcon(bgurl58);
                        }
                        if (playing == PlayerList.getPos(2)) {
                            ImageIcon bgurl59 = new ImageIcon(getClass().getResource("/Juego/P3.png"));
                            preturno.setIcon(bgurl59);
                        }
                        if (playing == PlayerList.getPos(3)) {
                            ImageIcon bgurl60 = new ImageIcon(getClass().getResource("/Juego/P4.png"));
                            preturno.setIcon(bgurl60);


                        }
                    }

                    return;
                }
            }
            for (int i = 0; i < PlayerList.getLength(); i++) {
                castToPlayer(PlayerList.getPos(i)).jugado = false;
            }
            rounds++;
            if (rounds == 25) {

                ganadoresEstrellas();
                celebracion();
                frm2.setVisible(false);
                frm2.dispose();
                System.exit(0);

            } else {
                MGS minijuego = new MGS();
                actualizarLabels();
            }
        }

    }

    /**
     * crearMario
     * Método que crea al jugador Mario
     * @author Jose A.
     */
    public void crearMario(){
        playing = castToPlayer(PlayerList.getPos(0));
    }

    ////////////////////////////////////////////////////////LANZA DADO////////////////////////////////////////////////////////////////

    /**
     * lanzarDado
     * Método para empezar el timer dado
     * @author Naheem J.
     */
    public void lanzarDado(){
        corriendoJuego = true;
        dado.tm.start();
    }

    /**
     * celebracion
     * Método que crea la celebración dependiendo del jugdor que gane
     * @author Mauricio C.
     */
    public void celebracion(){
        frmgcongra = new JFrame();
        frmgcongra.setBounds(740, 130, 450, 305);
        frmgcongra.setUndecorated(true);
        frmgcongra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel100 = new JPanel();
        panel100.setLayout(null);
        panel100.setSize(600, 410);
        frmgcongra.add(panel100);

        bg31 = new JLabel();
        bg31.setBounds(0, 0, 450, 310);
        panel100.add(bg31);



        if( winner == PlayerList.getPos(0)) {
            ImageIcon bgurl200 = new ImageIcon(getClass().getResource("/Juego/mariowin.png"));
             bg31.setIcon(bgurl200);

        }
        if( winner == PlayerList.getPos(1)) {
            ImageIcon bgurl201 = new ImageIcon(getClass().getResource("/Juego/luigiwin.png"));
            bg31.setIcon(bgurl201);
        }
        if( winner == PlayerList.getPos(2)) {
            ImageIcon bgurl202 = new ImageIcon(getClass().getResource("/Juego/toadwin.png"));
            bg31.setIcon(bgurl202);
        }
        if( winner == PlayerList.getPos(3)) {
            ImageIcon bgurl203 = new ImageIcon(getClass().getResource("/Juego/yoshiwin.png"));
            bg31.setIcon(bgurl203);
        }



        frmgcongra.setVisible(true);

        JOptionPane.showMessageDialog(null , "Juego Terminado \n GRACIAS POR JUGAR A DATOS PARTY 1 \n DEVELOPERS: \n Mauricio Calderón \n Naheem Johnson \n Jose Antonio Espinoza");

        frmgcongra.setVisible(false);




        Jmain.getInstance().corriendoJuego = false;


    }

    ///////////////////////////////////////////////////////METODOS DE ACTUALIZACIÓN DE OBJETOS////////////////////////////////////

    /**
     * actualizarLabels
     * Método para actualizar los labels que se encuentra en la GUI
     * @author Jose A.
     */
    public void actualizarLabels(){
        if(PlayerList.getLength()==2){
            cnp1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).monedas));
            cnp2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).monedas));
            str1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).estrellas));
            str2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).estrellas));
        }
        if(PlayerList.getLength()==3){
            cnp1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).monedas));
            cnp2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).monedas));
            cnp3.setText(Integer.toString(castToPlayer(PlayerList.getPos(2)).monedas));
            str1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).estrellas));
            str2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).estrellas));
            str3.setText(Integer.toString(castToPlayer(PlayerList.getPos(2)).estrellas));
        }
        if(PlayerList.getLength()==4){
            cnp1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).monedas));
            cnp2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).monedas));
            cnp3.setText(Integer.toString(castToPlayer(PlayerList.getPos(2)).monedas));
            cnp4.setText(Integer.toString(castToPlayer(PlayerList.getPos(3)).monedas));
            str1.setText(Integer.toString(castToPlayer(PlayerList.getPos(0)).estrellas));
            str2.setText(Integer.toString(castToPlayer(PlayerList.getPos(1)).estrellas));
            str3.setText(Integer.toString(castToPlayer(PlayerList.getPos(2)).estrellas));
            str4.setText(Integer.toString(castToPlayer(PlayerList.getPos(3)).estrellas));
        }
        if(Jmain.getInstance().star == null && rounds != 0){
            Jmain.getInstance().star = Star.getInstance();
        }
        round.setText(Integer.toString(rounds));
    }

   

    ///////////////////////////////////////////////////////////RETORNA LA LISTA DE LOS JUGADORES////////////////////////////////////////////

    /**
     * getPlayerList
     * @return PlayerList
     * Método Singleton
     * @author Jose A.
     */
    public SimpleList getPlayerList(){
        return PlayerList;
    }

    //////////////////////////////////////////////////////////RETORNA UN JUGADOR ALEATORIO DE LA LISTA/////////////////////////////////////

    /**
     * getRandomPlayer
     * @return
     * Método que recibe un jugador random
     * @author Naheem J.
     */
    public Player getRandomPlayer(){
        int pos = new Random().nextInt(PlayerList.getLength());
        return (Player)PlayerList.getPos(pos);
    }
    //////////////////////////////////////SINGLETON DE JMAIN//////////////////////////////////////////////////////////////////////////////

    /**
     * getInstance
     * @return instance
     * Método singleton del Jmain
     * @author Jose A.
     *
     */
    public static Jmain getInstance(){
        if(instance == null){
            instance = new Jmain();
        }
        return instance;
    }
    /**
     * actionPerformed
     *Este metodo abstracto del actionlistener permite darle las funcionalidades a los botones
     *@authors Mauricio C. , Naheem Johnson , Jose Espinoza

     */
    /////////////////////////////////////////////////////////////////////////CONVIERTE A PLAYER UN OBJETO//////////////////////////////////////

    /**
     * castToPlayer
     * @param object
     * Recibe como parametro un objeto
     * @return (Player) object
     * Hace un return del objeto a player
     *@author Jose A.
     * @author Mauricio C.
     */
    public Player castToPlayer (Object object) {
        return (Player) object;
    }

    ////////////////////////////////////////////////////////////////////////MANEJA BOTONES////////////////////////////////////////////////////

    /**
     *actionPerformed
     * Método relacionado con los botones
     * @author Jose A.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == avanzar) {
            Jmain.getInstance().playing.movePlayer(Integer.parseInt(textmovimientos.getText()));
        }
        if (e.getSource() == btnmkt) {
            market prueba1 = new market();
        }

        if (e.getSource() == btndados) {
            turns();
        }
        }
    }


