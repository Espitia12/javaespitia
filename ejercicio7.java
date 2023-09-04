package ejercicios_t;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio7 {
	
	public void resultado() {
		  Map<String, String> diccionario = new HashMap<>();
	        diccionario.put("war", "guerra");
	        diccionario.put("car", "carro");
	        diccionario.put("girl", "niña");
	        diccionario.put("father", "padre");
	        
	        Map<String, String> diccionario1 = new HashMap<>();
	        diccionario1.put("war", "guerra");
	        diccionario1.put("car", "carro");
	        diccionario1.put("girl", "niña");
	        diccionario1.put("father", "padre");

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese una palabra en inglés: ");
	        String palabraIngles = scanner.nextLine().toLowerCase();


	        String traduccion = diccionario1.get(palabraIngles);


	        if (traduccion != null) {
	            System.out.println("La traducción al español es: " + traduccion);
	        } else {
	            System.out.println("La palabra no se encuentra en el diccionario.");
	        }
	    }
	}
	
	


