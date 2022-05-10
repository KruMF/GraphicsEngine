package graphicsEngineOld.parts.simpleParts;

import graphicsEngineOld.utilities.TextAligner;

import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// text label for buttons etc
// TODO: add javadoc
public class SimpleLabel extends ColoredSimplePart {
    // TODO: add javadoc
    static {
        defaultColor = Color.BLACK;
    }

    private String text;
    private int[] textOffset;

    // TODO: add javadoc
    public SimpleLabel(@Nullable String text) {
        this(text, null, null);
    }

    // TODO: add javadoc
    public SimpleLabel(@Nullable String text, @Nullable int[] textOffset, @Nullable Color color) {
        super(color);
        setText(text);
        setTextOffset(textOffset);
    }

    // TODO: add javadoc
    public void setText(@Nullable String text) {
        this.text = Objects.requireNonNullElse(text, "");
    }

    // TODO: add javadoc
    public void setTextOffset(@Nullable int[] textOffset) {
        this.textOffset = Objects.requireNonNullElse(textOffset, new int[] {0, 0});
    }

    // TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        drawText(g);
    }

    private void drawText(Graphics g) {
        TextAligner.drawStringCentered(g, text, new int[] {
                location[0] + size[0] / 2 + textOffset[0],
                location[1] + size[1] / 2 + textOffset[1]});
    }

    public enum TextAlignment {
        CENTER,
        CENTER_LEFT,
        CENTER_RIGHT,
        TOP_CENTER,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_CENTER,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }
}