package com.javakaian.gameobject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public class Gaz {

	private ShapeRenderer sr;
	private OrthographicCamera camera;
	
	private float radius;
	private Vector2 position;
	private Circle collisionCircle;
	private boolean clicked=false;
	private Player player;
	public Gaz(Player player)
	{
		this.player=player;
		camera = new OrthographicCamera();
		camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		sr= new ShapeRenderer();
		sr.setProjectionMatrix(camera.combined);
		radius = Gdx.graphics.getWidth()/10;
		position = new Vector2(Gdx.graphics.getWidth()-2*radius, Gdx.graphics.getHeight()-2*radius);
	
		collisionCircle = new Circle(position.x, position.y, radius);
	}
	
	public void render()
	{
		sr.begin(ShapeType.Line);
		
		sr.circle(position.x, position.y, radius);
		
		sr.end();
	}
	
	public void update(float delta)
	{
		if(clicked)
		{
			player.setAcceleration(new Vector2(player.getDirection().x/100,player.getDirection().y/100));
		}
		
		if(!clicked)
		{
			player.setAcceleration(new Vector2(0, 1));
			
			if(player.getSpeed().y>=0)
			{
				player.setSpeed(new Vector2(0, 0));
				player.setAcceleration(new Vector2(0, 0));
			}
		}
		
	}

	public Circle getCollisionCircle() {
		return collisionCircle;
	}

	public void setCollisionCircle(Circle collisionCircle) {
		this.collisionCircle = collisionCircle;
	}

	public boolean isClicked() {
		return clicked;
	}

	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}
	
	
}
