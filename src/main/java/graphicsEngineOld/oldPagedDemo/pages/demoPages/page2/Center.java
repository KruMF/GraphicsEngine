package graphicsEngineOld.oldPagedDemo.pages.demoPages.page2;

import graphicsEngineOld.utilities.TextAligner;
import graphicsEngineOld.parts.simpleParts.SimplePart;

import graphicsEngineOld.oldPagedDemo.pages.demoPages.page2.grid.Table;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class Center extends SimplePart {
    private static final boolean DRAW_PAGE_MESSAGE = true;
    private static final int TABLE_MARGIN = 30;

    protected static final Table table = new Table();

    //TODO: add javadoc
    protected Center() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        table.draw(g, getTableLocation(), getTableSize());

        if (DRAW_PAGE_MESSAGE) {
            drawPageMessage(g);
        }
    }

    private int[] getTableLocation() {
        return new int[] {
                location[0] + Math.min(size[0], TABLE_MARGIN),
                location[1] + Math.min(size[1], TABLE_MARGIN)};
    }

    private int[] getTableSize() {
        return new int[] {
                Math.max(0, size[0] - 2 * TABLE_MARGIN),
                Math.max(0, size[1] - 2 * TABLE_MARGIN)};
    }

    private void drawPageMessage(Graphics g) {
        g.setColor(Color.green);
        TextAligner.drawStringCentered(g, "This is the oldPagedDemo page 2",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});
    }
}