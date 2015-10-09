package com.javakaian.inputhandler;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.javakaian.states.MenuState;
import com.javakaian.states.PlayState;
import com.javakaian.tapme.TapMe;

public class PlayStateInput implements InputProcessor 
{

	private PlayState playState;
	
	public PlayStateInput(PlayState playState)
	{
		this.playState=playState;
		
	}
	
	
	
	public boolean keyDown(int keycode) {
		
	
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		
		
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
	
		if(pointer==0)
		{
			if(screenX<Gdx.graphics.getWidth()/2)
			{
			playState.getGameWorld().getController().setClicked(true);
			playState.getGameWorld().getPlayer().setMoveWithDirection(true);
			
			}
			
		}
		
		
		System.out.println(pointer);
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		
		
		if(pointer==0)
		{
			playState.getGameWorld().getController().setClicked(false);
			playState.getGameWorld().getPlayer().setMoveWithDirection(false);
			playState.getGameWorld().getController().setEndCord(new Vector2(2*Gdx.graphics.getWidth()/10,
					Gdx.graphics.getHeight()-2*Gdx.graphics.getWidth()/10)
					
					);
			
		}
	
		
		
		
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
