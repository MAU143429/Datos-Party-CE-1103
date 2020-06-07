package Music;


public class LoopMusic {


    public LoopMusic(){

    }

    public static void main(String[] args){

        String filepath = "intro.wav";

        musicstuff musicObject = new musicstuff();
        musicObject.playMusic(filepath);


    }


}
