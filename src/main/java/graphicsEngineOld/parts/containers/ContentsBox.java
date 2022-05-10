package graphicsEngineOld.parts.containers;

import graphicsEngineOld.parts.simpleParts.DrawablePart;
import graphicsEngineOld.parts.simpleParts.Background;
import graphicsEngineOld.parts.simpleParts.Border;

import java.awt.*;
import java.util.ArrayList;

import com.google.inject.internal.Nullable;

// Background and border for a container.
// TODO: finish this and add javadoc
public class ContentsBox extends LayerContainer {

    /**
     * Creates a layer container containing background, border and contents.
     *
     * @param size       Size of the panel.
     * @param fixedSize  Size fixation status for either direction.
     * @param background Background color.
     * @param border     Border color.
     */
    public ContentsBox(@Nullable int[] size, @Nullable boolean[] fixedSize,
                       @Nullable Color background, @Nullable Color border,
                       DrawablePart contents) {
        super(size, fixedSize, new ArrayList<>());

        parts.add(new Background(background));
        parts.add(new Border(border));

        parts.add(contents);
    }

    /**
     * Sets the background color of the panel.
     *
     * @param color New color.
     */
    @SuppressWarnings("unused")
    public void setBackgroundColor(@Nullable Color color) {
        ((Background) parts.get(0)).setColor(color);
    }

    /**
     * Sets the border color of the panel.
     *
     * @param color New color.
     */
    @SuppressWarnings("unused")
    public void setBorderColor(@Nullable Color color) {
        ((Border) parts.get(1)).setColor(color);
    }
}