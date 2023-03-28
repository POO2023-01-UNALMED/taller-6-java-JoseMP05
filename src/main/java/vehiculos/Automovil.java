package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int CantidadAutomoviles;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		++CantidadAutomoviles;
	}
	
	//puestos attribute
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getCantidadAutomoviles() {
		return CantidadAutomoviles;
	}

	@Override
	public String toString() {
		return "Automovil [puestos=" + puestos + ", placa=" + placa + ", puertas=" + puertas + ", velocidadMaxima="
				+ velocidadMaxima + ", nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + ", traccion="
				+ traccion + ", fabricante=" + fabricante + "]";
	}
	
}
