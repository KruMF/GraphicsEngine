package graphicsEngine.utilities.input.listeners;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.ExitManager;

import javax.swing.JFrame;

public class ListenerAdder {
    public ListenerAdder(
            JFrame window, WindowParameters windowParameters,
            InputData inputData,
            ExitManager exitManager,
            boolean extra){
        new WindowListenerAdder(
                window, windowParameters,
                inputData,
                exitManager);
        new KeyboardListenerAdder(
                window,
                inputData);
        new MouseListenerAdder(
                window,
                inputData);

        if(extra) addExtraListeners();
    }

    private static void addExtraListeners(){
        //placeholder for adding new listeners (joysticks, controllers, etc)
    }
}