package graphicsEngine.pages;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.pages.panels.AbstractFooter;
import graphicsEngine.pages.panels.AbstractHeader;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public interface VerticalDivisionInterface {
    //
    @Nullable AbstractHeader getHeader(@Nullable SimpleColorScheme colors,
                                       @Nullable BorderProperties borderProperties);

    //
    @Nullable AbstractFooter getFooter(@Nullable SimpleColorScheme colors,
                                       @Nullable BorderProperties borderProperties);

    //
    @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                   @Nullable BorderProperties borderProperties);
}