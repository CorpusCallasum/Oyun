package com.javakaian.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.javakaian.states.AboutState;
import com.javakaian.states.MenuState;
import com.javakaian.states.PlayState;

public class AboutInput implements InputProcessor
{
	private AboutState aboutState;
	
	private float zorluk;
	public AboutInput(AboutState aboutState) 
	{
		this.aboutState=aboutState;
		
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


		if(aboutState.getBackButton().getButtonRect().contains(screenX, screenY))
		{
			aboutState.getSm().pushState(new MenuState(aboutState.getSm()));
		}
		
		for(int i=0;i<aboutState.getLevelBoard().getRow();i++)
		{
			for(int j=0; j<aboutState.getLevelBoard().getCol();j++)
			{
				if(aboutState.getLevelBoard().getLevels()[i][j].getCollisionRect().contains(screenX, screenY))
				{
					zorluk=((i)*aboutState.getLevelBoard().getCol())+(j+1);
					System.out.println(zorluk);
					aboutState.getSm().pushState(new PlayState(aboutState.getSm()));
				}
			}
			
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
