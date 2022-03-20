package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0.Column0;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_1.Column1;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_2.Column2;

import java.util.ArrayList;
import java.util.Objects;

import java.awt.Graphics;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class Table {
    public static final int[] DEFAULT_LOCATION = new int[] {300, 50};

    private int[] location;

    public ArrayList<Column> columns;

    public Table(@Nullable int[] location, @NotNull ArrayList<Column> columns) {
        setLocation(location);
        this.columns = columns;
    }

    private void setLocation(@Nullable int[] location) {
        this.location = Objects.requireNonNullElse(location, DEFAULT_LOCATION);
    }

    // draw every column
    public void draw(Graphics g, int[] location) {
        int xOffset = 0;
        for (int i = 0; i < columns.size(); i++) {
            Column column = columns.get(i);

            column.draw(g, new int[] {
                    location[0] + this.location[0] + xOffset,
                    location[1] + this.location[1]});

            xOffset += column.width;
        }
    }

    // TODO: add javadoc
    public static class ParticularTable extends Table {
        public ParticularTable(@Nullable int[] location) {
            super(location, new ArrayList<>() {{
                add(new Column0());
                add(new Column1());
                add(new Column2());
            }});
        }
    }
}