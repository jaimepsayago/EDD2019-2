package poo;

public class Vehiculo {
	
	public int velocidad;
	public int ruedas;
	
	public void parar() {
		velocidad = 0;
	}
	public void acelerar(int km) {
		velocidad += km;
	System.out.println("acelerar desde vehiculo"+velocidad);
	
	}

}
