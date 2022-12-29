package graphicsEngine.windows;

import javax.swing.WindowConstants;

//TODO: add javadocs
public class WindowConfig {
    private static final WindowConfig DEFAULT_CONFIG;
    private static final int DEFAULT_CLOSE_OPERATION;

    static {
        DEFAULT_CLOSE_OPERATION = WindowConstants.DISPOSE_ON_CLOSE;//DO_NOTHING_ON_CLOSE;
        DEFAULT_CONFIG = new WindowConfig(
                "A title",
                new int[] {300, 300},   //size
                new int[] {100, 100});  //location
    }

    public int closeOperation;
    private String title;
    private int[] size;
    private int[] location;

    //default values
    public WindowConfig() {
        this(DEFAULT_CONFIG.getTitle(), DEFAULT_CONFIG.getSize(), DEFAULT_CONFIG.getLocation());
    }

    //custom values
    public WindowConfig(String title, int[] size, int[] location) {
        closeOperation = DEFAULT_CLOSE_OPERATION;
        setTitle(title);
        setSize(size);
        setLocation(location);
    }

    //set title
    public void setTitle(String title) {
        this.title = title;
    }

    //set size
    public void setSize(int[] size) {
        this.size = size;
    }

    //set location
    public void setLocation(int[] location) {
        this.location = location;
    }

    //get title
    public String getTitle() {
        return title;
    }

    //get size
    public int[] getSize() {
        return this.size;
    }

    //get location
    public int[] getLocation() {
        return this.location;
    }
}