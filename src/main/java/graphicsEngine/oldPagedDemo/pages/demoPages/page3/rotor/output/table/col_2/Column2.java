package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.col_2;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Column;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Section;

import java.util.ArrayList;

// TODO: add javadoc
public class Column2 extends Column {
    public Column2() {
        super(prepareSections(), DEFAULT_WIDTH);
    }

    private static ArrayList<? extends Section> prepareSections() {
        return new ArrayList<>() {{
            // add sections here
        }};
    }
}