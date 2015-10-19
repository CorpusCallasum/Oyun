package com.javakaian.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.javakaian.states.GameOverState;
import com.javakaian.states.MenuState;

public class GameOverInput implements InputProcessor
{

	private GameOverState gameOverState;
	public GameOverInput(GameOverState gameOverState)
	{
		this.gameOverState=gameOverState;
		
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
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		
		gameOverState.getSm().pushState(new MenuState(gameOverState.getSm()));
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {

		
		
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
