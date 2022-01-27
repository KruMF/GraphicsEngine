package graphicsEngine.demo.simple.common;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.CommonFooter;
import graphicsEngine.presets.panels.CommonHeader;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;

public class CommonPage extends HeaderAndFooterPage {

    public CommonPage(PanelColors panelColors,
               ArrayList<? extends SimplePart> centralParts,
               AlignmentType centralAlignment){
        super(
                new CommonKeyboardActions(),
                panelColors,
                new HeaderWithButtons(100, panelColors),
                new CommonFooter(50, panelColors, null),
                centralParts, centralAlignment);
    }

    static class CommonKeyboardActions extends InputChecker {
        CommonKeyboardActions() {
            super();
        }

        @Override
        public void keyboardActions(String keyText) {
            switch (keyText) {
                case "0" -> GraphicsManager.pages.activePage = 0;
                case "1" -> GraphicsManager.pages.activePage = 1;
                case "2", "3", "4", "5", "6", "7", "8", "9" ->
                        System.out.println("Page " + keyText + " does not exist");
                default ->super.keyboardActions(keyText);
            }
        }
    }
}