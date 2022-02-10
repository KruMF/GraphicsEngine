package graphicsEngine.demo.simple.common;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.demo.simple.common.header.HeaderWithButtons;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.CommonFooter;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class CommonPage extends HeaderAndFooterPage {

    //TODO: add javadoc
    public CommonPage(@NotNull Palette palette,
                      @Nullable ArrayList<? extends SimplePart> centralParts,
                      @Nullable AlignmentType centralAlignment){
        super(
                new CommonKeyboardActions(),
                palette,
                new HeaderWithButtons(100, palette.panelColors),
                new CommonFooter(50, palette.panelColors, null),
                centralParts, centralAlignment);
    }

}
