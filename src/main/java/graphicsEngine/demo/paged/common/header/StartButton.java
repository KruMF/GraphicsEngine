package graphicsEngine.demo.paged.common.header;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.parts.interactive.buttons.Button;

import graphicsEngine.demo.paged.pages.menuPages.startingPage.StartingPage;

import com.google.inject.internal.Nullable;

/**
 * Button for returning to starting page.
 */
public class StartButton extends Button {

    /**
     * Constructor for the button.
     *
     * @param size Size of the button. (Null - stretchable)
     */
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