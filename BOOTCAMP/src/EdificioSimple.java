import java.util.Vector;

public class EdificioSimple extends Construccion{
	double mtsCuadrados;
	Integer ambientes;
	String color;
	Vector <Abertura> aberturas;

	public EdificioSimple (double mts,Integer amb, String col){
		this.mtsCuadrados=mts;
		this.ambientes=amb;
		this.color=col;
		this.aberturas=new Vector<Abertura>() ;
	}
	public void agregarAberturas (Abertura ab){
		this.aberturas.addElement(ab);
	}
	public double getMrsCuadrados() {
		return this.mtsCuadrados;
	}

	public Integer getCantAmbiente(){
		return this.ambientes;
	}

	public String getColor(){
		return this.color;
	}
	
	public Integer cantAberturas(){
		return this.aberturas.size();
	}
}

