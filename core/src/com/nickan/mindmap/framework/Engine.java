package com.nickan.mindmap.framework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Nickan on 9/7/17.
 */

public class Engine {
    private static Engine instance;

    private Array<Entity> entities;
    private OrthographicCamera orthographicCamera;
    private SpriteBatch spriteBatch;

    public Engine() {
        entities = new Array<Entity>();
        orthographicCamera = CameraManager.newCenteredStretchedCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        spriteBatch = new SpriteBatch();

        System.out.println("Gdx.graphics.getWidth() " + Gdx.graphics.getWidth());
        orthographicCamera.position.set(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 0);
        spriteBatch.setProjectionMatrix(orthographicCamera.combined);
    }

    public void update(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.setProjectionMatrix(orthographicCamera.combined);
        spriteBatch.begin();
        for (Entity entity :entities) {
            entity.update(delta);
        }
        spriteBatch.end();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public OrthographicCamera getOrthographicCamera() {
        return orthographicCamera;
    }

    public static Engine getInstance() {
        if (instance == null)
            instance = new Engine();
        return instance;
    }
}
