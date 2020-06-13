package Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.io.File;
import java.util.Objects;

/**
 * musicstuff
 * Clase para implementar la música en el juego
 * @author Mauricio C.
 * @author Naheem J.
 */
public class musicstuff {

    Clip clip;

    /**
     * playMusic
     * @param musicLocation
     * Método en donde se especifica el lugar del archivo .wav
     * @author Mauricio C.
     * @author Naheem J.
     */
    public void playMusic(String musicLocation){

        try{
            File musicpath = new File(musicLocation);
            if (musicpath.exists()){

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);

                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);



            }else{

                System.out.println("no encuentro la vara");


            }
        }
        catch(Exception ex)
         {
            ex.printStackTrace();
        }




    }

    public void stopmusic(){

        clip.stop();


    }

}
