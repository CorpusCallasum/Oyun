package com.javakaian.tapme;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.imageloader.ImageLoader;
import com.javakaian.states.MenuState;
import com.javakaian.states.PlayState;
import com.javakaian.states.StateManager;

public class TapMe extends Game
{
 
	public static int WIDTH=480;
	public static int HEIGHT=800;
	public static String TITLE="Tap Me";
	
	
	private SpriteBatch sb;
	
	private static StateManager sm;
	public void create()
	{
		
		///
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
		
		ImageLoader.load();
		
		sb = new SpriteBatch();
		
	
		sm = new StateManager();
		sm.pushState(new MenuState(sm));
		System.out.println("Oyun olusturuldu..");
		
	}
	
	
	public void render() {
	
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.render(sb);
		sm.update(Gdx.graphics.getDeltaTime());
		
	}
	
	
	public void dispose() 
	{
		ImageLoader.dispose();
		System.out.println("Oyun yok edildi...");
		
	}
	
	
}
