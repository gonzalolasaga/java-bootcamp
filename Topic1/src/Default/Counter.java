package Default;
/**
 * This is a singleton class, its function is to bring the transaction count. 
 * @author GONZALO L
 *
 */
public class Counter {
	private static Counter count;
	private int secuence;

	private Counter() {
		this.secuence=0;
	}
	public static Counter getInstance() {
		if (count == null) {
			count = new Counter();
		}
		return count;
	}

	public int getSecuense() {
		secuence++;
		return this.secuence;
	}
}
