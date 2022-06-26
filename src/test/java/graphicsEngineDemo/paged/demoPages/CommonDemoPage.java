package graphicsEngineDemo.paged.demoPages;

import graphicsEngine.windows.AbstractPage;

import java.awt.*;

public abstract class CommonDemoPage extends AbstractPage {
    CommonDemoPage() {
        super();
    }

    CommonDemoPage(Color backgroundColor) {
        super(backgroundColor);
    }
}