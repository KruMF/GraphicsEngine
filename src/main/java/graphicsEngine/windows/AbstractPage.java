package graphicsEngine.windows;

import java.util.Objects;

import java.awt.Color;
import javax.swing.JPanel;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractPage extends JPanel {
    private static final Color DEFAULT_BACKGROUND = Color.black;

    //TODO: add javadoc
    public AbstractPage() {
        this(null);
    }

    //TODO: add javadoc
    public AbstractPage(@Nullable Color backgroundColor) {
        setBackground(Objects.requireNonNullElse(backgroundColor, DEFAULT_BACKGROUND));
    }

    //TODO: add javadoc
    public abstract String getPageKey();
}