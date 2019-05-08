/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;
import sun.audio.*;
import java.io.*;
import java.lang.invoke.MethodHandles;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/**
 *
 * @author aya
 */
/** A class that carries soundtrack's data*/
 public class Sound {
     /** */
 Clip clip;
File musicPath;
public boolean Pflag = true;
public boolean Cflag = true;
public static int pressed=0;

   long clipTime;
    void music(String filePath)
{
   
try
{
    if(pressed==1)
    {
    Pflag = true;
    Cflag = true;
    musicPath = new File(filePath);
    AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
    clip = AudioSystem.getClip();
    clip.open(audio);
    clip.start();
    clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    else
    JOptionPane.showMessageDialog(null, "You have already pressed");

}
catch(Exception m)
{
    m.getMessage();
}
}
void pause()
{
     
    if(Pflag == false)
    {
      

clipTime= clip.getMicrosecondPosition();

clip.stop();
       
    }
}
void play()
{
    if(Cflag == false)
{
    
    Pflag=true;
clip.setMicrosecondPosition(clipTime);

clip.start();
clip.loop(Clip.LOOP_CONTINUOUSLY);
    }  
}
}

