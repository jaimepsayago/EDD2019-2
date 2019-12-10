package array;

public class arrayParametro {

	public static void main(String[] args) {
		// PASSING OF ARRAY TO METHOD
		
		
		int array[] = {3,1,4,7,9};
		
		//enviar el array a un metodo
		sum (array);

		//Array genericos
		
		int arr [] = sum1();
		
		
		//matriz bidimensional
		
		int [][] temperatures = {
				{15,94,45,62,14},
				{14,74,32,65,48},
				{12,78,85,4,56},
				{32,65,41,58,63},
				
		};
		
		//for mejorado
		for (int [] fila: temperatures) {
			for(int z:fila) {
				System.out.print(z+ " ");
			}
		}
		
		
		
		
	}
	public static void sum(int [] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			System.out.println("suma del array es: " + sum);
		}
		
	}
	//devolver valor
	public static int [] sum1() {
		//mas operaciones
		return new int [] {5,3,5,2};
	}
	

}
