package com.javakaian.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.buttons.Button;
import com.javakaian.collision.Collision;
import com.javakaian.gameobject.GameWorld;
import com.javakaian.gameobject.Player;
import com.javakaian.handler.HighScoreDrawer;

import com.javakaian.imageloader.ImageLoader;
import com.javakaian.inputhandler.HighScoreHandler;
import com.javakaian.inputhandler.PlayStateInput;


public class PlayState extends State
{

	private GameWorld gm;
	
	
	private StateManager sm;
	
	private int score=0;
	private int highScore;
	private HighScoreDrawer highScoreDrawer;
	private OrthographicCamera cam;
	
	public PlayState(StateManager sm)
	{
		
		super(sm);
		cam = camera;
		highScoreDrawer = new HighScoreDrawer(this);
		this.sm=sm;
		gm = new GameWorld(this);
		highScore=HighScoreHandler.getHighScore();
		Gdx.input.setInputProcessor(new PlayStateInput(this));
		
		
		
	}
	
	
	
	
	public void render(SpriteBatch sb)
	{
		
		sb.setProjectionMatrix(camera.combined);
		
		
		
		gm.render(sb);
		highScoreDrawer.render(sb);
	}
	
	
	
	public void moveCamtoLeft()
	{
		camera.position.x-=10;
	}


	
	
	public void update(float delta) 
	{
		
		gm.update(delta);
		
		updateCamera();
		checkCollision();
		if(score>highScore)
		{
			highScore=score;
			HighScoreHandler.setHighScore(highScore);
		}
		
		
	}

	public void updateCamera()
	{
		/*
		if(gm.getPlayer().getPosition().x<camera.position.x-Gdx.graphics.getWidth()/4)
		{
			camera.position.x+=gm.getPlayer().getSpeed().x;
			
		}
		if(gm.getPlayer().getPosition().x>camera.position.x+Gdx.graphics.getWidth()/4)
		{
			camera.position.x+=gm.getPlayer().getSpeed().x;
			
		}*/
		if(gm.getPlayer().getPosition().y-Gdx.graphics.getHeight()/10<camera.position.y)
		{
			camera.position.y+=gm.getPlayer().getSpeed().y;
			
		}
		if(gm.getPlayer().getPosition().y>camera.position.y+Gdx.graphics.getHeight()/4)
		{
			camera.position.y+=gm.getPlayer().getSpeed().y;
			
		}
		camera.update();
		
	}
	

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public void checkCollision()
	{
		if(Collision.isThereCollision(gm.getPlayer(), gm.getCarHandler()))
		{
			///////
			sm.pushState(new GameOverState(sm));
		}
	}
	
	public GameWorld getGameWorld()
	{
		return gm;
	}

	

	public StateManager getSm()
	{
		return sm;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score=score;
	}

	public OrthographicCamera getCam()
	{
		return cam;
	}
	
	

}
