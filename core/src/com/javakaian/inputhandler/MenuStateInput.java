package com.javakaian.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;
import com.javakaian.buttons.Button;
import com.javakaian.states.AboutState;
import com.javakaian.states.MenuState;
import com.javakaian.states.OptionsState;
import com.javakaian.states.PlayState;

public class MenuStateInput implements InputProcessor
{
	private MenuState menuState;
	
	
	
	
	public MenuStateInput(MenuState menuState) 
	{

		this.menuState=menuState;
		
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) 
	{
		
		
		
		if(menuState.getPlayButton().getButtonRect().contains(screenX,screenY))
		{
			menuState.getSm().pushState(new PlayState(menuState.getSm()));
			
		}
		if(menuState.getOptionsButton().getButtonRect().contains(screenX,screenY))
		{
			menuState.getSm().pushState(new OptionsState(menuState.getSm()));
			
		}
		if(menuState.getAboutButton().getButtonRect().contains(screenX,screenY))
		{
			menuState.getSm().pushState(new AboutState(menuState.getSm()));
			
		}
		
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
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
