package notify;

import java.util.ArrayList;

public class Notifier implements Subject{
	private static ArrayList<Observer> observers=new ArrayList<Observer>();

	public void attach(Observer o) {
		observers.add(o);
	}

	public void dettach(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (int i=0;i < observers.size();i++){
			observers.get(i).update();
		}
	}

}
