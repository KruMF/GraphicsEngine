package graphicsEngine.demo.simple.common.header;

import graphicsEngine.utilities.buttons.Button;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class HeaderButton1 extends Button {
    public HeaderButton1(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Button 1",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        //TODO: finish this
        System.out.println("Placeholder for Button 1 action.");
    }
}