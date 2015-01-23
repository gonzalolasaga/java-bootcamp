/**
 * This class is responsible for the music player. Interact with the "State" class.
 */

package AudioPlayer;

public class AudioPlayer {
	StateAP currentState;
	String song;

	public AudioPlayer() {
		StateAP ne = new StopStateAP();
		this.currentState = ne;
	}

	public void setState(StateAP state) {
		this.currentState = state;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void listening() {
		String s = this.currentState.getState();
		System.out.println(s + " :" + this.song);

	}
}
