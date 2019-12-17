package listasPilasColas;

public class AppBarco {

	public static void main(String[] args) {
	
		BarcoPasaje bp = new BarcoPasaje();
		bp.alarma();
		bp.msgSocorro("socorrooooooo");
		
		PortaAvion pa = new PortaAvion(13);
		
		pa.alarma();
		pa.msgSocorro("socooro porta");
		
		

	}

}
