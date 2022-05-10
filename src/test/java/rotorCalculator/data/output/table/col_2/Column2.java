package rotorCalculator.data.output.table.col_2;

import rotorCalculator.data.output.table.Column;
import rotorCalculator.data.output.table.Section;

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