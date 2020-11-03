package lista.adyacencia;

public interface ColaPrioridad<E extends Comparable<E>> {

    // metodos Modificadores del estado de una Cola de Prioridad (CP):
    /** atendiendo a su prioridad, inserta el Elemento e
     * en una Cola de Prioridad **/
    void  insertar(E e);
    /** SII !esVacia(): obtiene y elimina el Elemento con
     * maxima prioridad de una CP **/
    E  eliminarMin();

    // metodos Consultores del estado de una Cola de Prioridad (CP):
    /** SII !esVacia(): obtiene el Elemento con maxima prioridad de una CP **/
    E  recuperarMin();
    /** comprueba si una CP esta vacia **/
    boolean esVacia();
}
