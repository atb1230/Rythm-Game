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


public class RecorderGame extends BaseGame{
    public void create()
    {
        super.create();
        setActiveScreen(new RecorderScreen());
    }
}
