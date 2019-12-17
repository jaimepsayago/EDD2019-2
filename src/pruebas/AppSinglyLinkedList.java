package pruebas;

import poo.Ciudadano;

public class AppSinglyLinkedList {

	public static void main(String[] args) {
		Ciudadano c = new Ciudadano("emilia", "rojas", "0301435012");
		Ciudadano c1 = new Ciudadano("juan", "carlos", "0301435002");
		SinglyLinkedList<Ciudadano> lista = new SinglyLinkedList<>();
		
		lista.addFirst(c);
		lista.addLast(c1);
		lista.last();

	}
}
