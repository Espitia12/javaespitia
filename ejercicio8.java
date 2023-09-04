package ejercicios_t;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Map<String, Double> registroNotas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar estudiante y asignar nota");
            System.out.println("2. Consultar nota de estudiante");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la nota del estudiante: ");
                    double nota = scanner.nextDouble();
                    registroNotas.put(nombre, nota);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del estudiante para consultar la nota: ");
                    String nombreConsulta = scanner.nextLine();
                    Double notaConsulta = registroNotas.get(nombreConsulta);

                    if (notaConsulta != null) {
                        System.out.println("La nota de " + nombreConsulta + " es: " + notaConsulta);
                    } else {
                        System.out.println("El estudiante no se encuentra en el registro.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}