package lista.adyacencia;

public class main {

	
	
	public static void main(String args[]){
		GrafoND g = new GrafoND(6);
		g.insertarArista(0, 4, 1);
		g.insertarArista(0, 5, 2);
		g.insertarArista(0, 1, 5);
		g.insertarArista(1, 2, 4);
		g.insertarArista(2, 5, 1);
		g.insertarArista(2, 3, 9);
		g.insertarArista(3, 5, 3);
		g.insertarArista(3, 4, 7);
		g.insertarArista(4, 5, 8);
		
		
		
		
		System.out.println("El grafo es: \n"+g.toString());
		System.out.println("existeArista(3,1) = " + g.existeArista(3,1));
		ListaConPI<Adyacente> l = g.adyacentesDe(1);
		System.out.println("Los adyacentes al vértice 1 son: ");
			for (l.inicio(); !l.esFin(); l.siguiente()) {
				System.out.println("(1, " + l.recuperar().destino + ")");
			}
	}
}
