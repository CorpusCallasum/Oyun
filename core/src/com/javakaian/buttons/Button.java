package com.javakaian.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.javakaian.gameobject.GameObject;
import com.javakaian.imageloader.ImageLoader;

public class Button implements GameObject
{

	private TextureRegion buttonImage;
	private float xKord,yKord,width,height;
	
	/// BUTTON ANIMASYONU
	private float btnMaxWidth, btnMaxHeight;
	private double time=0,animTime=0.5;
	///button animasyonu
	private Rectangle buttonRect;
	
	
	
	public Button(float xKord,float yKord, TextureRegion buttonImage)
	{
		this.buttonImage =buttonImage;
		this.xKord=xKord;
		this.yKord=yKord;
		//width=(Gdx.graphics.getWidth()*2)/3;
		//height=(float) (width*0.2);
		
		///button animasyonu
		width=0;
		height=0;
		btnMaxWidth=(Gdx.graphics.getWidth()*2)/3;
		btnMaxHeight=(float)(btnMaxWidth*0.2);
		///button animasyonu
		
		buttonRect  = new Rectangle(xKord, yKord, width, height);
	}
	public Button()
	{
		this.xKord=0;
		
		buttonImage=ImageLoader.backButton;
		//this.width=(Gdx.graphics.getWidth())/3;
		//this.height=(float) (width*0.4);
		//this.yKord=Gdx.graphics.getHeight()-height;
		
		//button animasyonu
		width=0;
		height=0;
		btnMaxWidth=Gdx.graphics.getWidth()/3;
		btnMaxHeight=(float)(btnMaxWidth*0.4);
		this.yKord=Gdx.graphics.getHeight()-btnMaxHeight;
		//button animasyonu
		buttonRect  = new Rectangle(xKord, yKord, width, height);
	}
	
	public void render(SpriteBatch sb)
	{
		sb.begin();
		
		sb.draw(buttonImage, xKord, yKord, width, height);
		
		sb.end();
			
	}

	
	public void update(float delta) 
	{
		///////////////button animasyon
		time+=delta;
		
		if(time<animTime)
		{
				if(width<btnMaxWidth)
				{
					width+=(btnMaxWidth/30);
					
				}
				if(height<btnMaxHeight)
				{
					height+=(btnMaxWidth/30);
					
				}
				buttonRect.width=width;
				buttonRect.height=height;
		}
		//button animasyonu
	}
	public Rectangle getButtonRect()
	{
		return buttonRect;
	}
	
	
}
