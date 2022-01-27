package graphicsEngine.demo.simple.common.header;

import graphicsEngine.utilities.buttons.Button;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class HeaderButton2 extends Button {
    public HeaderButton2(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Button 2",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        //TODO: Finish this
        System.out.println("Placeholder for Button 2 action.");
    }
}