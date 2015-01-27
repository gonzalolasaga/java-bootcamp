package audioPlayer;

/**
 * This class is responsible for the behavior of the AudioPlayer when this
 * stoped
 * 
 * @author Ideapad
 *
 */
public class StopStateAP implements StateAP {
	String state = "STOP";

	public String getState() {
		return this.state;
	}

	public void listening() {
		// Here the application stops the music
		System.out.println("The AudioPlayer is now Stopped");
	}
}
