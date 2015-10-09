package com.javakaian.handler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.javakaian.gameobject.Player;
import com.javakaian.imageloader.ImageLoader;

public class BgHandler 
{
	
	private TextureRegion bg1,bg2,bg3;
	private float bg1Bas,bg1Son,bg2Bas,bg2Son,bg3Bas,bg3Son;
	
	private float width;
	private float height;
	private Player player;
	
	public BgHandler(Player player)
	{
		this.player = player;
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		bg1 = ImageLoader.arabaBg;
		bg2 = ImageLoader.arabaBg;
		bg3 = ImageLoader.arabaBg;
		
		bg1Bas=-height;
		bg1Son=bg1Bas+height;
		bg2Bas=bg1Son;
		bg2Son=bg2Bas+height;
		bg3Bas=bg2Son;
		bg3Son=bg3Bas+height;
		
	}
	
	public void render(SpriteBatch sb)
	{
		sb.begin();
		
		sb.draw(bg1, 0, bg1Bas, width, height);
		sb.draw(bg2, 0, bg2Bas, width, height);
		sb.draw(bg3, 0, bg3Bas, width, height);
		
		sb.end();
	}
	public void update(float delta)
	{
		
		if(player.getPosition().y<bg2Bas)
		{
			updateCord();
		}
		
		
	}
	
	public void updateCord()
	{
		//3-->1
		//1-->2
		//2-->3
		
		bg3Bas = bg1Bas-height;
		bg1Bas=bg3Bas;
		bg2Bas=bg1Bas+height;
		bg3Bas=bg2Bas+height;
	}

}
