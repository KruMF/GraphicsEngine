package graphicsEngine.parts.pages;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.parts.simpleParts.Background;
import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.containers.LayerContainer;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple page with a background and layer container.
 * Has its own input checker for page-specific keyboard actions.
 * Has to be extended.
 */
public abstract class Page extends LayerContainer {
    public InputChecker inputCheck;

    /**
     * Creates a simple page with background and adds provided layers.
     *
     * @param inputChecker InputChecker to use. (Null - new InputChecker)
     * @param palette      Color palette to use. (Null - default)
     * @param layers       ArrayList of layers to add. (Null - blank page)
     */
    public Page(@Nullable InputChecker inputChecker, @Nullable Palette palette,
                @Nullable ArrayList<DrawablePart> layers) {
        super(null, null, new ArrayList<>() {{
            add(setBackground(palette));
            addAll(Objects.requireNonNullElse(layers, new ArrayList<>()));
        }});
        setInputChecker(inputChecker);
    }

    private static Background setBackground(@Nullable Palette palette) {
        palette = Objects.requireNonNullElse(
                palette,
                new Palette(null, null, null));
        Color backgroundColor = Objects.requireNonNullElse(
                palette.backgroundColor,
                (new Palette(null, null, null)).backgroundColor);

        return new Background(backgroundColor);
    }

    private void setInputChecker(@Nullable InputChecker inputChecker) {
        inputCheck = Objects.requireNonNullElse(inputChecker, new InputChecker());
    }

    /**
     * Draws this page.
     */
    public void draw(@NotNull Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        super.draw(g, new int[] {0, 0}, pageSize);
    }
}