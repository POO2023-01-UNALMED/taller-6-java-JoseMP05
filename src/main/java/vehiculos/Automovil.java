package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;

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

//	//placa attribute
//	public String getPlaca() {
//		return super.getPlaca();
//	}
//	public void setPlaca(String placa) {
//		super.setPlaca(placa);
//	}
//	
//	//puertas attribute
//	public int getPuertas() {
//		return super.getPuertas();
//	}
//	public void setPuertas(int puertas) {
//		super.setPuertas(puertas);
//	}
//	
//	//velocidadMaxima attribute
//	public int getVelocidadMaxima() {
//		return super.getVelocidadMaxima();
//	}
//	public void setVelocidadMaxima(int velocidadMaxima) {
//		super.setVelocidadMaxima(velocidadMaxima);
//	}
//	
//	//nombre attribute
//	public String getNombre() {
//		return super.getNombre();
//	}
//	public void setNombre(String nombre) {
//		super.setNombre(nombre);
//	}
//	
//	//precio attribute
//	public int getPrecio() {
//		return super.getPrecio();
//	}
//	public void setPrecio(int precio) {
//		super.setPrecio(precio);
//	}
//	
//	//peso attribute
//	public int getPeso() {
//		return super.getPeso();
//	}
//	public void setPeso(int peso) {
//		super.setPeso(peso);
//	}
//	
//	//traccion attribute
//	public String getTraccion() {
//		return super.getTraccion();
//	}
//	public void setTraccion(String traccion) {
//		super.setTraccion(traccion);
//	}
//	
//	//fabricante attribute
//	public Fabricante getFabricante() {
//		return super.getFabricante();
//	}
//	public void setFabricante(Fabricante fabricante) {
//		super.setFabricante(fabricante);
//	}
	
}
