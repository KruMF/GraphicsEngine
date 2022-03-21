package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.Utilities;

import java.util.ArrayList;
import java.util.Objects;

import java.awt.Graphics;

import com.google.inject.internal.Nullable;
import graphicsEngine.utilities.GraphicsHelper;

// TODO: finish this and add javadoc
public class Column {
    public static final int DEFAULT_WIDTH = 400;

    public ArrayList<? extends Section> sections;
    public int width;

    public Column(@Nullable ArrayList<? extends Section> sections, int width) {
        this.sections = Objects.requireNonNullElse(sections, new ArrayList<>());
        this.width = width;
    }

    // draw the whole column
    public void draw(Graphics g, int[] location) {
        GraphicsHelper.drawStrings_VA(
                g, 0, joinSections(), new int[] {
                        location[0],
                        location[1]});
    }

    // join sections for output
    private String[] joinSections() {
        return Utilities.joinArrays(new ArrayList<>() {{
            for (int i = 0; i < sections.size(); i++) {
                add(sections.get(i).totalLines());
            }
        }});
    }
}