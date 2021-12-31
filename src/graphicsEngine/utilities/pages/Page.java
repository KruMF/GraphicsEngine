package graphicsEngine.utilities.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.input.InputCheck;
import graphicsEngine.utilities.panels.AbstractFooter;
import graphicsEngine.utilities.panels.AbstractHeader;
import graphicsEngine.utilities.panels.PanelManager;
import graphicsEngine.utilities.simpleParts.Background;

import java.awt.*;

public abstract class Page {
    Background background;
    public PanelManager panelManager;
    public InputCheck inputCheck;

    public Page(AbstractHeader header, AbstractFooter footer) {
        background = new Background(
                GraphicsManager.data.windowParameters.drawSize,
                GraphicsManager.data.palette.backgroundColor);

        panelManager = new PanelManager(header, footer);
        inputCheck = new InputCheck();
    }

    public void draw(Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        background.draw(
                g,
                new int[]{0, 0},
                pageSize);

        int headerHeight = panelManager.header.size[1];

        //side panels not added yet

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

    public void drawCenter(Graphics g, int[] location, int[] size) {}
}