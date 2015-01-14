
public class Sistema {

	public static void main(String[] args) {
		Puerta p1 = new Puerta(2,"madera",false,2.5,1.3);
		Puerta p2 = new Puerta(1,"aluminio",false,2.2,1);
		p1.setAbierta(true);
		Ventana v1 = new Ventana (2,"madera",false,1.2,1.5);
		Ventana v2 = new Ventana (1,"aluminio",false,1,1.5);
		v1.setAlturaDelPiso(1);
		EdificioSimple casa1 = new EdificioSimple(50,3,"rojo");
		casa1.agregarAberturas(p1);
		casa1.agregarAberturas(v1);
		casa1.agregarAberturas(v1);
		EdificioSimple casa2 = new EdificioSimple(60,5,"azul");
		casa2.agregarAberturas(p2);
		casa2.agregarAberturas(v2);
		EdificioSimple terapia = new EdificioSimple(40,2,"azul");
		terapia.agregarAberturas(p2);
		terapia.agregarAberturas(v2);
		terapia.agregarAberturas(v2);
		EdificioSimple maternidad = new EdificioSimple(60,4,"rosa");
		maternidad.agregarAberturas(p2);
		maternidad.agregarAberturas(v2);
		EdificioSimple guardia = new EdificioSimple(60,1,"amarilla");
		guardia.agregarAberturas(p1);
		guardia.agregarAberturas(v1);
		guardia.agregarAberturas(p1);
		Hospital comunidad = new Hospital("media",150);
		comunidad.agregarEdificios(maternidad);
		comunidad.agregarEdificios(guardia);
		Hospital municipal = new Hospital("alta",200);
		municipal.agregarEdificios(maternidad);
		municipal.agregarEdificios(guardia);
		municipal.agregarEdificios(terapia);
		
		System.out.println(municipal.cantAberturas());
		System.out.println(municipal.getMrsCuadrados());
		System.out.println(comunidad.getComplejidad());
		System.out.println(comunidad.cantPersonal());
		System.out.println(comunidad.getCantAmbiente());
		
		System.out.println(maternidad.cantAberturas());
		System.out.println(guardia.getCantAmbiente());
		System.out.println(casa1.getColor());
		System.out.println(casa2.getMrsCuadrados());
		
		System.out.println(p1.getAlturaMaxima());
		System.out.println(v1.getAlturaMaxima());
		System.out.println(p1.estaAbierta());
		System.out.println(p2.estaAbierta());
		System.out.println(p1.getTipoMaterial());
		System.out.println(v2.getTipoMaterial());


		
		






	}

}
