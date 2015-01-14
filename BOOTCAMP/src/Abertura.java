public abstract class Abertura {
	int tama�o;
	String material;
	boolean abierta;
	double alto;
	double ancho;

	public Abertura(int t, String mat, boolean ab, double al, double an) {
		this.tama�o = t;
		this.material = mat;
		this.abierta = ab;
		this.alto = al;
		this.ancho = an;
	}

	public abstract double getAlturaMaxima();

	public boolean estaAbierta() {
		return this.abierta;
	}

	public String getTipoMaterial() {
		return this.material;
	}

	public void setAbierta(boolean f) {
		this.abierta = f;
	}

}
