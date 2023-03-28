package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
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
	
	public void actualizarContador(){
		if(map.get(nombre) == null){
			map.put(nombre, 1);			
		}
		else {
			int contador = map.get(nombre);
			map.replace(nombre, ++contador);
		}
	}
	
	
	@Override
	public String toString() {
		return "Fabricante [nombre=" + nombre + ", pais=" + pais + "]";
	}

	public static String fabricaMayorVentas() {
		int valorMax = 0;
		String fabricaMayorVentas = null;
		for (Map.Entry<String, Integer> entrada : map.entrySet()) {
			final int valorActual = entrada.getValue();
		    if (valorActual > valorMax) {
		    	valorMax = valorActual;
		    	fabricaMayorVentas	= entrada.getKey(); 	
		    }
        }
		return fabricaMayorVentas;
	}
	
	
}
