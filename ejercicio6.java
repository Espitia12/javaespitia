package ejercicios_t;

public class ejercicio6 {
	
	public void resultado() {
		
	     int[] arreglo1 = {5, 8, 3, 4, 5};
	     int[] arreglo2 = {2, 2, 9, 4, 165};
	     
	     int[] resultado = sumarArreglos(arreglo1, arreglo2);
	     
	     System.out.print("Resultado de la suma: ");
	        for (int i = 0; i < resultado.length; i++) {
	            System.out.print(resultado[i] + " ");
	        }
	     
	}
	
	public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            System.out.println("deben de tener el mismo tamaño");
        }

        int[] resultado = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        return resultado;
    }

}
