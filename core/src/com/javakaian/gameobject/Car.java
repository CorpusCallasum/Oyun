package com.javakaian.gameobject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.javakaian.imageloader.ImageLoader;


public class Car implements GameObject
{

	private Vector2 position;
	private Vector2 size;
	private Vector2 speed;
	
	private Rectangle collisionRect;
	
	
	public Car()
	{
		position = new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-100);
		size = new Vector2(Gdx.graphics.getWidth()/5,Gdx.graphics.getWidth()/5);
		speed = new Vector2(0, -700);
		
		
		collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
	}
	
	public Car(float xKord, float yKord)
	{
		position = new Vector2();
		size = new Vector2(Gdx.graphics.getWidth()/5,Gdx.graphics.getWidth()/5);
		speed = new Vector2(0, -700);
		
		
		collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
		position.x=xKord;
		position.y=yKord;
	}
	
	public void render(SpriteBatch sb) 
	{
		sb.begin();
		
		sb.draw(ImageLoader.yapayCarRegion, position.x, position.y,size.x,size.y);
		
		sb.end();
		
	}

	
	public void update(float delta) 
	{

		collisionRect.x=position.x;
		collisionRect.y=position.y;
		collisionRect.width=size.x;
		collisionRect.height=size.y;
		
		position.add(speed.cpy().scl(delta));
		
	}

	public Rectangle getCollisionRect() {
		return collisionRect;
	}

	public void setCollisionRect(Rectangle collisionRect) {
		this.collisionRect = collisionRect;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public Vector2 getSize() {
		return size;
	}

	public void setSize(Vector2 size) {
		this.size = size;
	}

	
	
	
	

}
