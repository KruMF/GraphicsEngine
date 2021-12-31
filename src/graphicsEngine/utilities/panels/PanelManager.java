package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonContainer;
import graphicsEngine.utilities.input.InputData;

import java.awt.*;

public class PanelManager implements ButtonContainer {
    public Header header;
    public Footer footer;

    public PanelManager(
            Color background, Color border,
            int headerHeight, int footerHeight) {
        header = new Header(
                headerHeight,
                background, border,
                10, 100);
        footer = new Footer(
                footerHeight,
                background, border);
    }

    public void draw(Graphics g, int[] pageSize) {
        footer.draw(g, pageSize);
        header.draw(g, pageSize[0]);
    }

    @Override
    public void buttonInteractionCheck(InputData input){
        header.buttonInteractionCheck(input);
        //footer.buttonInteractionCheck();
    }

    @Override
    public void buttonActionCheck(){
        header.buttonActionCheck();
        //footer.buttonActionCheck();
    }
}