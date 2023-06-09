package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int CantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		++CantidadCamionetas;
	}
	
	//volco attribute
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCantidadCamionetas() {
		return CantidadCamionetas;
	}

	@Override
	public String toString() {
		return "Camioneta [volco=" + volco + ", placa=" + placa + ", puertas=" + puertas + ", velocidadMaxima="
				+ velocidadMaxima + ", nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + ", traccion="
				+ traccion + ", fabricante=" + fabricante + "]";
	}
	
	
}
