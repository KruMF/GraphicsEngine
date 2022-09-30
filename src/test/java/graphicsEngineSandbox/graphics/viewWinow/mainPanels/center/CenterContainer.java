package graphicsEngineSandbox.graphics.viewWinow.mainPanels.center;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.StaticPanel;

import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CenterContainer extends StaticPanel {
    public CenterContainer(@Nullable SimpleColorScheme colors) {
        super(null, colors, null);
    }

    @Override
    public void addParts() {
        super.addParts();
        setLayout(new BorderLayout(0,0));
        add(new CentralSquare(), BorderLayout.WEST);
        add(
                new JPanel() {
                    {
                        setOpaque(false);
                        //setBackground(centerBackground);
                    }

                    @Override
                    public @NotNull Dimension getPreferredSize() {
                        Dimension parentSize = getParent().getSize();

                        if (parentSize.width >= parentSize.height) {
                            return new Dimension(Integer.MAX_VALUE, 0);
                        } else {
                            return new Dimension(Integer.MAX_VALUE, parentSize.height - parentSize.width);
                        }
                    }
                },
                BorderLayout.SOUTH);
    }
}