package graphicsEngine.demo.simple.withPages.common;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.CommonFooter;

import graphicsEngine.demo.simple.withPages.common.header.HeaderWithButtons;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public abstract class CommonPage extends HeaderAndFooterPage {

    //TODO: add javadoc
    public CommonPage(@NotNull Palette palette,
                      @NotNull HeaderWithButtons header,
                      @Nullable ArrayList<? extends SimplePart> centralParts,
                      @Nullable AlignmentType centralAlignment){
        super(
                new CommonKeyboardActions(),
                palette,
                header, new CommonFooter(50, palette.panelColors, null),
                centralParts, centralAlignment);
    }
}