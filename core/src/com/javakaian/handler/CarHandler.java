package com.javakaian.handler;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.gameobject.Car;
import com.javakaian.gameobject.Player;
import com.javakaian.states.PlayState;

public class CarHandler 
{
	private ArrayList<Car> carList;
	private Player player;
	private Random randXkord;
	private PlayState playState;
	
	public CarHandler(Player player,PlayState playState)
	{
		this.playState=playState;
		this.player=player;
		carList = new ArrayList<Car>();
		carList.add(new Car(Gdx.graphics.getWidth()/2,200));
		randXkord = new Random();
	}
	
	public void update(float delta)
	{
		for(int i=0; i<carList.size();i++)
		{
			carList.get(i).update(delta);
			
			if(carList.get(i).getPosition().y>player.getPosition().y+Gdx.graphics.getHeight()/2)
			{
				
				playState.setScore(playState.getScore()+1);
				carList.remove(i);
				carList.add(new Car(randXkord.nextInt(Gdx.graphics.getWidth()-100),player.getPosition().y-(2*Gdx.graphics.getHeight()/3)));
			}
			
		}
		
		
		
	}

	public void render(SpriteBatch sb)
	{
		for(int i=0; i<carList.size();i++)
		{
			carList.get(i).render(sb);
		}
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}
	
	
	
	
}
