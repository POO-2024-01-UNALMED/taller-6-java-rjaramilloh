package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
	private static ArrayList<Automovil> listado=new ArrayList<>();
	private int puestos;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, nombre,precio,peso, fabricante);
		this.puertas=4;
		this.velocidadMaxima=100;
		this.traccion="FWD";
		this.puestos=puestos;
		Automovil.listado.add(this);
	}
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static ArrayList<Automovil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Automovil> listado) {
		Automovil.listado = listado;
	}
	
	
	

}