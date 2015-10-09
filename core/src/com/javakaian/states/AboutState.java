package com.javakaian.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.javakaian.buttons.Button;
import com.javakaian.inputhandler.AboutInput;
import com.javakaian.levels.LevelBoard;




public class AboutState extends State
{

	private StateManager sm;
	private Button backButton;
	
	private LevelBoard levelBoard;
	
	public AboutState(StateManager sm)
	{
		super(sm);
		
		this.sm=sm;
		backButton = new Button();
		Gdx.input.setInputProcessor(new AboutInput(this));
	
		levelBoard = new LevelBoard(5,3);
		
	}

	
	public void render(SpriteBatch sb) 
	{


		
		backButton.render(sb);
		
		levelBoard.render(sb);
	}

	
	public void update(float delta)
	{
		
		levelBoard.update(delta);
		//button animasyonu
		backButton.update(delta);
	}

	
	public void handleInput()
	{
	
		
	}
	
	public Button getBackButton()
	{
		return backButton;
	}

	public StateManager getSm()
	{
		return sm;
	}


	public LevelBoard getLevelBoard() {
		return levelBoard;
	}


	public void setLevelBoard(LevelBoard levelBoard) {
		this.levelBoard = levelBoard;
	}


	public void setSm(StateManager sm) {
		this.sm = sm;
	}


	
	

	

}
