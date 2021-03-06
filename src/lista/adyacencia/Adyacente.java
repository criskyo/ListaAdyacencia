package lista.adyacencia;

public class Adyacente {
    protected int destino;
    protected double peso;

    /** Construye el vertice adyacente a otro de un grafo y el peso
      * de la arista que los une.
      * @param  codigo del vertice adyacente a otro
      * @param  peso de la arista que une este vertice y su adyacente
      */
    public Adyacente(int codAdy, double pesoArista) {
        destino = codAdy;   peso = pesoArista;
    }

    /**Devuelve un String que representa a un vertice adyacente a otro
     * y al peso de la arista que los une.
     * @return  String  que representa a un adyacente
     */
    public String toString() {
        return destino + "(" + (int) peso + ") ";
    }
}
