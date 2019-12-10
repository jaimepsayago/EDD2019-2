package figuras;

public class figuraRomboMasCentro{

	public static void main(String[] args) {
        
        int maximo = 5;
        System.out.println("Rombo con el numero "+maximo);
        maximo = (maximo*2)-1;
        for (int fila = 1; fila <= maximo; fila++) {
            if (fila % 2 != 0) {
                for (int columna = maximo; columna >= fila; columna--) {
                    System.out.print(" ");
                }
                for (int colsup = 1; colsup <= fila; colsup++) {
                    if (colsup == 1 || colsup == fila) {
                        System.out.print("* ");
                    } else if (fila == maximo && colsup == ((maximo / 2) + 1)) {
                        System.out.print("+ ");
                    } else if (fila == maximo) {
                        System.out.print("- ");
                    } else if (colsup == ((fila / 2) + 1)) {
                        System.out.print("| ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
        /*for (int fila = 2; fila <= maximo; fila++) {
            if (fila % 2 != 0) {
                for (int columna = 1; columna <= fila; columna++) {
                    System.out.print(" ");
                }
                for (int colinf = maximo; colinf >= fila; colinf--) {
                    if (colinf == maximo || colinf == fila) {
                        System.out.print("* ");
                    } else if (colinf == ((maximo+fila)/2)) {
                        System.out.print("| ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }*/
	}

}
