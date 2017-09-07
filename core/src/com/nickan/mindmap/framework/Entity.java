package com.nickan.mindmap.framework;

import com.badlogic.gdx.utils.Array;

/**
 * Created by Nickan on 9/7/17.
 */

public class Entity {
    private Array<Component> components;

    public Entity() {
        components = new Array<Component>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void update(float delta) {
        for (Component component: components) {
            component.update(delta);
        }
    }
}
