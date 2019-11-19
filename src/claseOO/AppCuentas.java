package claseOO;

import java.util.Scanner;

public class AppCuentas {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		//instanciar objetos 3
		
		Cuentas objetoCuenta1 = new Cuentas();
		Cuentas objetoCuenta2 = new Cuentas(50.00);
		Cuentas objetoCuenta3 = new Cuentas(-8.5);
		
		System.out.print("saldo de la objetoCuenta 1:");
		
		System.out.print(objetoCuenta2.getSaldo());
		
		Scanner entrada = new Scanner(System.in);
		double valor = 0;
		System.out.println("ingrese un valor");
		valor = entrada.nextDouble();
		//calcular
		objetoCuenta2.abonar(valor);
		System.out.print(objetoCuenta2.getSaldo());

	}

}
