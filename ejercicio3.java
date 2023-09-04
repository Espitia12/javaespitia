package ejercicios_t;

import java.util.Random;


public class ejercicio3 {
	int num =  0;
	
	public int aleatorio() {
		Random random = new Random();
		
		num = random.nextInt(100) + 1;
		
		return num;
		
		
		 
	}

}
 