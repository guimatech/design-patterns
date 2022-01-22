package github.composite;

import java.util.ArrayList;
import java.util.List;

public class SceneGroup implements SceneObject {

    private List<SceneObject> children = new ArrayList<>();

    public void add(SceneObject sceneObject) {
        children.add(sceneObject);
    }

    public void remove(SceneObject sceneObject) {
        children.remove(sceneObject);
    }

    @Override
    public void draw() {
        children.forEach(SceneObject::draw);
    }
}
