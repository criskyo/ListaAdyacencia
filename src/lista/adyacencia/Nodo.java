package lista.adyacencia;

class Nodo<E> {

    E dato;
    Nodo<E> siguiente;

    /** Crea un Nodo que contiene al Elemento e y al que sigue el Nodo s
      *  @param e Elemento que contiene un Nodo
      *  @param s Nodo siguiente a un Nodo
      */
    Nodo(E e, Nodo<E> s) {
        this.dato = e;
        this.siguiente = s;
    }

    /** Crea un Nodo que contiene al Elemento e y al que no sigue ninguno
     *  @param dato Elemento que contiene un Nodo
     */
    Nodo(E dato) { this(dato, null); }
}
