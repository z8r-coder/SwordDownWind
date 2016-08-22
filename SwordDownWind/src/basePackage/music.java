package basePackage;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;

public class music{
	boolean looping = false;
    File file1 = new File("src/MusicSource/网络歌手 - 镇魂街主题曲.wav"); 
	AudioClip sound1; 
	AudioClip chosenClip; 

     public music(){
        try {
            sound1 = Applet.newAudioClip(file1.toURL());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
         chosenClip = sound1;
         looping = true;
         chosenClip.loop();
     }
     
     public music(String string){
         file1 = new File(string); 
        try {
            sound1 = Applet.newAudioClip(file1.toURL());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
         chosenClip = sound1;
         looping = true;
         chosenClip.loop();
     }
     
     public void Close(){
         chosenClip.stop();
     }
}