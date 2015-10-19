package com.javakaian.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.imageloader.ImageLoader;
import com.javakaian.inputhandler.GameOverInput;

public class GameOverState extends State
{
	private StateManager sm;

	public GameOverState(StateManager sm) {
		super(sm);
		
		this.sm=sm;
		Gdx.input.setInputProcessor(new GameOverInput(this));
	}

	@Override
	public void render(SpriteBatch sb) {

		sb.setProjectionMatrix(camera.combined);
		sb.begin();
		
		ImageLoader.font.draw(sb, "Game", 100, 50);
		ImageLoader.font.draw(sb, "Over", 100, 150);
		
		
		sb.end();
		
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	public StateManager getSm() {
		return sm;
	}

	public void setSm(StateManager sm) {
		this.sm = sm;
	}
	

}
