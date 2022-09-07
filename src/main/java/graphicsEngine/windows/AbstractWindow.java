package graphicsEngine.windows;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class AbstractWindow extends JFrame {
    public static final int[] SIZE_ERROR_CORRECTION = new int[] {16, 39};

    //TODO: add javadoc
    public static int[] correctWindowsSizeError(int[] size) {
        return new int[] {
                size[0] + SIZE_ERROR_CORRECTION[0],
                size[1] + SIZE_ERROR_CORRECTION[1]};
    }

    protected static final String EMPTY_KEY = "";

    //creates a window with required parameters
    public AbstractWindow(@NotNull WindowConfig config) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = correctWindowsSizeError(config.getSize());
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        addParts();
        setVisible(true);
    }

    //TODO: add javadoc
    public @NotNull abstract String getWindowKey();

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

    /**
     * Sets the icon of the window.
     *
     * @param icon ImageIcon object.
     */
    public void setIcon(@NotNull ImageIcon icon) {
        setIconImage(icon.getImage());
    }
}