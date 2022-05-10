package graphicsEngine.windows;

import java.awt.*;
import javax.swing.*;

import java.util.Objects;

import com.google.inject.internal.Nullable;

public abstract class AbstractPage extends JPanel {
    private static final Color DEFAULT_BACKGROUND = Color.black;

    public AbstractPage() {
        this(null);
    }

    public AbstractPage(@Nullable Color backgroundColor) {
        setBackground(Objects.requireNonNullElse(backgroundColor, DEFAULT_BACKGROUND));
    }

    public abstract String getPageKey();
}