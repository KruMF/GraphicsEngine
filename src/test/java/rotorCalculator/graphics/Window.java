package rotorCalculator.graphics;

import graphicsEngineSwingBeta.windows.AbstractWindow;
import graphicsEngineSwingBeta.windows.WindowConfig;

//TODO: add javadoc
public class Window extends AbstractWindow {
    public Window() {
        super(config());
    }

    private static WindowConfig config() {
        String title = "Rotor calculator";
        int[]
                size = new int[] {700, 500},
                location = new int[] {50, 50};
        WindowConfig config = new WindowConfig(title, size, location);
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
    }

    @Override
    public void addParts() {
        //TODO: add parts here
    }
}