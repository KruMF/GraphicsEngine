package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngineSandbox.data.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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