package graphicsEngine.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.panels.PanelManager;
import graphicsEngine.utilities.parts.Background;

import java.awt.*;

public abstract class Page {
    Background background;
    PanelManager panelManager;

    public Page() {
        background = new Background(GraphicsManager.data.colorParameters.backgroundColor);

        Color panelColor = Color.gray;
        Color borderColor = Color.darkGray;
        int header = 100, footer = 150;

        panelManager = new PanelManager(
                panelColor, borderColor,
                header,
                footer);
    }

    public void draw(Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        background.draw(
                g,
                new int[]{0, 0},
                pageSize);

        int headerHeight = panelManager.header.size[1];
        int[] centerSize = new int[]{
                pageSize[0],
                Math.max(
                        0,
                        pageSize[1] - headerHeight - panelManager.footer.size[1])};
        drawCenter(
                g,
                new int[]{0, headerHeight},
                centerSize);

        panelManager.draw(g, pageSize);
    }

    public void drawCenter(Graphics g, int[] location, int[] size) {
    }
}
