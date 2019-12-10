package poo;

public class AppHerecia {

	public static void main(String[] args) {

		Humano h = new Humano("emilia", "rojas");
		Ciudadano c = new Ciudadano("emilia", "rojas", "0301435012");
		
		//arreglo de tipo objeto humano
		Humano [] arregloHumano = new Humano[2];
		arregloHumano[0] = h;
		arregloHumano[1] = c;
		
		//leer el polimorfico
		
		polimorfico(arregloHumano);
		

	}
	
	public static void polimorfico(Humano [] arreglo) {
		for(int i =0; i<arreglo.length;i++) {
			System.out.println("identificacion" + arreglo[i].identificacion());
		}
	}
	
	
	
	

}
