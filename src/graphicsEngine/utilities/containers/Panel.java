package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

// TODO: add javadoc
public class Panel extends LayerContainer {
    public Panel(int[] size, boolean[] fixedSize,
                 Color background, Color border,
                 ArrayList<DrawablePart> panelParts, AlignmentType alignment) {
        super(size, fixedSize, new ArrayList<>());
        parts.add(new Background(background));
        parts.add(new Border(border));
        parts.add(new PartContainer(
                null, null,
                panelParts, Objects.requireNonNullElse(alignment, AlignmentType.TOP)));
    }
}