package graphicsEngineDemo.threaded.simple.graphics.controlWindow;

import graphicsEngineDemo.threaded.common.data.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    public MyButton() {
        //setLocation(10, 100);
        //setBounds(10, 100, 20, 20);
        setText("Reset x");
        addActionListener(buttonAction());
    }

    private static ActionListener buttonAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data.resetX();
            }
        };
    }
}