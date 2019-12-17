package listasPilasColas;

public class Pesquero implements Barco{
	private int eslora;
	private double potencia;
	private int pescadores;
	String nombre;
	public Pesquero(int tripulacion) {
		pescadores = tripulacion;
		System.out.println("se crea un objeto pesquero");
	}
	@Override
	public void alarma() {
		System.out.println("!!ALARMA PESQUERO "+nombre+"!!!");
	}
	@Override
	public void msgSocorro(String msg) {
		System.out.println("!!!SOS SOS "+msg);
		
	}

}
