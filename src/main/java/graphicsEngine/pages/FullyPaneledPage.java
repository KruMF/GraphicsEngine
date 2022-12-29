package graphicsEngine.pages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.pages.panels.PanelLocation;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.pages.panels.AbstractLeftPanel;
import graphicsEngine.pages.panels.AbstractRightPanel;
import graphicsEngine.panels.SimplePanel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

//TODO: add javadocs
public abstract class FullyPaneledPage extends HeaderAndFooterPage implements HorizontalDivisionInterface {
    private @Nullable AbstractLeftPanel leftPanel;
    private @Nullable AbstractRightPanel rightPanel;
    private @Nullable DynamicPanel centralPanel;

    //
    public FullyPaneledPage(@Nullable List<ActionListener> actionListenerList,
                            @Nullable Color backgroundColor) {
        super(actionListenerList, backgroundColor);
    }

    //
    @Override
    public final @NotNull DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                               @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(new SimpleColorScheme(
                ColorUtilities.DEFAULT_COLOR_TRANSPARENT,
                null)) {
            {
                setLayout(new BorderLayout(0, 0));
                setSidePanels(colors, borderProperties);
                addSidePanels(this);
                setCentralPanel(borderProperties);
                addCentralPanel(this);
            }
        };
    }

    private void setSidePanels(@Nullable SimpleColorScheme colors,
                               @Nullable BorderProperties borderProperties) {
        leftPanel = getLeftPanel(colors, borderProperties);
        rightPanel = getRightPanel(colors, borderProperties);
    }

    private void addSidePanels(@NotNull DynamicPanel body) {
        if (leftPanel != null) {
            body.add(leftPanel, BorderLayout.WEST);
        }
        if (rightPanel != null) {
            body.add(rightPanel, BorderLayout.EAST);
        }
    }

    private void setCentralPanel(@Nullable BorderProperties borderProperties) {
        centralPanel = getCentralPanel(borderProperties);
    }

    private void addCentralPanel(@NotNull DynamicPanel body) {
        if (centralPanel != null) {
            body.add(centralPanel, BorderLayout.CENTER);
        }
    }

    //
    @Override
    public final @Nullable SimplePanel getPanelByLocation(@NotNull PanelLocation location) {
        return switch (location) {
            case WEST -> leftPanel;
            case EAST -> rightPanel;
            case CENTER -> centralPanel;
            default -> super.getPanelByLocation(location);
        };
    }
}