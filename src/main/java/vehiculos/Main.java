package vehiculos;

public class Main {

	public static void main(String[] args) {
		Pais p1 = new Pais("Japon");
		Pais p2 = new Pais("Korea");
		Pais p3 = new Pais("India");
		Fabricante fa = new Fabricante("renault", p1);
		Fabricante fa2 = new Fabricante("Kia", p2);
		Automovil auto = new Automovil("132", "renault 4", 5000, 100, fa, 4);
		Camion cam = new Camion("455", "truck", 46500, 500, fa, 4);
		Camion cam2 = new Camion("455", "truck", 46500, 500, fa2, 4);
		Camion cam3 = new Camion("455", "truck", 46500, 500, fa2, 4);
		Camion cam4 = new Camion("455", "truck", 46500, 500, fa2, 4);
		Camioneta camio = new Camioneta("455", 2, "Raptor", 20500, 250, fa, true);
		System.out.println(auto);
		System.out.println(camio);
		System.out.println(Pais.paisMasVendedor());
		System.out.println(Fabricante.fabricaMayorVentas());
		System.out.println(Vehiculo.vehiculosPorTipo());
	}

}
