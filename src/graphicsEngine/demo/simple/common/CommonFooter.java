package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.containers.Panel;

// TODO: add javadoc
public class CommonFooter extends Panel {
    public static final int HEIGHT = 50;

    // TODO: add javadoc
    public CommonFooter() {
        super(new int[] {0, HEIGHT}, new boolean[] {false, true},
                CommonPage.PANEL_BACKGROUND_COLOR, CommonPage.PANEL_BORDER_COLOR,
                null, null);
    }
}