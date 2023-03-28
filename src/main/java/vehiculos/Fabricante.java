package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricante = new ArrayList();
	private int cantidad = 0;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	//nombre attribute
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//pais attribute
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void actualizarContador(){
		++cantidad;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int cantidadMaxima = 0;
		Fabricante FabricanteMasVendedor = null;
	    for(int i = 0; i < fabricante.size(); i++){
	        if (fabricante.get(i).getCantidad() > cantidadMaxima){
	        	cantidadMaxima = fabricante.get(i).getCantidad();
	        	FabricanteMasVendedor = fabricante.get(i);
	        }      
	    }
        return FabricanteMasVendedor;
	}
	
	@Override
	public String toString() {
		return "Fabricante [nombre=" + nombre + ", pais=" + pais + "]";
	}
}
