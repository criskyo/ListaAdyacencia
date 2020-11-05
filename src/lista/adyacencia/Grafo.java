package lista.adyacencia;

public class Grafo {

	// protected static final int INFINITO = (Integer.MAX_VALUE)/3;
	// Distancia a un vertice aun no alcanzado

	protected static final double INFINITO = Double.POSITIVE_INFINITY;

	protected int numV, numA;
	protected ListaNodos<Adyacente>[] elArray;

	/**
	 * Construye un grafo Dirigido vacio con numVertices.
	 * 
	 * @param numVertices Numero de vertices del grafo vacio
	 */

	public Grafo(int numVertices) {
		numV = numVertices;
		numA = 0;
		elArray = new ListaNodos[numVertices];
		for (int i = 0; i < numV; i++) {
			elArray[i] = new ListaNodos<Adyacente>();
		}
	}

	/**
	 * Comprueba si la arista (i,j) esta en un grafo.
	 * 
	 * @param i Vertice origen
	 * @param j Vertice destino
	 * @return boolean true si (i,j) esta y false en caso contrario
	 */
	public boolean existeArista(int i, int j) {
		ListaNodos<Adyacente> l = elArray[i];
		boolean esta = false;
		for (l.inicio(); !l.esFin() && !esta; l.siguiente()) {
			if (l.recuperar().destino == j) {
				esta = true;
			}
		}
		return esta;
	}

	/**
	 * Si no esta, inserta la arista (i, j) de peso p en un grafo Ponderado (al
	 * principio de la Lista de adyacentes a i).
	 * 
	 * @param i Vertice origen
	 * @param j Vertice destino
	 * @param p Peso de (i, j)
	 */
	public void insertarArista(int i, int j, int p) {

		if (!existeArista(i, j) && i != j) {

			elArray[i].insertar(new Adyacente(j, p));

			elArray[j].insertar(new Adyacente(i, p));

		}

		numA++;

	}

	/**
	 * Devuelve una Lista Con PI que contiene los adyacentes al vertice i.
	 * 
	 * @param i Vertice del que se obtienen los adyacentes
	 * @return ListaConPI con los vertices adyacentes a i
	 */

	public void insertarArista(int i, int j, double p) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		String res = "";
		for (int i = 0; i < numVertices(); i++) {
			res += "Vertice: " + i;
			ListaNodos<Adyacente> l = adyacentesDe(i);
			if (l.esVacia()) {
				res += " sin Adyacentes ";
			} else {
				res += " con Adyacentes ";
			}
			for (l.inicio(); !l.esFin(); l.siguiente()) {
				res += l.recuperar() + " ";
			}
			res += "\n";
		}
		return res;
	}

	/**
	 * Devuelve el numero de vertices de un grafo.
	 * 
	 * @return int Numero de vertices de un grafo
	 */
	public int numVertices() {
		return numV;
	}

	public ListaNodos<Adyacente> adyacentesDe(int i) {
		return elArray[i];
	}

}
