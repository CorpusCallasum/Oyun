package com.javakaian.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

public class Controller 
{
	private float xKord;
	private float yKord;
	private float radius;
	
	private Vector2 beginCord;
	private Vector2 endCord;
	
	private ShapeRenderer sr;
	
	private OrthographicCamera camera;
	
	
	private boolean clicked=false;
	
	private Vector2 direction;
	
	public Controller(float xKord, float yKord,float radius)
	{
		this.xKord=xKord;
		this.yKord=yKord;
		this.radius=radius;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		sr = new ShapeRenderer();
		sr.setProjectionMatrix(camera.combined);
		
		beginCord = new Vector2();
		endCord =  new Vector2();
		beginCord.x=xKord;
		beginCord.y=yKord;
		endCord.x=xKord;
		endCord.y=yKord;
		
		direction = new Vector2();
		
	}
	
	public void update(float delta)
	{
		
		if(clicked)
		{
		endCord.x=Gdx.input.getX();
		endCord.y=Gdx.input.getY();
		
		direction.x=(endCord.x-beginCord.x);
		direction.y=(endCord.y-beginCord.y);
		}
		
	}
	
	public void render()
	{
		sr.begin(ShapeType.Line);
		sr.setColor(Color.BLACK);
		sr.circle(xKord, yKord, radius);
		sr.line(beginCord, endCord);
		
		sr.end();
	}
	

	public Vector2 getDirection() {
		return direction;
	}

	public void setDirection(Vector2 direction) {
		this.direction = direction;
	}

	public Vector2 getBeginCord() {
		return beginCord;
	}

	public void setBeginCord(Vector2 beginCord) {
		this.beginCord = beginCord;
	}

	public Vector2 getEndCord() {
		return endCord;
	}

	public void setEndCord(Vector2 endCord) {
		this.endCord = endCord;
	}

	public boolean isClicked() {
		return clicked;
	}

	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}
	
	
	
	

}
