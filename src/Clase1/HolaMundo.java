package Clase1; //paquete

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// linea de comando para imprimir
		System.out.println("bienvenido a la programacion");
		
		//formato con printf
		System.out.printf("%s \n %s \n", 
		"bienvenido", "programación java");
		
		//Scanner 
		Scanner input = new Scanner(System.in);
		//mensaje de pedido de dastos
		System.out.println("inserte un texto a continuacion:");
		//toma el dato de la sig linea
		String test = input.nextLine();
		//imprimir dato
		System.out.println(test);
		//cerrar scanner
		input.close();
		
	}
	
	//codota

}
