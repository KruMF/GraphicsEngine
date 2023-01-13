package graphicsEngine.windows;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * Adds known action listeners to this window.
     *
     * @param windowManager      A WindowManager object.
     * @param config             Window configuration.
     * @param actionListenerList List of action listeners to add to this window.
     */
    public AbstractWindow(@NotNull WindowManager windowManager,
                          @NotNull WindowConfig config,
                          @Nullable List<ActionListener> actionListenerList) {
        super(config.getTitle());
        setDefaultCloseOperation(config.closeOperation);

        int[] size = correctWindowsSizeError(config.getSize());
        setSize(size[0], size[1]);
        int[] location = config.getLocation();
        setLocation(location[0], location[1]);

        //TODO: remove window listener from here
        addWindowListener(new CommonWindowListener(windowManager, getWindowKey(), config.closeOperation));
        addListeners(actionListenerList);

        addParts();
        setVisible(true);
    }

    /**
     * Adds known listeners to this page.
     * Override this to add custom listeners.
     *
     * @param list List of listeners to add.
     *
     * @return Remaining unknown listeners.
     */
    public @NotNull List<ActionListener> addListeners(@Nullable List<ActionListener> list) {
        return Objects.requireNonNullElse(list, new ArrayList<>());
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