/**
 * this class was created under the "State" Pattern and is responsible for supervising the AudioPlayer.
 */
package audioPlayer;

public interface StateAP {

	public String getState();

	public void listening();

}
