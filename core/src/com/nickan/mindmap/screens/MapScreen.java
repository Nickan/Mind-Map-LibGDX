package com.nickan.mindmap.screens;


import com.badlogic.gdx.Screen;
import com.nickan.mindmap.MindMap;
import com.nickan.mindmap.framework.Engine;
import com.nickan.mindmap.screens.node.Node;

/**
 * Created by nickan on 9/5/17.
 */

public class MapScreen implements Screen {
    private MindMap mindMap;
    private Engine engine;

    public MapScreen(MindMap mindMap) {
        this.mindMap = mindMap;
        engine = Engine.getInstance();
        engine.addEntity(new Node());
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        engine.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
