package listasPilasColas;

public class BarcoPasaje implements Barco {

	//propiedades
	private int eslora;
	private int numeroCamas = 101;
	
	//constructor
	public BarcoPasaje() {
		System.out.println("se crea un objeto barcopasaje");
	}
	@Override
	public void alarma() {
		System.out.println("!!! alarma del barco pasajero!!!");
	}
	@Override
	public void msgSocorro(String msg) {
		alarma();
		System.out.println("!!!! SOS SOS !!!!"+ msg);

	}

}
