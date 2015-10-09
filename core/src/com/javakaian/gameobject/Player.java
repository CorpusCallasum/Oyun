package com.javakaian.gameobject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.javakaian.controller.Controller;
import com.javakaian.imageloader.ImageLoader;

public class Player implements GameObject
{
	private Vector2 position;
	private Vector2 size;
	private Vector2 speed;
	private Vector2 acceleration;
	
	private Vector2 maxSpeed;
	
	
	
	private boolean moveWithDirection=false;
	private Vector2 direction;

	private Rectangle collisionRect;
	
	
	private Controller controller;
	public Player(float xKord, float yKord, float width,float height,Controller controller)
	{
		this.controller=controller;
		
		size = new Vector2(width, height);
		
		position = new Vector2(xKord, yKord);
		acceleration = new Vector2(0, 0);
		speed=new Vector2(0, 0);
		maxSpeed = new Vector2(5, -45);
		direction = new Vector2();
		
		collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
		 
	}
	
	public void render(SpriteBatch sb) 
	{
		sb.begin();
		
		sb.draw(ImageLoader.playerRegion, position.x,position.y, size.x,size.y);


		
		sb.end();
		
	}

	
	public void update(float delta)
	{

		collisionRect.x=position.x;
		collisionRect.y=position.y;
		collisionRect.width=size.x;
		collisionRect.height=size.y;
		
		
		if(moveWithDirection)
		{
			direction.x = controller.getDirection().x;
			direction.y=controller.getDirection().y;
			speed.y=direction.y/3;
			speed.x=direction.x/18;
			if((-speed.y)>(-maxSpeed.y))
			{
			speed.y=maxSpeed.y;
			}
			
			
			speed.add(acceleration);
			position.add(speed);
		}
		
		
		
		
	}
	

	
	public Rectangle getCollisionRect() {
		return collisionRect;
	}

	public void setCollisionRect(Rectangle collisionRect) {
		this.collisionRect = collisionRect;
	}

	public Vector2 getDirection() {
		return direction;
	}

	public void setDirection(Vector2 direction) {
		this.direction = direction;
	}

	public boolean isMoveWithDirection() {
		return moveWithDirection;
	}

	public void setMoveWithDirection(boolean moveWithDirection) {
		this.moveWithDirection = moveWithDirection;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public Vector2 getSpeed() {
		return speed;
	}

	public void setSpeed(Vector2 speed) {
		this.speed = speed;
	}

	

	public Vector2 getSize() {
		return size;
	}

	public void setSize(Vector2 size) {
		this.size = size;
	}

	public Vector2 getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Vector2 acceleration) {
		this.acceleration = acceleration;
	}



	
	

}
