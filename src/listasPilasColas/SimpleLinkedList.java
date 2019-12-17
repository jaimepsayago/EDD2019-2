package listasPilasColas;

public class SimpleLinkedList<E> {
	
	//Clase NODO INTERNA DENTRO DE SIMPLE LINKED LIST
	private static class Node<E>{
	private E element;//elemento que se guarda en el nodo
	private Node<E> next;//referencia al siguiente nodo en la lista
	//constructor
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}
	//obnetener y setear el nodo
	public E getElement() {
		return element;
	}
	public void setNext(Node <E>n) {
		next =n;
	}
	public Node<E> getNext(){
		return next;
	}
	
	}
//instancia y metodos de clase single linked list
	//head nodo de la lista
	private Node<E> head = null;
	private Node<E> tail = null;
	//numero de nodos de la lista
	private int size = 0;//edd dinamica!!!!
	//constructor
	public SimpleLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	//metodos 
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	//return first element
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();		
	}
	//return last element
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	//agregar dato al principi
	public void addFirst(E e) {
		head = new Node<>(e, head);//elemnto y nuestro link al nodo
		if(size == 0)
			tail = head;
		size++;
	}
	//agregar datos al final de la lista
	public void addLast(E e) {
		Node <E> newest = new Node<>(e, null);
		if(isEmpty())
			head = newest;
		else
			tail.setNext(newest);
			tail = newest;
		size++;
	}
	//remove
	public E removeFirst () {
		if(isEmpty()) return null;
		
		E e1 = head.getElement();
		head= head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return e1;
	}
	
	//obtener
	
	public E getElementObject(int index) {
		int c = 0;
		Node <E> tmp = head;
		while (c < index) {
			tmp = tmp.getNext();
			c++;
		}
		return tmp.getElement();
	}
	
	
	
	
	
}
