package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static int mayor = 0;
	private static int ocurrencia;
	private static Fabricante fabricaMayorVenta;
	private static ArrayList<Fabricante> fabricantes=new ArrayList<>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;	
	}

	public static Fabricante fabricaMayorVentas() {
		for (int i=0;i<fabricantes.size();i++) {
			ocurrencia=0;
			for (int j=0;j<fabricantes.size();j++) {
				if(fabricantes.get(i).getNombre().equals(fabricantes.get(j).getNombre())) {
					ocurrencia=ocurrencia+1;
				}
			}
			if(ocurrencia>=mayor) {
				mayor=ocurrencia;
				fabricaMayorVenta=fabricantes.get(i);
			}
		}
		return fabricaMayorVenta;
	}
	
	public static void agrgarFabricante(Fabricante fabricante) {
		fabricantes.add(fabricante);
		Pais.agregarPais(fabricante.getPais());
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

	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}

	public int getMayor() {
		return mayor;
	}

	public int getOcurrencia() {
		return ocurrencia;
	}

	public Fabricante getFabricaMayorVenta() {
		return fabricaMayorVenta;
	}

	
	

}