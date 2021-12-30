package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.*;

public class ListenerAdder {
    public ListenerAdder(JFrame window, InputData inputData){
        new WindowListenerAdder(window, inputData);
        new KeyboardListenerAdder(window, inputData);
        new MouseListenerAdder(window, inputData);
    }
}