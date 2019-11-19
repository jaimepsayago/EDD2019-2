package figuras;

public class Buclefor {

	public static void main(String[] args) {
		// bucle aninado for, tabla
		
	/*	for (int i =1; i <=3; i++) {
			System.out.println("i = " + i);
			//anidar un for
			for(int j = 1; j<=2; j++) {
				System.out.println("**j = " + j);
			}
		}*/
		
	/*	for(int i = 1; i<=5;i++){
			for(int j=1;j<=10;j++) {
				System.out.print((i * j )+ " ");
			}
			System.out.println();
		}
*/
		
		//figura cuadrado
		for (int i= 1; i<=6; i++) {
			for (int j = 1; j<=10;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		/*//figura mitad
				for (int i= 1; i<=3; i++) {
					for (int j = 1; j<=3;j++) {
						System.out.(j + " "+ i);
					}
					//System.out.println();
				}*/
		
		//figra mitad triangulo invertido
		for (int line = 1; line <=5; line ++) {
			for(int j=1;j<=(-1*line+5);j++) {
				System.out.print(".");
			}
			System.out.println(line);
		}
	}

}
