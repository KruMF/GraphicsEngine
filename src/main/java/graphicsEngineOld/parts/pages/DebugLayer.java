package graphicsEngineOld.parts.pages;

import graphicsEngineOld.engine.GraphicsManager;
import graphicsEngineOld.utilities.input.InputData;

import static graphicsEngineOld.utilities.TextAligner.*;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

// TODO: needs rework
public class DebugLayer {
    public static void draw(@NotNull Graphics g) {
        g.setColor(Color.white);
        int[] drawLocation = new int[] {100, 150};
        int rowCount = drawHeader(g, drawLocation);
        rowCount += 2; //empty lines for vertical separation

        drawLocation = new int[]{drawLocation[0], drawLocation[1] + rowsTotalHeight(rowCount)};
        inputTest(g, drawLocation);
    }

    private static int drawHeader(@NotNull Graphics g, int[] location) {
        return drawStrings_VA(
                g, 0,
                new String[] {"This is debug layer!"},
                location);
    }

    private static void inputTest(@NotNull Graphics g, int[] location) {
        InputData input = GraphicsManager.input.inputData;

        int[] drawableSize = GraphicsManager.data.windowParameters.drawSize;

        String[] header = new String[] {
                "Screen size (drawable) :",
                drawableSize[0] + " x " + drawableSize[1],
                "",
                "InputData test.",
                "x:" + input.mouse[0]
                        + " y: " + input.mouse[1]
                        + ", click: " + input.mouseClick,
                "Keys pressed:"};

        int[] keys = input.keys;
        String[] rows = new String[header.length + keys.length];

        for (int i = 0; i < header.length; i++) {
            rows[i] = header[i];
        }

        for (int i = 0; i < keys.length; i++) {
            rows[i + header.length] = String.valueOf(keys[i]);
        }

        drawStrings_VA(
                g, 0,
                rows,
                location);
    }
}