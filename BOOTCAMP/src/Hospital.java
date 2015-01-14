import java.util.Vector;
public class Hospital extends Construccion {
	Vector <EdificioSimple> edificios;
	String complejidad;
	Integer cantPersonal;
	public Hospital(){
		
	}
	public Integer getCantAmbiente(){
		Integer aux=0;
		for(int i=0;i< edificios.size();i++){
			aux=edificios.elementAt(i).getCantAmbiente();
		}
		return aux;
	}
	public  double getMrsCuadrados(){
		double aux=0;
		for(int i=0;i< edificios.size();i++){
			aux=edificios.elementAt(i).getMrsCuadrados();
		}
	return aux;
	}
	public  Integer cantAberturas(){
		Integer aux=0;
		for(int i=0;i< edificios.size();i++){
			aux=edificios.elementAt(i).cantAberturas();
		}
		return aux;
	}


}
