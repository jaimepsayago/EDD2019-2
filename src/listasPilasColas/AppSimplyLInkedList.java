package listasPilasColas;

import poo.Ciudadano;

public class AppSimplyLInkedList {

	public static void main(String[] args) {
		SimpleLinkedList<Integer> lista = new SimpleLinkedList<>();
		
		lista.addFirst(5);
		lista.addFirst(15);
		lista.addFirst(25);
		
		System.out.println(lista.last());
		
	Ciudadano c = new Ciudadano("juan", "castro", "0301435012");
	Ciudadano c1 = new Ciudadano("jaime", "garcia", "0501435012");
	Ciudadano c2 = new Ciudadano("luis", "calle", "0801435012");
	
	SimpleLinkedList<Ciudadano> listaC = new SimpleLinkedList<>();
	listaC.addFirst(c);
	listaC.addFirst(c1);
	listaC.addFirst(c2);
	
	System.out.println(listaC.last().identificacion());
	System.out.println(listaC.getElementObject(1).identificacion());
	}

}
