package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.containers.LayerContainer;
import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;
import java.util.ArrayList;

public class CommonFooter extends LayerContainer {

    public static final int HEIGHT = 50;

    public CommonFooter() {
        super(new int[] {0, HEIGHT}, new boolean[] {false, true}, new ArrayList<>());
        parts.addAll(prepareLayers());
    }

    private ArrayList<? extends SimplePart> prepareLayers() {
        Color backgroundColor = Color.gray;
        Color borderColor = Color.darkGray;

        Background background = new Background(this.size, this.fixedSize, backgroundColor);
        Border border = new Border(this.size, this.fixedSize, borderColor);

        return new ArrayList<>() {{
            add(background);
            add(border);
        }};
    }
}