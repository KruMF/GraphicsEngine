package graphicsEngine.demo.simple.withPages.common.header;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.utilities.buttons.Button;

import graphicsEngine.demo.simple.withPages.pages.menuPages.startingPage.StartingPage;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class StartButton extends Button {

    //TODO: add javadoc
    public StartButton(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Start",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        GraphicsManager.pages.setActivePage(StartingPage.PAGE_KEY);
    }
}