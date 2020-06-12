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

        faseA.add(new CasillaAzul(475,491,0,47));//0//YY
        faseA.add(new CasillaVerde(503,409,1,48));//1//ZZ
        faseA.add(new CasillaAmarilla(501,298,2,49));//2//AAA

        faseB = new SimpleList();

        faseB.add(new CasillaAmarilla(275,462,0,50));//0//VV
        faseB.add(new CasillaAmarilla(275,382,1,51));//1//WW
        faseB.add(new CasillaAmarilla(275,301,2,52));//2//XX

        faseC = new DoubleLinkedList();

        faseC.add(new CasillaRoja(92,114,0,53));//0//SS
        faseC.add(new CasillaMorada(143,118,1,54));//1//TT//TELEPORT
        faseC.add(new CasillaRoja(140,181,2,55));//2//UU

        faseD = new DoubleLinkedCircularList();

        faseD.add(new CasillaAmarilla(80,791,0,64));//8//0
        faseD.add(new CasillaAmarilla(174,791,1,65));//9//1
        faseD.add(new CasillaMorada(298,791,2,56));//0//TELEPORT//2
        faseD.add(new CasillaAmarilla(415,791,3,57));//1//3
        faseD.add(new CasillaAmarilla(537,791,4,58));//2//4
        faseD.add(new CasillaAmarilla(537,873,5,59));//3//5
        faseD.add(new CasillaAmarilla(415,873,6,60));//4//6
        faseD.add(new CasillaAmarilla(298,873,7,61));//5//7
        faseD.add(new CasillaAmarilla(174,873,8,62));//6//8
        faseD.add(new CasillaAmarilla(80,873,9,63));//7//9



        caminoprincipal = new CircularList();

        caminoprincipal.add(new CasillaAzul(719,809,0,1));//0//A
        caminoprincipal.add(new CasillaVerde(784,768,1,2));//1//B
        caminoprincipal.add(new CasillaRoja(784,669,2,3));//2//C
        caminoprincipal.add(new CasillaAmarilla(784,553,3,4));//3//D
        caminoprincipal.add(new CasillaVerde(784,430,4,5));//4//E
        caminoprincipal.add(new CasillaAzul(784,313,5,6));//5//F
        caminoprincipal.add(new CasillaAzul(784,229,6,7));//6//G
        caminoprincipal.add(new CasillaVerde(784,138,7,8));//7//H
        caminoprincipal.add(new CasillaVerde(784,31,8,9));//8//I
        caminoprincipal.add(new CasillaAzul(673,31,9,10));//9//J
        caminoprincipal.add(new CasillaAzul(581,31,10,11));//10//K
        caminoprincipal.add(new CasillaAmarilla(496,31,11,12));//11//L
        caminoprincipal.add(new CasillaRoja(380,31,12,13));//12//M
        caminoprincipal.add(new CasillaVerde(259,31,13,14));//13//N
        caminoprincipal.add(new CasillaAzul(139,31,14,15));//14//Ñ
        caminoprincipal.add(new CasillaAmarilla(40,31,15,16));//15//O
        caminoprincipal.add(new CasillaAzul(40,114,16,17));//16//INTERSECTION//P
        caminoprincipal.add(new CasillaVerde(40,219,17,18));//17//Q
        caminoprincipal.add(new CasillaAzul(40,321,18,19));//18//R
        caminoprincipal.add(new CasillaAzul(40,422,19,20));//19//S
        caminoprincipal.add(new CasillaVerde(40,526,20,21));//20//T
        caminoprincipal.add(new CasillaAmarilla(40,630,21,22));//21//U
        caminoprincipal.add(new CasillaRoja(40,732,22,23));//22//V
        caminoprincipal.add(new CasillaAzul(119,732,23,24));//23//W
        caminoprincipal.add(new CasillaVerde(217,732,24,25));//24//X
        caminoprincipal.add(new CasillaAzul(310,732,25,26));//25//Y
        caminoprincipal.add(new CasillaAmarilla(415,732,26,27));//26//Z
        caminoprincipal.add(new CasillaAzul(465,682,27,28));//27//AA
        caminoprincipal.add(new CasillaRoja(464,608,28,29));//28//BB
        caminoprincipal.add(new CasillaAzul(417,567,29,30));//29//INTERSECTION//CC
        caminoprincipal.add(new CasillaAzul(344,532,30,31));//30//DD
        caminoprincipal.add(new CasillaVerde(280,528,31,32));//31//INTERSECTION//EE
        caminoprincipal.add(new CasillaAzul(197,514,32,33));//32//FF
        caminoprincipal.add(new CasillaRoja(157,430,33,34));//33//GG
        caminoprincipal.add(new CasillaAmarilla(148,350,34,35));//34//HH
        caminoprincipal.add(new CasillaVerde(149,252,35,36));//35//INTERSECTION//II
        caminoprincipal.add(new CasillaAzul(265,252,36,37));//36//JJ
        caminoprincipal.add(new CasillaVerde(382,252,37,38));//37//KK
        caminoprincipal.add(new CasillaRoja(501,252,38,39));//38//LL
        caminoprincipal.add(new CasillaAzul(567,252,39,40));//39//MM
        caminoprincipal.add(new CasillaAzul(643,252,40,41));//40//NN
        caminoprincipal.add(new CasillaAmarilla(648,359,41,42));//41//ÑÑ
        caminoprincipal.add(new CasillaRoja(648,467,42,43));//42//OO
        caminoprincipal.add(new CasillaAzul(648,567,43,44));//43//PP
        caminoprincipal.add(new CasillaVerde(648,664,44,45));//44//QQ
        caminoprincipal.add(new CasillaRoja(648,766,45,46));//45//RR
    }

    public static Map getInstance(){
        if(instance == null){
            instance = new Map();
        }
        return instance;
    }
    public Casilla getCasilla (int pos,String lista) {
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

        if(rand >= 0 && rand <= 14 ){
            lista = Map.getInstance().getFase("a");
        }
        else if(rand >= 15 && rand <= 29){
            lista = Map.getInstance().getFase("b");
        }
        else if(rand >= 30 && rand <= 49){
            lista = Map.getInstance().getFase("c");
        }
        else if(rand >= 50 && rand <= 100){
            lista = Map.getInstance().getFase("p");
        }
        else{
            lista = Map.getInstance().getFase("d");
        }
        pos = new Random().nextInt(lista.getLength());

        return (Casilla) lista.getPos(pos);

    }

    public String getFase2(Casilla casilla) {

        if (casilla.getReferencia() >= 1 && casilla.getReferencia() <= 46) {
            return "p";
        }
        if (casilla.getReferencia() >= 47 && casilla.getReferencia() <= 49) {
            return "a";
        }
        if (casilla.getReferencia() >= 50 && casilla.getReferencia() <= 52) {
            return "b";
        }
        if (casilla.getReferencia() >= 53 && casilla.getReferencia() <= 55) {
            return "c";
        }
        if (casilla.getReferencia() >= 56 && casilla.getReferencia() <= 65) {
            return "d";
        }
        else{
            return "no se donde esta";
        }


    }

}
