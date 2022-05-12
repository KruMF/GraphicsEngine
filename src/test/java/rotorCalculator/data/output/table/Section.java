package rotorCalculator.data.output.table;

import rotorCalculator.data.output.Utilities;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class Section {
    public static final String[]
            LINE_SEPARATOR = new String[] {
            "",
            "----------"},
            SECTION_SPACING = new String[] {
                    "",
                    ""};

    public String[] header, data;

    // TODO: add javadoc
    public Section(@Nullable String title, @Nullable String[] data) {
        if (title == null) {
            header = LINE_SEPARATOR;
        } else {
            header = Objects.requireNonNullElse(
                    setHeader(title),
                    sectionTitle(title));
        }
        this.data = Objects.requireNonNullElse(
                data,
                new String[] {""});
    }

    public abstract String[] setHeader(@NotNull String sectionTitle);

    public static String[] sectionTitle(String sectionTitle) {
        return new String[] {
                "----- " + sectionTitle + " -----"
        };
    }

    public static String[] sectionSeparator(String sectionTitle) {
        return Utilities.joinArrays(new ArrayList<>() {{
            add(SECTION_SPACING);
            add(sectionTitle(sectionTitle));
        }});
    }

    // TODO: add javadoc
    public static abstract class FirstSection extends Section {
        public FirstSection(@Nullable String title, @Nullable String[] data) {
            super(title, data);
        }

        // TODO: add javadoc
        @Override
        public String[] setHeader(@NotNull String sectionTitle) {
            return null;
        }
    }

    // TODO: add javadoc
    public static abstract class NextSection extends Section {
        public NextSection(@Nullable String title, @Nullable String[] data) {
            super(title, data);
        }

        // TODO: add javadoc
        @Override
        public String[] setHeader(@NotNull String sectionTitle) {
            return sectionSeparator(sectionTitle);
        }
    }
}