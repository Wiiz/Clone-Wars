
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecatesias
 */
public class Sounds {
    public Sounds() {
        
    }
    
    public void  MainTheme(){
        File son = new File("/src/Sounds/swtheme.wav");
        AudioClip clip = null;
        try {
            clip = Applet.newAudioClip(son.toURL());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
       clip.play();
    }
    
    public void R2D2() {
        File son = new File("/Users/hecatesias/Desktop/anthon_w/Clone Wars/src/Sounds/R2d2.wav");
        AudioClip clip = null;
        try {
            clip = Applet.newAudioClip(son.toURL());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        clip.play();
    }
}
