package Juego;

import Casillas.*;
import EstructurasDatos.*;
import java.util.Random;

public class Map {
    private static CircularList caminoprincipal;
    private static SimpleList faseA;
    private static SimpleList faseB;
    private static DoubleLinkedList faseC;
    private static  DoubleLinkedCircularList faseD;

    /**
     * Singleton class for the map
     */
    private static Map instance = null;

    private Map(){

        faseA = new SimpleList();

        faseA.add(new CasillaVerde(434,490,0));//0//YY
        faseA.add(new CasillaMorada(502,510,1));//1//TELEPORT//ZZ
        faseA.add(new CasillaAmarilla(501,298,2));//2//AAA

        faseB = new SimpleList();

        faseB.add(new CasillaAmarilla(275,462,0));//0//VV
        faseB.add(new CasillaAmarilla(275,382,1));//1//WW
        faseB.add(new CasillaAmarilla(275,301,2));//2//XX

        faseC = new DoubleLinkedList();

        faseC.add(new CasillaRoja(92,114,0));//0//SS
        faseC.add(new CasillaAmarilla(143,118,1));//1//TT
        faseC.add(new CasillaRoja(140,181,2));//2//UU

        faseD = new DoubleLinkedCircularList();

        faseD.add(new CasillaMorada(298,791,0));//0//TELEPORT//1
        faseD.add(new CasillaAmarilla(415,791,1));//1//2
        faseD.add(new CasillaAmarilla(537,791,2));//2//3
        faseD.add(new CasillaAmarilla(537,873,3));//3//4
        faseD.add(new CasillaAmarilla(415,873,4));//4//5
        faseD.add(new CasillaAmarilla(298,873,5));//5//6
        faseD.add(new CasillaAmarilla(174,873,6));//6//7
        faseD.add(new CasillaAmarilla(80,873,7));//7//8
        faseD.add(new CasillaAmarilla(80,791,8));//8//9
        faseD.add(new CasillaAmarilla(174,791,9));//9//10

        caminoprincipal = new CircularList();

        caminoprincipal.add(new CasillaAzul(719,809,0));//0//A
        caminoprincipal.add(new CasillaVerde(784,768,1));//1//B
        caminoprincipal.add(new CasillaRoja(784,669,2));//2//C
        caminoprincipal.add(new CasillaAmarilla(784,553,3));//3//D
        caminoprincipal.add(new CasillaVerde(784,430,4));//4//E
        caminoprincipal.add(new CasillaAzul(784,313,5));//5//F
        caminoprincipal.add(new CasillaAzul(784,229,6));//6//G
        caminoprincipal.add(new CasillaVerde(784,138,7));//7//H
        caminoprincipal.add(new CasillaVerde(784,31,8));//8//I
        caminoprincipal.add(new CasillaAzul(673,31,9));//9//J
        caminoprincipal.add(new CasillaAzul(581,31,10));//10//K
        caminoprincipal.add(new CasillaAmarilla(496,31,11));//11//L
        caminoprincipal.add(new CasillaRoja(380,31,12));//12//M
        caminoprincipal.add(new CasillaVerde(259,31,13));//13//N
        caminoprincipal.add(new CasillaAzul(139,31,14));//14//Ñ
        caminoprincipal.add(new CasillaAmarilla(40,31,15));//15//O
        caminoprincipal.add(new CasillaAzul(40,114,16));//16//INTERSECTION//P
        caminoprincipal.add(new CasillaVerde(40,219,17));//17//Q
        caminoprincipal.add(new CasillaAzul(40,321,18));//18//R
        caminoprincipal.add(new CasillaAzul(40,422,19));//19//S
        caminoprincipal.add(new CasillaVerde(40,526,20));//20//T
        caminoprincipal.add(new CasillaAmarilla(40,630,21));//21//U
        caminoprincipal.add(new CasillaRoja(40,732,22));//22//V
        caminoprincipal.add(new CasillaAzul(119,732,23));//23//W
        caminoprincipal.add(new CasillaVerde(217,732,24));//24//X
        caminoprincipal.add(new CasillaAzul(310,732,25));//25//Y
        caminoprincipal.add(new CasillaAmarilla(415,732,26));//26//Z
        caminoprincipal.add(new CasillaAzul(465,682,27));//27//AA
        caminoprincipal.add(new CasillaRoja(464,608,28));//28//BB
        caminoprincipal.add(new CasillaAzul(417,567,29));//29//INTERSECTION//CC
        caminoprincipal.add(new CasillaAzul(344,532,30));//30//DD
        caminoprincipal.add(new CasillaVerde(280,528,31));//31//INTERSECTION//EE
        caminoprincipal.add(new CasillaAzul(197,514,32));//32//FF
        caminoprincipal.add(new CasillaRoja(157,430,33));//33//GG
        caminoprincipal.add(new CasillaAmarilla(148,350,34));//34//HH
        caminoprincipal.add(new CasillaVerde(149,252,35));//35//INTERSECTION//II
        caminoprincipal.add(new CasillaAzul(265,252,36));//36//JJ
        caminoprincipal.add(new CasillaVerde(382,252,37));//37//KK
        caminoprincipal.add(new CasillaRoja(501,252,38));//38//LL
        caminoprincipal.add(new CasillaAzul(567,252,39));//39//MM
        caminoprincipal.add(new CasillaAzul(643,252,40));//40//NN
        caminoprincipal.add(new CasillaAmarilla(648,359,41));//41//ÑÑ
        caminoprincipal.add(new CasillaRoja(648,467,42));//42//OO
        caminoprincipal.add(new CasillaAzul(648,567,43));//43//PP
        caminoprincipal.add(new CasillaVerde(648,664,44));//44//QQ
        caminoprincipal.add(new CasillaRoja(648,766,45));//45//RR

    }

    public static Map getInstance(){
        if(instance == null){
            instance = new Map();
        }
        return instance;
    }
    protected Casilla getCasilla (int pos,String lista){
        switch (lista) {
            case "p":
                return (Casilla) caminoprincipal.getPos(pos);
            case "a":
                return (Casilla) faseA.getPos(pos);
            case "b":
                return (Casilla) faseB.getPos(pos);
            case "c":
                return (Casilla) faseC.getPos(pos);
            case "d":
                return (Casilla) faseD.getPos(pos);
        }
        return null;
    }

    public List getFase (String fase) {
        switch (fase) {
            case "a":
                return faseA;
            case "b":
                return faseB;
            case "c":
                return faseC;
            case "d":
                return faseD;
            case "p":
                return caminoprincipal;
        }
        return new SimpleList();
    }
    private Casilla castToTile(Object object){
        return (Casilla)object;
    }
    public Casilla getRandomTile(){
        int rand,pos;
        List lista;
        rand = new Random().nextInt(106);

        if(rand >= 0 && rand <= 25 ){
            lista = Map.getInstance().getFase("a");
        }
        else if(rand >= 26 && rand <= 50){
            lista = Map.getInstance().getFase("b");
        }
        else if(rand >= 51 && rand <= 75){
            lista = Map.getInstance().getFase("c");
        }
        else if(rand >= 76 && rand <= 100){
            lista = Map.getInstance().getFase("p");
        }
        else{
            lista = Map.getInstance().getFase("d");
        }
        pos = new Random().nextInt(lista.getLength());

        return (Casilla) lista.getPos(pos);
    }
}
