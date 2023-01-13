package graphicsEngineDemo.d5_featurePreview.demoPages.page3.data;

//TODO: finish this and add javadoc
public class Data {
    private int
            variable,
            delta;

    //TODO: add javadoc
    protected Data(int value, int delta) {
        variable = value;
        this.delta = delta;
    }

    //TODO: add javadoc
    public int getVariableValue() {
        return variable;
    }

    //TODO: add javadoc
    protected void add() {
        variable += delta;
    }

    //TODO: add javadoc
    protected void subtract() {
        variable -= delta;
    }
}