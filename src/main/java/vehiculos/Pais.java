package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static int mayor = 0;
	private static int ocurrencia;
	private static Pais paisMasVendedor;
	private static ArrayList<Pais> paises=new ArrayList<>();

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		for (int i=0;i<paises.size();i++) {
			ocurrencia=0;
			for (int j=0;j<paises.size();j++) {
				if(paises.get(i).getNombre().equals(paises.get(j).getNombre())) {
					ocurrencia=ocurrencia+1;
				}
			}
			if(ocurrencia>=mayor) {
				mayor=ocurrencia;
				paisMasVendedor=paises.get(i);
			}
		}
		return paisMasVendedor;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getMayor() {
		return mayor;
	}

	public static void setMayor(int mayor) {
		Pais.mayor = mayor;
	}

	public static int getOcurrencia() {
		return ocurrencia;
	}

	public static void setOcurrencia(int ocurrencia) {
		Pais.ocurrencia = ocurrencia;
	}

	public static Pais getPaisMasVendedor() {
		return paisMasVendedor;
	}

	public static void setPaisMasVendedor(Pais paisMasVendedor) {
		Pais.paisMasVendedor = paisMasVendedor;
	}

	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
	
	

}