package graphicsEngine.demo.simple.withPages.pages.menuPages.common.headerButtons;

import graphicsEngine.utilities.buttons.Button;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class HB_settings extends Button {

    //TODO: add javadoc
    public HB_settings(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Settings",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        //TODO: finish this
        System.out.println("Placeholder for settings button action.");
    }
}