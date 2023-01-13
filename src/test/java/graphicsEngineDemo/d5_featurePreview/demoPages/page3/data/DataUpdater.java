package graphicsEngineDemo.d5_featurePreview.demoPages.page3.data;

import ThreadAbstraction.AbstractUpdater;

//TODO: finish this and add javadocs
public class DataUpdater extends AbstractUpdater {
    private static final long REFRESH_DELAY = 50L; // in milliseconds

    //TODO: make private and use getters
    public Data data;
    public boolean subtract = false;

    //TODO: add javadoc
    public DataUpdater() {
        super(REFRESH_DELAY);
        data = new Data(0, 1);
        this.start();
    }

    /**
     * Gets called when thread runs.
     */
    @Override
    public void update() {
        if (subtract) {
            data.subtract();
        } else {
            data.add();
        }
    }

    //TODO: add javadoc
    public int getValue() {
        return data.getVariableValue();
    }
}