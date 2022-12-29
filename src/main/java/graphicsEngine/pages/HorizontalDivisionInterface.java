package graphicsEngine.pages;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.pages.panels.AbstractLeftPanel;
import graphicsEngine.pages.panels.AbstractRightPanel;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public interface HorizontalDivisionInterface {
    //
    @Nullable AbstractLeftPanel getLeftPanel(@Nullable SimpleColorScheme colors,
                                             @Nullable BorderProperties borderProperties);

    //
    @Nullable AbstractRightPanel getRightPanel(@Nullable SimpleColorScheme colors,
                                               @Nullable BorderProperties borderProperties);

    //
    @Nullable DynamicPanel getCentralPanel(@Nullable BorderProperties borderProperties);
}