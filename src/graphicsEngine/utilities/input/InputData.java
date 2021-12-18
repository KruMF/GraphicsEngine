package graphicsEngine.utilities.input;

public class InputData {

	public int[] mouse;
	public boolean mouseClick;
	public int[] keys;

	public InputData() {
		mouse = new int[] {0, 0};
		mouseClick = false;
		keys = new int[] {};
	}
}