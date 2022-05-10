package graphicsEngineOld.engine;

import graphicsEngineOld.engine.data.windowParameters.WindowParameters;
import graphicsEngineOld.parts.pages.DebugLayer;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

import org.jetbrains.annotations.NotNull;

/**
 * Graphics class.
 */
public class GraphicsClass extends JPanel {

    public JFrame window;
    public GraphicsClass graphics;

    /**
     * Initializes the instance of graphics class.
     */
    public void initialize() {
        WindowParameters windowParameters = GraphicsManager.data.windowParameters;
        window = new JFrame(windowParameters.windowTitle);
        window.setDefaultCloseOperation(WindowParameters.DEFAULT_CLOSE_ACTION);

        graphics = new GraphicsClass();

        window.getContentPane().add(graphics);
        window.setResizable(true);
        window.setSize(
                windowParameters.windowSize[0],
                windowParameters.windowSize[1]);
        window.setLocation(
                windowParameters.windowLocation[0],
                windowParameters.windowLocation[1]);

        window.setVisible(true);
        windowParameters.setDrawableSize();
    }

    /**
     * Initiates drawing of a single frame.
     */
    public void main() {
        window.repaint();
    }

    /**
     * Overrides paintComponent method of JComponent for drawing.
     * Gets the active page and draws it.
     *
     * @param g Graphics to use.
     */
    @Override
    protected void paintComponent(@NotNull Graphics g) {
        GraphicsManager.pages.draw(g);
        if (GraphicsManager.data.debugLayer) {
            DebugLayer.draw(g);
        }
    }
}