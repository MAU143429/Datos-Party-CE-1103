package Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.File;


public class musicstuff {

    Clip clip;


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
