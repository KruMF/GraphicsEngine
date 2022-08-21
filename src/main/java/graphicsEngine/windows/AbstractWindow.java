package graphicsEngine.windows;

import javax.swing.JFrame;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class AbstractWindow extends JFrame {
    protected static final String EMPTY_KEY = "";
    private String activePage;

    //creates a window with required parameters
    public AbstractWindow(@NotNull WindowConfig config) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = correctWindowsSizeError(config.getSize());
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        setActivePage(null);
        setVisible(true);
    }

    //TODO: add javadoc
    public static int[] correctWindowsSizeError(int[] size) {
        int[] errorCorrection = new int[] {16, 39};
        return new int[] {
                size[0] + errorCorrection[0],
                size[1] + errorCorrection[1]};
    }

    /**
     * Get the key of the currently active page.
     *
     * @return String of the key.
     */
    public String getActivePage() {
        return activePage;
    }

    //TODO: finish this and add javadoc
    public void setActivePage(@Nullable String key) {
        activePage = Objects.requireNonNullElse(key, EMPTY_KEY);
        resetParts();
    }

    /**
     * Call this to manually reset parts.
     */
    public final void resetParts() {
        getContentPane().removeAll();
        addParts();
    }

    /**
     * Override this to add parts.
     * Called upon creation and part reset.
     */
    public abstract void addParts();
}