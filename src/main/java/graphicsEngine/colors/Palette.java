package graphicsEngine.colors;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Palette {
    private static final AbstractColorScheme NON_NULL_PRIMARY = new SimpleColorScheme();

    private AbstractColorScheme primary;
    private Map<String, AbstractColorScheme> schemes;

    //TODO: add javadoc
    public Palette() {
        this(null);
    }

    //TODO: add javadoc
    public Palette(@Nullable AbstractColorScheme primary) {
        this(primary, null);
    }

    //TODO: add javadoc
    public Palette(@Nullable AbstractColorScheme primary,
                   @Nullable Map<String, AbstractColorScheme> schemes) {
        setPrimary(primary);
        setSchemes(schemes);
    }

    //TODO: add javadoc
    public void setPrimary(@Nullable AbstractColorScheme primary) {
        this.primary = Objects.requireNonNullElse(primary, NON_NULL_PRIMARY);
    }

    //TODO: add javadoc
    public @NotNull AbstractColorScheme getPrimary() {
        return primary;
    }

    //TODO: add javadoc
    public void setSchemes(@Nullable Map<String, AbstractColorScheme> schemes) {
        this.schemes = Objects.requireNonNullElse(schemes, new HashMap<>());
    }

    //TODO: add javadoc
    public @NotNull Map<String, AbstractColorScheme> getSchemes() {
        return schemes;
    }
}