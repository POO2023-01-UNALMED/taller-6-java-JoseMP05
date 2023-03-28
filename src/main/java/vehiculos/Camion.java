package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int CantidadCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso,"4X2", fabricante);
		this.ejes = ejes;
		++CantidadCamiones;
	}

	//ejes attribute
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCantidadCamiones() {
		return CantidadCamiones;
	}

	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + ", placa=" + placa + ", puertas=" + puertas + ", velocidadMaxima="
				+ velocidadMaxima + ", nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + ", traccion="
				+ traccion + ", fabricante=" + fabricante + "]";
	}
	
	
}
