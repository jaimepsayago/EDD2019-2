package claseOO;

//dos metodos en un clase cuentas
// y luego voy a probar estos metodos en un objeto
public class Cuentas {
	
	//atributos
	private double saldo;
	
	//constructor
	public Cuentas(double saldoInicial) {
		//validar una dato
		//si no es mayor a cero tiene saldo inicial sino es cero
		if (saldoInicial>0)
			saldo = saldoInicial;
	}
	
	public Cuentas() {
		saldo = 20;
	}
	//metodos getters and setters
	//encapsulacion

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		//metodos propio de la clases
	//sumar monto a la cuenta
	public void abonar(double monto) {
		saldo = saldo + monto;//smar el monto al saldo
	}
	
	
	
	
	
	
	
	

}
