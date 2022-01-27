package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.buttons.Button;

// TODO: add javadoc
public class HeaderButton2 extends Button {
    public HeaderButton2(int[] size) {
        super(size, new boolean[] {true, false},
                "Button 2",
                new int[] {0, 0});
    }

    @Override
    public void action() {
        System.out.println("Placeholder for Button 2 action.");
    }
}