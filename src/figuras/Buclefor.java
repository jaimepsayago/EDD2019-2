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
		
		///triagulo completo
	/*int altura = 5;
	for(int i1 = altura, t = 1; i1<= (i1*2)-1;i1--, t+=2) {
		//System.out.println(i1+ "i");
		//System.out.println(t + "t");
		for(int s = 1; s<i1; s++) {
			System.out.print("x");
		}
		for (int j=t;j!=0;j--) {
			System.out.print("#");
		}
		System.out.println();
		
	}*/
	
	//FIGURA COMPLEJA
	for(int line = 1 ; line <=4; line++) {
		System.out.print("|");
		for(int space = 1; space<=(line*-2+8);space++) {
			System.out.print("X");
		}
		System.out.print("<>");
		for (int dot = 1;dot<=(line*4-4);dot++) {
			System.out.print(".");
		}
		System.out.print("<>");
		for(int space=1;space<=(line*-2+8);space++) {
			System.out.printf("X");
		}
	System.out.println("|");
	}
	
	}

}
