import java.util.Vector;

public class Hospital implements Construible {
	Vector<EdificioSimple> edificios;
	String complejidad;
	int cantPersonal;

	public Hospital(String complejidad, int cantPersonal) {
		this.complejidad = complejidad;
		this.cantPersonal = cantPersonal;
		this.edificios = new Vector<EdificioSimple>();
	}

	public void agregarEdificios(EdificioSimple edif) {
		this.edificios.addElement(edif);
	}

	public int getCantAmbiente() {
		int aux = 0;
		for (int i = 0; i < edificios.size(); i++) {
			aux += edificios.elementAt(i).getCantAmbiente();
		}
		return aux;
	}

	public double getMrsCuadrados() {
		double aux = 0;
		for (int i = 0; i < edificios.size(); i++) {
			aux += edificios.elementAt(i).getMrsCuadrados();
		}
		return aux;
	}

	public int cantAberturas() {
		int aux = 0;
		for (int i = 0; i < edificios.size(); i++) {
			aux += edificios.elementAt(i).cantAberturas();
		}
		return aux;
	}

	public int cantPersonal() {
		return cantPersonal;
	}

	public String getComplejidad() {
		return complejidad;
	}
}