package com.nickan.mindmap;


import com.badlogic.gdx.Game;
import com.nickan.mindmap.screens.MapScreen;

public class MindMap extends Game {


	@Override
	public void create() {
		setScreen(new MapScreen(this));
	}
}
