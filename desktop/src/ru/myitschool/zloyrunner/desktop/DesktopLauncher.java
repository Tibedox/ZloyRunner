package ru.myitschool.zloyrunner.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.myitschool.zloyrunner.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MyGame.SCR_WIDTH;
		config.height = MyGame.SCR_HEIGHT;
		new LwjglApplication(new MyGame(), config);
	}
}
