package graphicsEngineOld.oldPagedDemo.pages.demoPages.page2.grid;

import graphicsEngineOld.utilities.TextAligner;

import java.util.Random;
import java.awt.*;

//TODO: add javadoc
public class Cell {
    private static final double
            MIN_VALUE = 5.0,
            MAX_VALUE = 10.0;

    private static final Color
            CIRCLE_BACKGROUND_COLOR = Color.darkGray,
            CIRCLE_BORDER_COLOR = Color.lightGray,
            TEXT_COLOR = Color.white;

    private double value;

    //TODO: add javadoc
    public Cell() {
        setRandomValue();
    }

    private static double getRandomValue() {
        double random = new Random().nextDouble();
        double delta = Math.max(0, MAX_VALUE - MIN_VALUE);
        return MIN_VALUE + random * delta;
    }

    //TODO: add javadoc
    public void setValue(double value) {
        this.value = value;
    }

    //TODO: add javadoc
    public void setRandomValue() {
        setValue(getRandomValue());
    }

    //TODO: add javadoc
    public double getValue() {
        return value;
    }

    //TODO: add javadoc
    public void draw(Graphics g, int[] location, int[] size) {
        int[] center = getCenter(location, size);

        drawCircle(g,
                center,
                Math.min(size[0], size[1]));

        drawValue(g, center);
    }

    private int[] getCenter(int[] location, int[] size) {
        return new int[] {
                location[0] + size[0] / 2,
                location[1] + size[1] / 2
        };
    }

    private void drawCircle(Graphics g, int[] center, int size) {
        int drawSize = (int) (getValue() / MAX_VALUE * size);
        int[] drawLocation = new int[] {
                center[0] - drawSize / 2,
                center[1] - drawSize / 2};

        g.setColor(CIRCLE_BACKGROUND_COLOR);
        g.fillOval(drawLocation[0], drawLocation[1], drawSize, drawSize);
        g.setColor(CIRCLE_BORDER_COLOR);
        g.drawOval(drawLocation[0], drawLocation[1], drawSize, drawSize);
    }

    private void drawValue(Graphics g, int[] location) {
        g.setColor(TEXT_COLOR);
        TextAligner.drawStringCentered(g, prepareValueForShowing(), location);
    }

    private String prepareValueForShowing() {
        return String.format("%.2f", getValue());
    }
}