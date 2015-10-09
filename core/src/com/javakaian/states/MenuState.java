package com.javakaian.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.buttons.Button;
import com.javakaian.imageloader.ImageLoader;
import com.javakaian.inputhandler.MenuStateInput;

public class MenuState extends State
{

	private StateManager sm;
	private Button playButton,optionsButton,aboutButton;
	
	private float buttonX;
	private float buttonY;
	
	
	public MenuState(StateManager sm) {
		super(sm);
		
		this.sm=sm;
		buttonX=Gdx.graphics.getWidth()/6;
		buttonY=Gdx.graphics.getHeight()/4;
		
		Gdx.input.setInputProcessor(new MenuStateInput(this));
		playButton = new Button(buttonX, buttonY,ImageLoader.playButtonRegion);
		optionsButton = new Button(buttonX,buttonY*2, ImageLoader.options);
		aboutButton = new Button(buttonX, buttonY*3, ImageLoader.about);
	}


	public void render(SpriteBatch sb) 
	{
		//butonlar cizdirilcek.
		sb.setProjectionMatrix(camera.combined);
		sb.begin();
		
		sb.draw(ImageLoader.bgRegion, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		sb.end();
		playButton.render(sb);
		optionsButton.render(sb);
		aboutButton.render(sb);
		
	}

	
	public void update(float delta) {
		
		playButton.update(delta);
		optionsButton.update(delta);
		aboutButton.update(delta);
		
	}

	
	public void handleInput() {
		
		
	}

	public StateManager getSm()
	{
		return sm;
	}


	public Button getPlayButton() {
		return playButton;
	}


	public void setPlayButton(Button playButton) {
		this.playButton = playButton;
	}


	public Button getOptionsButton() {
		return optionsButton;
	}


	public void setOptionsButton(Button optionsButton) {
		this.optionsButton = optionsButton;
	}


	public Button getAboutButton() {
		return aboutButton;
	}


	public void setAboutButton(Button aboutButton) {
		this.aboutButton = aboutButton;
	}

	
	

}
