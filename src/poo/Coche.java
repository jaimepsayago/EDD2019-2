package poo;

public class Coche extends Vehiculo{
	
	public int ruedas = 4;
	
	public int gasolina;
	
	public void tanquear(int litros) {
		gasolina+=litros;
	System.out.println("tanquear desde coche" + gasolina);
	}

}
