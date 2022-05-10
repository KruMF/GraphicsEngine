package graphicsEngineOld.oldPagedDemo.pages.menuPages.common.headerButtons;

import graphicsEngineOld.engine.GraphicsManager;
import graphicsEngineOld.parts.interactive.buttons.Button;

import graphicsEngineOld.oldPagedDemo.pages.menuPages.demoSelectPage.DemoSelectPage;

import com.google.inject.internal.Nullable;

/**
 * Header button for switching to oldPagedDemo select page.
 */
public class HB_demoSelect extends Button {

    /**
     * Constructor for the button.
     *
     * @param size Size of the button. (Null - stretchable)
     */
    public HB_demoSelect(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Demo Selection",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        GraphicsManager.pages.setActivePage(DemoSelectPage.PAGE_KEY);
    }
}