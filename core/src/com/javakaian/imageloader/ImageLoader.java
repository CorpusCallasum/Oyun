package com.javakaian.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ImageLoader 
{
	public static Texture text ,arabatexture;
	public static TextureRegion bgRegion,playerRegion,playButtonRegion,options,about;
	public static TextureRegion backButton;
	public static TextureRegion arabaBg, yapayCarRegion;
	
	/////////
	public static TextureRegion levelBox;
	
	
	///
	public static BitmapFont font;
	public static Texture fontTexture;
	
	public static void load()
	{
		font = new BitmapFont(Gdx.files.internal("font.fnt"),true);
		
		
		fontTexture = new Texture(Gdx.files.internal("font.png"));
		fontTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		
		text = new Texture(Gdx.files.internal("gametexture.png"));
		
		arabatexture = new Texture(Gdx.files.internal("arabatexture.png"));
		
		bgRegion = new TextureRegion(text, 0, 0, 480, 800);
		bgRegion.flip(false, true);
		
		playerRegion = new TextureRegion(text, 484, 2, 50, 50);
		bgRegion.flip(false, true);
		
		playButtonRegion = new TextureRegion(text, 481, 0, 300, 80);
		playButtonRegion.flip(false, true);
		
		options = new TextureRegion(text, 481, 174, 300, 80);
		options.flip(false, true);
		
		about = new TextureRegion(text, 481, 86, 300, 80);
		about.flip(false, true);
		
		backButton = new TextureRegion(text, 485, 256, 115, 67);
		backButton.flip(false, true);
		
		arabaBg = new TextureRegion(arabatexture, 0, 0, 480, 800);
		arabaBg.flip(false, true);
		
		yapayCarRegion = new TextureRegion(arabatexture, 490, 2, 90, 180);
		yapayCarRegion.flip(false, true);
		
		///
		levelBox = new TextureRegion(text, 485, 326, 84, 85);
		levelBox.flip(false, true);
	}
	
	public static void dispose()
	{
		font.dispose();
		fontTexture.dispose();
		text.dispose();
		arabatexture.dispose();
		
	}

}
