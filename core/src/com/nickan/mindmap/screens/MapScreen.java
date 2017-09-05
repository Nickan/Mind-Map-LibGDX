package com.nickan.mindmap.screens;


import com.badlogic.gdx.Screen;
import com.nickan.mindmap.MindMap;

/**
 * Created by nickan on 9/5/17.
 */

public class MapScreen implements Screen {
    private MindMap mindMap;
    private Renderer renderer;

    public MapScreen(MindMap mindMap) {
        this.mindMap = mindMap;
    }

    @Override
    public void show() {
        renderer = new Renderer();
    }

    @Override
    public void render(float delta) {
        renderer.render(delta);
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
