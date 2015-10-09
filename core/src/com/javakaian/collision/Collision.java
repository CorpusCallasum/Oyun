package com.javakaian.collision;

import java.util.ArrayList;

import com.javakaian.gameobject.Car;
import com.javakaian.gameobject.Player;
import com.javakaian.handler.CarHandler;

public class Collision 
{
	
	public static boolean isThereCollision(Player player, Car car)
	{
		
		if(player.getCollisionRect().overlaps(car.getCollisionRect()))
		{
			System.out.println("carptýn..");
			return true;
		}
		
		
		return false;
	}
	
	public static boolean isThereCollision(Player player, CarHandler carHandler)
	{
		
		for(int i=0;i<carHandler.getCarList().size();i++)
		{
			if(player.getCollisionRect().overlaps(carHandler.getCarList().get(i).getCollisionRect()))
			{
				System.out.println("carptýn..");
				return true;
			}
			
		}
		
		
		
		return false;
	}

}
