package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonContainer;
import graphicsEngine.utilities.input.InputData;

import java.awt.*;

public class PanelManager implements ButtonContainer {
    public AbstractHeader header;
    public AbstractFooter footer;

    public PanelManager(AbstractHeader _header, AbstractFooter _footer) {
        header = _header;
        footer = _footer;

        //gotta add side panels
    }

    public void draw(Graphics g, int[] pageSize) {
        if (footer != null) {
            footer.draw(g, pageSize);
        }
        if (header != null) {
            header.draw(g, pageSize[0]);
        }
    }

    @Override
    public void buttonInteractionCheck(InputData input) {
        if (header != null) {
            header.buttonInteractionCheck(input);
        }
        if (footer != null) {
            footer.buttonInteractionCheck(input);
        }
    }

    @Override
    public void buttonActionCheck() {
        if (header != null) {
            header.buttonActionCheck();
        }
        if (footer != null) {
            footer.buttonActionCheck();
        }
    }
}