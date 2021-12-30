package graphicsEngine.utilities.input.listeners;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.utilities.input.InputData;

import javax.swing.JFrame;

public class ListenerAdder {
    public ListenerAdder(
            JFrame window, WindowParameters windowParameters,
            InputData inputData,
            boolean extra){
        new WindowListenerAdder(window, windowParameters, inputData);
        new KeyboardListenerAdder(window, inputData);
        new MouseListenerAdder(window, inputData);

        if(extra) addExtraListeners();
    }

    private static void addExtraListeners(){
        //placeholder for adding new listeners (joysticks, controllers, etc)
    }
}