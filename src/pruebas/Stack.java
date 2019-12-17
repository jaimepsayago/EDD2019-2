package pruebas;

public interface Stack<E> { 
	
	 //* Returns the number of elements in the stack.
	// * @return number of elements in the stack
	
	 int size( );
	
	//19 * Tests whether the stack is empty.
	//20 * @return true if the stack is empty, false otherwise
	//21 */
	 boolean isEmpty( );
	/*
	25 * Inserts an element at the top of the stack.
	26 * @param e the element to be inserted
	27 */
	 void push(E e);
	
	 /**
	31 * Returns, but does not remove, the element at the top of the stack.
	32 * @return top element in the stack (or null if empty)
	33 */
	 E top( );
	
	 /**
	37 * Removes and returns the top element from the stack.
	38 * @return element removed (or null if empty)
	39 */
	 E pop( );
	 }
