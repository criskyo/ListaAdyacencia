package lista.adyacencia;

public class GrafoND extends GrafoDirigido {
	public GrafoND(int numVertices) {
		super(numVertices);
	}

	public void insertarArista(int i, int j, int p) {

		if (!existeArista(i, j) && i != j) {

			elArray[i].insertar(new Adyacente(j, p));

			elArray[j].insertar(new Adyacente(i, p));

		}

		numA++;

	}

}
