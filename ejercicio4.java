package ejercicios_t;

public class ejercicio4 {
	
	 int[] arreglo = { 10, 5, 20, 8, 15 };
	 
	 
	 public void encontrar() {
		 
		int maximo =  encontrarMaximo(arreglo);
		
		System.out.println(maximo);

	 }
	 
	 public static int encontrarMaximo(int[] arreglo) {
		 
		 if (arreglo.length == 0) {
	            throw new IllegalArgumentException("El arreglo está vacío");
	        }

	        int maximo = arreglo[0]; 
	
	        for (int i = 1; i < arreglo.length; i++) {
	            if (arreglo[i] > maximo) {
	                maximo = arreglo[i];
	            }
	        }

	        return maximo; 
	    }
	 }


