package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.panels.AbstractFooter;

import java.awt.*;

public class Footer extends AbstractFooter {

    private static final int height = 50;

    public Footer() {
        super(
                height,
                Color.gray, Color.darkGray,
                null);
    }
}