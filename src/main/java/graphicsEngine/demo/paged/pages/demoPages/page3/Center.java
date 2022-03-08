package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class Center extends SimplePart {
    private static final int[] TEXT_LOCATION = new int[] {20, 20};

    //TODO: add javadoc
    protected Center() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        g.setColor(Color.green);
        GraphicsHelper.drawStringCentered(g, "This is the demo page 3",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        GraphicsHelper.drawStrings_VA(
                g, 0, outputStringArray(), new int[] {
                        TEXT_LOCATION[0] + this.location[0],
                        TEXT_LOCATION[1] + this.location[1]
                });

        //draw other stuff here
    }

    private static String[] outputStringArray() {
        return new String[] {
                "Standard gravity component: ~" + Math.ceil(Calculator.getRadius_fromStandardGravity()) + " m",
                "Gradient component: ~" + Math.ceil(Calculator.getRadius_fromForceGradient()) + " m",
                "Rotor radius: ~" + Math.ceil(Calculator.getRadius()) + " m",
                "Period: " + Calculator.rotationPeriod() + " s"
        };
    }
}