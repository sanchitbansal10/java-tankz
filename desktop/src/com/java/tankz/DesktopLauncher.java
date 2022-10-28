package com.java.tankz;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.java.tankz.JavaTankz;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
// Add the JVM argument by following this: https://stackoverflow.com/questions/37978702/glfw-engine-and-the-main-thread-issue-intellij
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Java Tankz");
		new Lwjgl3Application(new JavaTankz(), config);
	}
}
