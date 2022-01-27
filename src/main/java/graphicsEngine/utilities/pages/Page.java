package graphicsEngine.utilities.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.Palette;
import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.utilities.containers.LayerContainer;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

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
     * @param layers ArrayList of layers to add.
     */
    public Page(InputChecker inputChecker, Palette palette, ArrayList<DrawablePart> layers) {
        super(null, null, new ArrayList<>() {{
            add(setBackground(palette));
            addAll(layers);
        }});
        setInputChecker(inputChecker);
    }

    private static Background setBackground(Palette palette) {
        palette = Objects.requireNonNullElse(
                palette,
                new Palette(null, null, null));
        Color backgroundColor = Objects.requireNonNullElse(
                palette.backgroundColor,
                (new Palette(null, null, null)).backgroundColor);

        return new Background(backgroundColor);
    }

    private void setInputChecker(InputChecker inputChecker) {
        inputCheck = Objects.requireNonNullElse(inputChecker, new InputChecker());
    }

    /**
     * Draws this page.
     */
    public void draw(Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        super.draw(g, new int[] {0, 0}, pageSize);
    }
}