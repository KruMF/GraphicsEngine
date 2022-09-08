package graphicsEngine.windows;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import org.jetbrains.annotations.NotNull;

/**
 * An abstract window with required configuration and methods.
 */
public abstract class AbstractWindow extends JFrame {
    /**
     * Window size correction constant.
     */
    public static final int[] SIZE_ERROR_CORRECTION = new int[] {16, 39};

    /**
     * Corrects window size error that happens due to title bar and borders.
     * Uses hardcoded values.
     *
     * @param size Initial size.
     *
     * @return Corrected size.
     */
    public static int[] correctWindowsSizeError(int[] size) {
        return new int[] {
                size[0] + SIZE_ERROR_CORRECTION[0],
                size[1] + SIZE_ERROR_CORRECTION[1]};
    }

    /**
     * Creates a new AbstractWindow with specified configuration.
     *
     * @param windowManager A WindowManager object.
     * @param config        Window configuration.
     */
    public AbstractWindow(@NotNull WindowManager windowManager,
                          @NotNull WindowConfig config) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = correctWindowsSizeError(config.getSize());
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        addWindowListener(new CommonWindowListener(windowManager, getWindowKey(), config.closeOperation));

        addParts();
        setVisible(true);
    }

    /**
     * Gets the key of the window.
     *
     * @return The key of the window.
     */
    public @NotNull abstract String getWindowKey();

    /**
     * Call this to manually reset parts.
     */
    public final void resetParts() {
        getContentPane().removeAll();
        addParts();
        getContentPane().validate();
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