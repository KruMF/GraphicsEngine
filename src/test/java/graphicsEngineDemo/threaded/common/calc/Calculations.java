package graphicsEngineDemo.threaded.common.calc;

import graphicsEngineDemo.threaded.common.data.Data;
import ThreadAbstraction.AbstractThread;

//a class for containing calculations
public class Calculations extends AbstractThread {
    //put parameters here

    public Calculations() {
        //reset some variables here
    }

    @Override
    public void update() {
        printLine("Calculating...");
        calculate();
    }

    private void calculate() {
        Data.incrementX();
    }

    private static void printLine(String message) {
        System.out.println(message);
    }
}