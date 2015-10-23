package com.javakaian.gameobject;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.javakaian.controller.Controller;
import com.javakaian.handler.BgHandler;
import com.javakaian.handler.CarHandler;

import com.javakaian.states.PlayState;





public class GameWorld implements GameObject
{

	private Player player;
	
	
	
	private Controller controller;
	
	
	private BgHandler bgHandler;
	private CarHandler carHandler;
	
	
	
	
	
	public GameWorld(PlayState playState)
	{
		
		controller = new Controller(2*Gdx.graphics.getWidth()/10,
				Gdx.graphics.getHeight()-2*Gdx.graphics.getWidth()/10,
				Gdx.graphics.getWidth()/10);
		player = new Player(Gdx.graphics.getWidth()/4,
				2*Gdx.graphics.getHeight()/3,
				Gdx.graphics.getWidth()/5,
				Gdx.graphics.getWidth()/5 ,controller);
		
		bgHandler = new BgHandler(player);
		carHandler = new CarHandler(player,playState);
		
		
		
		
		
	}
	
	public void render(SpriteBatch sb) 
	{
		bgHandler.render(sb);
		player.render(sb);
		controller.render();
		carHandler.render(sb);
		
		
		
	}
	

	
	public void update(float delta)
	{
		player.update(delta);
		controller.update(delta);
		bgHandler.update(delta);
		carHandler.update(delta);
	
	}
	
	
	
	public Player getPlayer()
	{
		return player;
	}
	
	public Controller getController()
	{
		return controller;
	}

	public CarHandler getCarHandler() {
		return carHandler;
	}

	public void setCarHandler(CarHandler carHandler) {
		this.carHandler = carHandler;
	}

	
	
	
	
	
}
