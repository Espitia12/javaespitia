package ejercicios_t;

import javax.swing.JOptionPane;

public class ejercicio2 {
	
	int num1;
	
	public void numeroMayor() {
		num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if(num1>10) {
			System.out.println("el numero es mayor que 10");
		}else {
			
			System.out.println("el numero es menor a 10");
		}
	} 

}
