package com.javakaian.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public interface GameObject 
{
	
	public void render(SpriteBatch sb);
	
	public void update(float delta);
	
	

}
