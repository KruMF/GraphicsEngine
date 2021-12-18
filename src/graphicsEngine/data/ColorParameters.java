package graphicsEngine.data;

import java.awt.*;
import java.util.ArrayList;

public class ColorParameters {
    public Color backgroundColor;

    public ArrayList<Palette> palettes;
    public int activePalette;

    public ButtonColors buttonColors;

    protected ColorParameters(boolean load){
        backgroundColor = Color.black;

        palettes = new ArrayList<>(){{
           add(new Palette());
        }};
        activePalette = 0;

        buttonColors = new ButtonColors(
                Color.lightGray, Color.darkGray, Color.green,
                Color.black, Color.yellow,
                Color.black);
    }

    public static class Palette {
        public Color buttonColor, buttonColor_hover, buttonColor_active;
        public Color panelColor_dark, panelColor_light;
        public Color textColor;

        public Palette(){

        }
    }

    public static class ButtonColors {
        public Color bodyColor;
        public Color bodyColor_hovered;
        public Color bodyColor_clicked;

        public Color borderColor;
        public Color borderColor_active;

        public Color textColor;

        public ButtonColors(
                Color body, Color body_hovered, Color body_clicked,
                Color border, Color border_active,
                Color text){
            bodyColor = body;
            bodyColor_hovered = body_hovered;
            bodyColor_clicked = body_clicked;

            borderColor = border;
            borderColor_active = border_active;

            textColor = text;
        }
    }
}