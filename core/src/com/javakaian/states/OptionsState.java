package com.javakaian.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.buttons.Button;
import com.javakaian.imageloader.ImageLoader;
import com.javakaian.inputhandler.OptionsInput;

public class OptionsState extends State
{
	private Button backButton;
	private StateManager sm;

	public OptionsState(StateManager sm) 
	{
		super(sm);
		this.sm=sm;
		backButton = new Button();
		Gdx.input.setInputProcessor(new OptionsInput(this));
	}

	@Override
	public void render(SpriteBatch sb) {
	
		
		backButton.render(sb);
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
		//button animasyonu
		backButton.update(delta);
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}
	public StateManager getSm()
	{
		return sm;
	}

	public Button getBackButton()
	{
		return backButton;
	}
}
