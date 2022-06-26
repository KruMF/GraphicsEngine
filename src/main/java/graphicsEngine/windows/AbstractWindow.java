package graphicsEngine.windows;

import javax.swing.*;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class AbstractWindow extends JFrame {
    protected static final String EMPTY_KEY = "";
    public String activePage;

    //creates a window with required parameters
    public AbstractWindow(@NotNull WindowConfig config) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = correctWindowsSizeError(config.getSize());
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        setActivePage(EMPTY_KEY);
        addParts();
        setVisible(true);
    }

    //TODO: add javadoc
    public static int[] correctWindowsSizeError(int[] size) {
        int[] errorCorrection = new int[] {16, 39};
        return new int[] {
                size[0] + errorCorrection[0],
                size[1] + errorCorrection[1]};
    }

    //override this to add parts
    public abstract void addParts();

    //manually reset parts
    public final void resetParts() {
        getContentPane().removeAll();
        addParts();
    }

    public void setActivePage(@Nullable String key) {
        activePage = Objects.requireNonNullElse(key, EMPTY_KEY);
    }
}