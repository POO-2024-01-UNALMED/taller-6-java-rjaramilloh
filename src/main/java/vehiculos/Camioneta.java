package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
	private static ArrayList<Camioneta> listado=new ArrayList<>();
	private boolean volco;

	public Camioneta(String placa, int puertas, String nombre, int peso, int precio,Fabricante fabricante, boolean volco) {
		super(placa, puertas, nombre, fabricante, precio, peso);
		this.velocidadMaxima=90;
		this.traccion="4X4";
		this.volco = volco;
		Camioneta.listado.add(this);
		Fabricante.agrgarFabricante(fabricante);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static ArrayList<Camioneta> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Camioneta> listado) {
		Camioneta.listado = listado;
	}
	
	
	

}