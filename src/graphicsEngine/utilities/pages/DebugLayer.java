package graphicsEngine.utilities.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.input.InputData;

import java.awt.*;
import java.util.ArrayList;

import static graphicsEngine.utilities.GraphicsHelper.*;

public class DebugLayer {
    public static void draw(Graphics g){
        g.setColor(Color.white);
        int[] drawLocation = new int[]{100, 150};
        int rowCount = drawHeader(g, drawLocation);
        rowCount += 2; //empty lines for vertical separation

        /*
        drawLocation = new int[]{drawLocation[0], drawLocation[1] + rowsTotalHeight(rowCount)};
        rowCount = fileHandlerTest(g, drawLocation);
        rowCount += 2; //empty lines for vertical separation
         */

        drawLocation = new int[]{drawLocation[0], drawLocation[1] + rowsTotalHeight(rowCount)};
        inputTest(g, drawLocation);
    }

    private static int drawHeader(Graphics g, int[] location){
        return drawStrings_VA(
                g, 0,
                new String[]{"This is debug panel!"},
                location);
    }

    private static int fileHandlerTest(Graphics g, int[] location){
        return drawTable(
                g,
                new String[]{"File handler test data."},
                new ArrayList<>() {{
                    add(new Column("Name", 50));
                    add(new Column("Value", 200));
                }},
                GraphicsManager.data.fileHandlerTestData,
                location);
    }

    private static void inputTest(Graphics g, int[] location){

        InputData input = GraphicsManager.input.inputData;

        String[] header = new String[]{
                "InputData test.",
                "x:" + input.mouse[0]
                        + " y: " + input.mouse[1]
                        + ", click: " + input.mouseClick,
                "Keys pressed:"};

        int[] keys = input.keys;
        String[] rows = new String[header.length + keys.length];

        for (int i = 0; i < header.length; i++) rows[i] = header[i];

        for (int i = 0; i < keys.length; i++) rows[i + header.length] = String.valueOf(keys[i]);

        drawStrings_VA(
                g, 0,
                rows,
                location);
    }
}