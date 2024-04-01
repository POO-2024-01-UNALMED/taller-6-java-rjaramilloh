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
		fabricantes.add(this);
	}

	public static Fabricante fabricaMayorVentas() {
		for (int i=0;i<fabricantes.size();i++) {
			ocurrencia=0;
			for (int j=0;j<fabricantes.size();j++) {
				if(fabricantes.get(i).equals(fabricantes.get(j))) {
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

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}

	public int getOcurrencia() {
		return ocurrencia;
	}

	public void setOcurrencia(int ocurrencia) {
		this.ocurrencia = ocurrencia;
	}

	public Fabricante getFabricaMayorVenta() {
		return fabricaMayorVenta;
	}

	public void setFabricaMayorVenta(Fabricante fabricaMayorVenta) {
		this.fabricaMayorVenta = fabricaMayorVenta;
	}
	
	

}