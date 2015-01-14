public class Puerta extends Abertura {

	public Puerta(int t, String mat, boolean ab, double al, double an) {
		super(t, mat, ab, al, an);
	}

	public double getAlturaMaxima() {
		return alto;
	}
}
