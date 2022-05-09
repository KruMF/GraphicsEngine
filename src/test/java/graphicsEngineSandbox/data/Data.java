package graphicsEngineSandbox.data;

//a class for containing data
public class Data {
    public static final int MAX_X = 200;
    private static int x;

    //add more parameters here

    public static void resetValues() {
        resetX();
    }

    public static void resetX() {
        x = 0;
    }

    public static int getX() {
        return x;
    }

    public static void incrementX() {
        x++;
    }
}