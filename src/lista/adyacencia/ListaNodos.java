package lista.adyacencia;

public class ListaNodos<E>  {

    protected Nodo<E> pri, ant, ult;

    // En principio, una ListaNodos NO tendria una talla ...
    // PERO se incluye pensando en la futura reutilizacion del Modelo
    protected int talla;

    /** construye una Lista Con PI vacia **/
    public ListaNodos() {
        pri = ult = ant = new Nodo<E>(null);
        talla = 0;
    }

    /** inserta e en una Lista antes del Elemento que ocupa su PI,
      * que permanece inalterado.
      *
      * @param e Elememto a insertar.
      **/
    public void insertar(E e) {
        Nodo<E> nuevo = new Nodo<E>(e);
        talla++;
        nuevo.siguiente = ant.siguiente;
        ant.siguiente = nuevo;
        if (ant == ult) ult = ant.siguiente;
        ant = nuevo;
    }


    /** situa el PI de una Lista en su inicio, sobre su primer
      * elemento si no esta vacia.
      **/
    public void inicio() { if (!esVacia()) ant = pri; }

    /** SII !esFin(): situa sobre el siguiente Elemento el PI
      * de una Lista.
      **/
    public void siguiente() {
       if (!esFin()) ant = ant.siguiente;
    }

    /** situa el PI de una Lista en su fin, detras de su ultimo
      * Elemento si no esta vacia.
     **/
    public void fin() { ant = ult; }

    /** SII !esFin(): obtiene el Elemento que ocupa el PI de
      * una Lista.
      *
      * @return E, el Elemento que ocupa el PI de una Lista.
     */
    public E recuperar() { return ant.siguiente.dato; }

    /** comprueba si el PI de una Lista esta en su fin.
      *
      *  @return true si el PI de una Lista esta en su fin y
      * false en caso contrario
      **/
    public boolean esFin() { return ant == ult; }
    /** comprueba si una Lista Con PI esta vacia
      *
      *  @return true si una Lista Con PI esta vacia y
      * false en caso contrario
      **/
    public boolean esVacia() { return pri == ult; }

   
}