package graphicsEngineDemo.d5_featurePreview.common;

import java.awt.*;
import java.util.List;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//TODO: add javadoc
public abstract class AbstractMenuPage extends AbstractCommonPage {
    //TODO: add javadoc
    public AbstractMenuPage(@Nullable ActionListener actionListener) {
        super(actionListener);
        addComponents(initialCentralComponents(actionListener));
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {}

    private void addComponents(@Nullable List<Component> components) {
        add(new JPanel() {{
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBackground(new Color(0,0,0,0));
            if (components != null && components.size() > 0) {
                for (Component component : components) {
                    add(component);
                }
            }
        }});
    }

    //TODO: add javadoc
    public abstract @Nullable List<Component> initialCentralComponents(@Nullable ActionListener actionListener);
}