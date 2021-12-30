package graphicsEngine.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.input.InputManager;
import graphicsEngine.utilities.panels.PanelManager;
import graphicsEngine.utilities.parts.Background;

import java.awt.*;

public abstract class Page {
    Background background;
    PanelManager panelManager;
    public InputCheck inputCheck;

    public Page() {
        background = new Background(GraphicsManager.data.palette.backgroundColor);

        Color panelColor = Color.gray;
        Color borderColor = Color.darkGray;
        int header = 100, footer = 150;

        panelManager = new PanelManager(
                panelColor, borderColor,
                header,
                footer);
        inputCheck = new InputCheck();
    }

    public void draw(Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        background.draw(
                g,
                new int[]{0, 0},
                pageSize);

        int headerHeight = panelManager.header.size[1];

        //side panels not added yet

        int[] centerSize = new int[]{
                pageSize[0],
                Math.max(
                        0,
                        pageSize[1] - headerHeight - panelManager.footer.size[1])};
        drawCenter(
                g,
                new int[]{0, headerHeight},
                centerSize);

        panelManager.draw(g, pageSize);
    }

    public void drawCenter(Graphics g, int[] location, int[] size) {

    }

    public static class InputCheck{

        InputCheck(){}

        public void check(InputManager input){
            keyboardActions(input);
            buttonCheck(input);
        }

        private void keyboardActions(InputManager input){
            for(int key : input.inputData.keys){
                String keyText = java.awt.event.KeyEvent.getKeyText(key);

                switch (keyText) {
                    case "0" -> GraphicsManager.pages.activePage = 0;
                    case "1" -> GraphicsManager.pages.activePage = 1;
                    case "2", "3", "4", "5", "6", "7", "8", "9" ->
                            System.out.println("Page " + keyText + " does not exist");
                    default ->
                            System.out.println("Key " + keyText + " pressed");
                }
            }
        }

        private void buttonCheck(InputManager input){
            //uz ekrâna redzamo pogu notikumi
        }
    }
}