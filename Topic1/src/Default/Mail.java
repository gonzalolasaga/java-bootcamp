package Default;
import java.util.Observable;
import java.util.Observer;
/**
 * This class uses the "observer" library interface to implement the observer / observable pattern.
 * @author GONZALO L
 *
 */

public class Mail implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(arg1);
		
	}
}
