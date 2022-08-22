package graphicsEngineDemo.featurePreview;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;

import graphicsEngineDemo.featurePreview.demoPages.Page1;
import graphicsEngineDemo.featurePreview.demoPages.Page2;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import static consoleUtils.ConsoleUtils.printLine;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//TODO: finish this
public class Main {
    public static void main(String[] args) {
        printLine("Feature preview demo currently not available");
        /*new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window()));
        }};*/
    }

    private static class Window /*extends MultiPageWindow*/ {
        protected Window() {
            /*super(config(), preparePages());*/
        }

        /**
         * Hardcoded configuration of a new Window object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Paged demo";
            int[]
                    size = new int[] {500, 500},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        private static List<AbstractPage> preparePages() {
            return new ArrayList<>() {{
                add(new Page1());
                add(new Page2());
            }};
        }

        //@Override
        public @NotNull String getWindowKey() {
            return "window";
        }
    }
}