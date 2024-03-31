package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> Renault=new ArrayList<>();
	private static ArrayList<Fabricante> Chevrolet=new ArrayList<>();
	private static ArrayList<Fabricante> Tesla=new ArrayList<>();
	private static ArrayList<Fabricante> Volvo=new ArrayList<>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		if(nombre.equalsIgnoreCase("Renault")) {
			Renault.add(this);
		}
		else if(nombre.equalsIgnoreCase("Chevrolet")) {
			Chevrolet.add(this);
		}
		else if(nombre.equalsIgnoreCase("Tesla")) {
			Tesla.add(this);
		}
		else {
			Volvo.add(this);
		}
	}

	public static String fabricaMayorVentas() {
		if((Renault.size()>Chevrolet.size())&&(Renault.size()>Tesla.size())&&(Renault.size()>Volvo.size())) {
			return "Renault";
		}
		else if((Chevrolet.size()>Renault.size())&&(Chevrolet.size()>Tesla.size())&&(Chevrolet.size()>Volvo.size())) {
			return "Chevrolet";
		}
		else if((Tesla.size()>Renault.size())&&(Tesla.size()>Chevrolet.size())&&(Tesla.size()>Volvo.size())) {
			return "Tesla";
		}
		else {
			return "Volvo";
		}
	}	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais =pais;
	}
	
	

}