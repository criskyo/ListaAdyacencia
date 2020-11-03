package lista.adyacencia;

import java.util.PriorityQueue;

public class PriorityQColaPrioridad<E extends Comparable<E>> extends PriorityQueue<E> implements ColaPrioridad<E>

{

	/** crea una Cola de Prioridad (CP) vacia */
	public PriorityQColaPrioridad() {
		super();
	}

	/**
	 * atendiendo a su prioridad, inserta el Elemento e en una Cola de Prioridad
	 * (CP)
	 * 
	 * @param e Elemento a agnadir a una Cola de Prioridad
	 */
	public void insertar(E e) {
		super.add(e);
	}

	/**
	 * SII !esVacia(): obtiene el Elemento con maxima prioridad de una CP
	 * 
	 * @return E Elemento con maxima prioridad de una CP
	 */
	public E recuperarMin() {
		return super.peek();
	}

	/**
	 * SII !esVacia(): obtiene y elimina el Elemento con maxima prioridad de una CP
	 * 
	 * @return E Elemento con maxima prioridad de una CP
	 */
	public E eliminarMin() {
		return super.poll();
	}

	/**
	 * comprueba si una Cola de Prioridad esta vacia
	 * 
	 * @return true si una CP esta vacia y false en caso contrario
	 */
	public boolean esVacia() {
		return super.isEmpty();
	}
}