package com.nickan.mindmap.screens.node;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.nickan.mindmap.framework.Component;
import com.nickan.mindmap.framework.Engine;

/**
 * Created by Nickan on 9/7/17.
 */

public class Label extends Component {
    private ShapeRenderer shapeRenderer;
    private float x = 0;

    public Label() {
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(Engine.getInstance().getOrthographicCamera().combined);
    }

    @Override
    public void update(float delta) {
        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(x += 1, 0, 50);
        shapeRenderer.end();
    }
}
