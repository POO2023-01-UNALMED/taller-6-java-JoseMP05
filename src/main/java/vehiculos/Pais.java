package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int cantidad = 0;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	//nombre attribute
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void actualizarContador(){
		++cantidad;
	}
	
	public static Pais paisMasVendedor() {
		int cantidadMaxima = 0;
    	Pais paisMasVendedor = null;
	    for(int i = 0; i < paises.size(); i++){
	        if (paises.get(i).getCantidad() > cantidadMaxima){
	        	cantidadMaxima = paises.get(i).getCantidad();
	        	paisMasVendedor = paises.get(i);
	        }      
	    }
        return paisMasVendedor;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + "]";
	}
}
