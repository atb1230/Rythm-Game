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

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.audio.Music;

public class RecorderScreen extends BaseScreen{
    Music music;
    SongData songData;
    float lastSongPosition;
    boolean recording;
    TextButton loadButton;
    TextButton recordButtont;
    TextButton saveButton;
    
    public void initialize()
    {
        recording = false;
        loadButton = new TextButton("Load Music File",BaseGame.textButtonStyle);
        loadButton.addListener(
            (Event e) ->
                {
                    if (!isTouchDownEvent(e)) {
                        return false;
                    }
                    FileHandle musicFile = FileUtils.showOpenDialog();
                    
                    if (musicFile != null) {
                        music = Gdx.audio.newMusic(musicFile);
                        songData = new SongData();
                        songData.setSongName(musicFile.name());
                    }
                    return true;
                }
        );
        recordButtont = new TextButton("Record KeyStrokes",BaseGame.textButtonStyle);
        recordButtont.addListener(
            (Event e) -> {
                    if (!isTouchDownEvent(e)) 
                    {
                        return false;
                    }
                    if (!recording) 
                    {
                        music.play();
                        recording = true;
                        lastSongPosition = 0;
                    }
                    return true;
                }
        );
        saveButton = new TextButton("Save Keystroke File",BaseGame.textButtonStyle);
        saveButton.addListener(
                (Event e) ->
                {
                    if (!isTouchDownEvent(e)) 
                    {
                        return false;
                    }
                    FileHandle textFile = FileUtils.showSaveDialog();
                    if (textFile != null) 
                    {
                        songData.writeToFile(textFile);
                    }
                    return  true;
                }
        );
        uitTable.add(loadButton);
        uitTable.row();
        uitTable.add(recordButtont);
        uitTable.row();
        uitTable.add(saveButton);     
    }
    
     public void update(float dt)
    {
        if( recording)
        {
            if(music.isPlaying())
                lastSongPosition = music.getPosition();
            else //song just finished
            {
                recording = false;
                songData.setSongDuration(lastSongPosition);
            }
        }
    }
     
      public boolean keyDown(int keycode)
    {
        if(recording)
        {
            String key = Keys.toString(keycode);
            Float time = music.getPosition();
            songData.addKeyTime(key, time);
        }
        return false;
    }
}