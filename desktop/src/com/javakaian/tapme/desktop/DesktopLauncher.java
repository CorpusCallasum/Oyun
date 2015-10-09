package com.javakaian.tapme.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.javakaian.tapme.TapMe;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title=TapMe.TITLE;
		config.height=(int) (TapMe.HEIGHT*0.7);
		config.width=(int) (TapMe.WIDTH*0.7);
		
		new LwjglApplication(new TapMe(), config);
	}
}
