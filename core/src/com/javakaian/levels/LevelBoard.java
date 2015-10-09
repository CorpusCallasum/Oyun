package com.javakaian.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LevelBoard
{
	private int row,col;
	
	private LevelBox[][] levels;
	
	private float bosluk;
	private float xKord,yKord,width,height;
	
	public LevelBoard(int row,int col)
	{
		this.row=row;
		this.col=col;
		bosluk=Gdx.graphics.getWidth()/10;
		xKord=bosluk;
		yKord=bosluk;
		width =(Gdx.graphics.getWidth()-((col+1)*bosluk))/col;
		height=width;
		levels = new LevelBox[row][col];	
		initLevelBox();
	}
	public void render(SpriteBatch sb)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0; j<col;j++)
			{
				levels[i][j].render(sb);
			}
		}
	}
	public void update(float delta)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0; j<col;j++)
			{
				levels[i][j].update(delta);
			}
		}
	}
	
	public void initLevelBox()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0; j<col;j++)
			{
				levels[i][j] = new LevelBox(xKord, yKord, width, height);
				xKord+=(bosluk+width);
			}
			xKord=bosluk;
			yKord+=(bosluk+height);
		}
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public LevelBox[][] getLevels() {
		return levels;
	}
	public void setLevels(LevelBox[][] levels) {
		this.levels = levels;
	}
	
	

}
