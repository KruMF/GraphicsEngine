package graphicsEngineSwingBeta.windows;

import javax.swing.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class AbstractWindow extends JFrame {

    //creates a window with required parameters
    public AbstractWindow(@NotNull WindowConfig config) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = config.getSize();
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        addParts();
        setVisible(true);
    }

    //override this to add parts
    public abstract void addParts();

    //manually reset parts
    @SuppressWarnings("unused")
    public final void resetParts() {
        getContentPane().removeAll();
        addParts();
    }
}