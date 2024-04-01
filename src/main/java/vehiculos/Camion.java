package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	private static ArrayList<Camion> listado=new ArrayList<>();
	private int ejes;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, nombre,precio,peso, fabricante);
		this.traccion="4X2";
		this.puertas=2;
		this.velocidadMaxima=80;
		this.ejes=ejes;
		Camion.listado.add(this);
		Fabricante.agrgarFabricante(fabricante);
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static ArrayList<Camion> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Camion> listado) {
		Camion.listado = listado;
	}
	
}
