package com.javakaian.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.javakaian.states.MenuState;
import com.javakaian.states.OptionsState;

public class OptionsInput implements InputProcessor
{

	private OptionsState optionsState;
	
	public OptionsInput(OptionsState optionsState)
	{
		this.optionsState=optionsState;
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

	
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{

		if(optionsState.getBackButton().getButtonRect().contains(screenX, screenY))
		{
			
			optionsState.getSm().pushState(new MenuState(optionsState.getSm()));
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
