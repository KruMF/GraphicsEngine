package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.*;

public class ListenerAdder {
    public ListenerAdder(
            JFrame window,
            InputData inputData,
            boolean extra){
        new WindowListenerAdder(window, inputData);
        new KeyboardListenerAdder(window, inputData);
        new MouseListenerAdder(window, inputData);

        if(extra) addExtraListeners();
    }

    private static void addExtraListeners(){
        //placeholder for adding new listeners (joysticks, controllers, etc)
    }
}