package array;

public class LibroCalificaciones {
	
	//nombre del curso
	private String nombreDelCurso;
	
	private int calificaciones [];
	
	//constructor
	public LibroCalificaciones(String nombre,int arregloCalif[]){
		 nombreDelCurso=nombre;//inicializa el nombre del curso
		 calificaciones=arregloCalif; //almacena cal desde parametro
	 }

	public String getNombreDelCurso() {
		return nombreDelCurso;
	}

	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}
	
	public void mensaje() {
		System.out.println("Bienvenido al libro de calificaciones: "
	+getNombreDelCurso());
	}
	//realizar las operaciones de los datos
	
	public void procesarCalificaciones() {
		
		//imprimir el arreglo de las calificaciones
		imprimirCalificaciones();
		//obtener el promedio
		
		System.out.println("el promedio de la clase es: "+obtenerPromedio());
		
		//obnter el minimo y el maximo
		System.out.println("maximo: " + maximo() + " minimo: " + minimo());
		//imprimir el grafico de calificaciones
		
		graficoBarras();
		
		
		
		
		
	}
	
	public void graficoBarras() {
		System.out.println("distribucion de las calificaciones");
		//almacenar datos o la freucnecia de cada rango de las calificaciones
		int frecuencia [] = new int [11];
		
		//para cada calificacion, incremeta la frecuencia apropiada
		for(int calificacion: calificaciones)
			++frecuencia[calificacion/10];
		//para cada frecuenca de calificacino, imprimimos una barra en el grafico
		
		for(int cuenta = 0; cuenta<frecuencia.length; cuenta++) {
			//imprimir etiquetas 00-09 90-99, etc
			if(cuenta== 10)
				System.out.printf("%7d: ", 100);
			else
				System.out.printf("%02d - %02d: ", 
						cuenta * 10, cuenta * 10 +9);
			//barra de asterisco
			for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
				System.out.print("*");
		System.out.println();//una nueva linea
		}
	}
	public int minimo() {
		int cal = calificaciones[0]; //asume la calificaciones es la mas alta
		for(int cal1: calificaciones) {
			if(cal1<cal)
				cal = cal1;
		}
		return cal;
	}
	public int maximo() {
		int cal = calificaciones[0]; //asume la calificaciones es la mas alta
		for(int cal1: calificaciones) {
			if(cal1>cal)
				cal = cal1;
		}
		return cal;
	}
	public double obtenerPromedio() {
		int total = 0;
		for (int calificacion: calificaciones)
			total += calificacion;
		return (double)total / calificaciones.length;
	}
	public void imprimirCalificaciones() {
		System.out.println("las calificaciones son: ");
		
		//imprimir las calificacciones
		for(int i = 0; i <calificaciones.length;i++) {
			System.out.printf("estudiante %2d: %3d\n",
					i+1,calificaciones[i]);
		}
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
