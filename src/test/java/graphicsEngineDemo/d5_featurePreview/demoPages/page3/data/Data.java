package graphicsEngineDemo.d5_featurePreview.demoPages.page3.data;

//TODO: finish this and add javadoc
public class Data {
    int myVariable;
    int increment;

    protected Data(int value, int increment) {
        myVariable = value;
        this.increment = increment;
    }

    protected void updateValues() {
        myVariable += increment;
    }
}