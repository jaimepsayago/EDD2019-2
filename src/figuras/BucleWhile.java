package figuras;

public class BucleWhile {

	public static void main(String[] args) {
		// FOR
		//break; SALE DE BUCLE FOR
		//continue; CONTINUAR CON LA SIGUIENTE ITERACION
		for (int i = 0; i<100; i++) { 
			if (i == 74) break;
			if (i % 9 != 0) continue;
			System.out.println(i);
		}
		
		
		
		

	}

}
