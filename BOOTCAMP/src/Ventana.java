
public class Ventana extends Abertura{

	double alturaDelPiso;
	
	public Ventana (Integer t, String m, double a, double al,double an){
		super.tama�o=t;
		super.material=m;
		this.alturaDelPiso=a;
		super.abierta=false;
		super.alto=al;
		super.ancho=an;
	}
	public double getAlturaMaxima(){
		return this.alturaDelPiso+super.alto;
	}

}
