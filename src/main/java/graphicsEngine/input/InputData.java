package graphicsEngine.input;

/**
 * Input data class for storing user input data.
 */
public class InputData {
	public int[] mouse;         // Mouse coordinates.
	public boolean mouseClick;  // Mouse click state.
	public int[] keys;			// Pressed keyboard keys.

	/**
	 * Prepares blank input data.
	 */
	public InputData() {
		mouse = new int[] {0, 0};
		mouseClick = false;
		keys = new int[] {};
	}
}