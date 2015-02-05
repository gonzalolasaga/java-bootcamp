package audioPlayer;

/**
 * This class is responsible for the behavior of the AudioPlayer when this
 * Played
 * 
 * @author Ideapad
 *
 */
public class PlayStateAP implements StateAP {
	String state = "Play";

	public String getState() {
		return this.state;
	}

	public void listening() {
		// Here the application plays the music
		System.out.println("The AudioPlayer plays music");
	}
}