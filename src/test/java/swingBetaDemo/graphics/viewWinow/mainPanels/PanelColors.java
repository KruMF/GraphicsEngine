package swingBetaDemo.graphics.viewWinow.mainPanels;

import java.awt.*;

//TODO: add javadocs
public class PanelColors {
    public Color background, text, border;

    //default colors
    public PanelColors() {
        this(
                Color.lightGray,
                Color.darkGray,
                Color.darkGray);
    }

    //custom colors
    public PanelColors(Color background, Color text, Color border) {
        this.background = background;
        this.text = text;
        this.border = border;
    }
}