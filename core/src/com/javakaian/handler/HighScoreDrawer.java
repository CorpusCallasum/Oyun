package com.javakaian.handler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.imageloader.ImageLoader;
import com.javakaian.states.PlayState;

public class HighScoreDrawer 
{
	private PlayState playState;
	private float x,y;
	private float scoreX,scoreY;
	public HighScoreDrawer(PlayState playState) 
	{
		this.playState=playState;
	}
	
	public void render(SpriteBatch sb)
	{
		sb.begin();
		x=0;
		scoreX=Gdx.graphics.getWidth()/2+Gdx.graphics.getWidth()/10;
		y=(playState.getCam().position.y)-Gdx.graphics.getHeight()/2;
		scoreY=y;
		ImageLoader.font.draw(sb, "Score:", x, y);
		ImageLoader.font.draw(sb, String.valueOf(playState.getScore()),scoreX,scoreY);
		
		
		sb.end();
		
	}
	

}
