package Default;
import java.util.Observable;
/**
 * This class uses the "observable" library interface to implement the observer / observable pattern.
 * its function is to establish how the observable notify their observers.
 * @author GONZALO L
 *
 */

public class Notify extends Observable{
	public void notif(String s){
		setChanged();
		notifyObservers(s);
	}
}
