package graphicsEngineDemo.d5_featurePreview.common;

import java.awt.Color;

import org.jetbrains.annotations.NotNull;

import graphicsEngine.colors.SimpleColorScheme;

//TODO: add javadocs
public class CommonColors {
    public static final @NotNull SimpleColorScheme
            HEADER_AND_FOOTER_COLORS = new SimpleColorScheme(
                    new Color(190, 190, 190),//Color.cyan,
                    null),
            SIDE_PANEL_COLORS = new SimpleColorScheme(
                    new Color(150, 150, 150),
                    new Color(0, 0, 0));
}