package graphicsEngineDemo.d3_twoPageDemo.parts;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.panels.AbstractFooter;

//TODO: finish this and add javadocs
public class CommonFooter extends AbstractFooter {
    private static final int HEIGHT = 100;

    public CommonFooter(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(colors, HEIGHT, borderProperties);
    }
}