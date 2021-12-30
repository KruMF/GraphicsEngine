package graphicsEngine.utilities.panels;

import java.awt.*;

public class PanelManager {
    public Header header;
    public Footer footer;

    public PanelManager(
            Color background, Color border,
            int headerHeight, int footerHeight) {
        header = new Header(
                background, border,
                headerHeight,
                10, 50);
        footer = new Footer(
                background, border,
                footerHeight);
    }

    public void draw(Graphics g, int[] pageSize) {
        footer.draw(g, pageSize);
        header.draw(g, pageSize[0]);
    }

    public void buttonInteractionCheck(){
        header.buttonInteractionCheck();
        //footer.buttonInteractionCheck();
    }

    public void buttonActionCheck(){
        header.buttonActionCheck();
        //footer.buttonActionCheck();
    }
}