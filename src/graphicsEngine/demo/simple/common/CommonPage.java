package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.PartContainer;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;
import java.util.Objects;

public abstract class CommonPage extends Page {

    public CommonPage(ArrayList<? extends SimplePart> parts) {
        super(new ArrayList<>());
        addHeaderAndFooter(parts);
    }

    private void addHeaderAndFooter(ArrayList<? extends SimplePart> parts){
        this.parts.add(new PartContainer(
                new int[] {0, CommonHeader.HEIGHT}, new boolean[] {false, true},
                new ArrayList<>() {{
                    add(new CommonHeader());
                    add(new PartContainer(
                            new int[] {0, CommonFooter.HEIGHT}, new boolean[] {false, true},
                            new ArrayList<>() {{
                                add(new CommonFooter());
                                //add more elements here, gotta be contained first
                                addAll(Objects.requireNonNullElse(parts, new ArrayList<>()));
                            }}, AlignmentType.BOTTOM));
                }}, AlignmentType.TOP));
    }
}