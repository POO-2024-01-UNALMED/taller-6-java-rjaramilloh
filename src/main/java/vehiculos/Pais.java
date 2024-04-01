package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> Ecuador=new ArrayList<>();
	private static ArrayList<Pais> USA=new ArrayList<>();
	private static ArrayList<Pais> Canada=new ArrayList<>();

	public Pais(String nombre) {
		this.nombre = nombre;
		if (nombre.equalsIgnoreCase("Ecuador")) {
			Ecuador.add(this);
		}
		else if (nombre.equalsIgnoreCase("USA")) {
			USA.add(this);
		}
		else {
			Canada.add(this);
		}
	}
	
	public static Pais paisMasVendedor() {
		if((Ecuador.size()>USA.size())&&(Ecuador.size()>Canada.size())) {
			return Ecuador.get(0);
		}
		else if((USA.size()>Ecuador.size())&&(USA.size()>Canada.size())) {
			return USA.get(0);
		}
		else {
			return Canada.get(0);
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}