package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.buttons.Button;

// TODO: add javadoc
public class HeaderButton1 extends Button {
    public HeaderButton1(int[] size) {
        super(size, new boolean[] {true, false},
                "Button 1",
                new int[] {0, 0});
    }

    @Override
    public void action() {
        System.out.println("Placeholder for Button 1 action.");
    }
}