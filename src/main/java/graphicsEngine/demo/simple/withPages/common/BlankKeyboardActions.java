package graphicsEngine.demo.simple.withPages.common;

import graphicsEngine.utilities.input.InputChecker;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class BlankKeyboardActions extends InputChecker {

    //TODO: add javadoc
    public BlankKeyboardActions() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void keyboardActions(@NotNull String keyText) {
        //prevents printing output for undefined keys to console
    }
}