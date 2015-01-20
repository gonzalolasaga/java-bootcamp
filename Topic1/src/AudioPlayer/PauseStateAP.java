/**
 * This class is responsible for the behavior of the AudioPlayer when this paused
 */
package AudioPlayer;

public class PauseStateAP implements StateAP {
	String state = "Pause";

	public String getState() {
		return this.state;
	}

	public void listening() {
		// This application puts pause music
		System.out.println("The AudioPlayer is paused");
	}
}