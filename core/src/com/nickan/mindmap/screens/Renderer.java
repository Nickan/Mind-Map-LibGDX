package com.nickan.mindmap.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by nickan on 9/5/17.
 */

public class Renderer {


    public void render(float delta) {
        System.out.println("Running: " + delta);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        Gdx.gl.glClearColor(0, 0, 0, 1.0f);
    }
}
