package array;

public class AppCalificaciones {

	public static void main(String[] args) {
		//arreglo 
		
		int arregloCalif[]= {87,68,94,100,83,87,65,84,97,25,64,99};
		
		//instanciar el objeto
		LibroCalificaciones calificaciones
		= new LibroCalificaciones("Estructura 4to TI", arregloCalif);
	
		calificaciones.mensaje();//mostrar mensaje
		calificaciones.procesarCalificaciones();
		

	}

}
