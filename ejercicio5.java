package ejercicios_t;
import java.util.ArrayList;

public class ejercicio5 {
	
	public void econtrar() {
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(10);
	    lista.add(5);
	    lista.add(20);
	    lista.add(8);
	    lista.add(15);
	    
	    int maximo = encontrarMaximo(lista);
	    
	    System.out.println("el maxiom es: "+ maximo);

	}
	
	 public static int encontrarMaximo(ArrayList<Integer> lista) {
	        if (lista.isEmpty()) {
	  
	            System.out.println("la lista esta vacia");
	        }

	        int maximo = lista.get(0);


	        for (int i = 1; i < lista.size(); i++) {
	            int elemento = lista.get(i);
	            if (elemento > maximo) {
	                maximo = elemento; 
	            }
	        }

	        return maximo; 
	    }
	
	
}
