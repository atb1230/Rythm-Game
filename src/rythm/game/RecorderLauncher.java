/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rythm.game;

/**
 *
 * @author ASUS
 */

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
public class RecorderLauncher {
    public static void main(String[] args)
    {
        BaseGame myGame = new RecorderGame();
        LwjglApplication launcher = new LwjglApplication(myGame,"Recorder",800,600);
    }
}
