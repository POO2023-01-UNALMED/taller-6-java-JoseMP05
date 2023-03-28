package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;
	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	//nombre attribute
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public static String paisMasVendedor() {
		int valorMax = 0;
		String paisMasVendedor = null;
		for (Map.Entry<String, Integer> entrada : map.entrySet()) {
			final int valorActual = entrada.getValue();
		    if (valorActual > valorMax) {
		    	valorMax = valorActual;
		    	paisMasVendedor	= entrada.getKey(); 	
		    }
        }
		return paisMasVendedor;
	}
}
