package lista.adyacencia;

public class Main {

	public static void main(String args[]) {
		Grafo g = new Grafo(6);
		g.insertarArista(0, 4, 1);
		g.insertarArista(0, 5, 2);
		g.insertarArista(0, 1, 5);
		g.insertarArista(1, 2, 4);
		g.insertarArista(2, 5, 1);
		g.insertarArista(2, 3, 9);
		g.insertarArista(3, 5, 3);
		g.insertarArista(3, 4, 7);
		g.insertarArista(4, 5, 8);

		System.out.println("El grafo es: \n" + g.toString());

	}
}
