public class Ventana extends Abertura {

	double alturaDelPiso;

	public Ventana(int t, String mat, boolean ab, double al, double an) {
		super(t, mat, ab, al, an);
	}

	public double getAlturaMaxima() {
		return alturaDelPiso + alto;
	}
	public void setAlturaDelPiso(int altP){
		this.alturaDelPiso=altP;
	}
}
