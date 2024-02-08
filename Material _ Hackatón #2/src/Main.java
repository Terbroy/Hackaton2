import domain.Estudiante;
import domain.Universidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ingresar Estudiante");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 2) break;

            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.next();


            System.out.println("Ingrese el apellido del estudiante:");
            String apellido = scanner.next();

            Estudiante estudiante = new Estudiante(nombre, apellido);

            boolean continuar = true;
            while (continuar) {
                System.out.println("Ingrese una nota (o -1 para terminar):");
                double nota = scanner.nextDouble();

                if (nota == -1) {
                    continuar = false;
                } else {
                    estudiante.agregarNota(nota);
                }
            }

            universidad.registrarEstudiante(estudiante);
        }
        universidad.imprimirPromedios();
        scanner.close();

    }
}
