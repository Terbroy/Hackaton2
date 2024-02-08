package test;

import domain.AgendaContactos;
import domain.Contacto;

import java.util.Scanner;

public class AgendaTelefonicaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de contactos que desea ingresar en su agenda");
        int max_contactos = scanner.nextInt();
        AgendaContactos agenda = new AgendaContactos(max_contactos);

        while (true) {
            System.out.println("\n======= Menú =======");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar agenda");
            System.out.println("5. Mostrar espacios libres de agenda");
            System.out.println("6. Mostrar contacto existente");
            System.out.println("7. Mostrar disponibilidad de la agenda");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            String nombreContacto;
            int telefonoContacto;
            if (opcion == 8) break;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto");
                    nombreContacto = scanner.next();
                    System.out.println("Ingrese el telefono del contacto");
                    telefonoContacto = scanner.nextInt();
                    Contacto contacto = new Contacto(nombreContacto, telefonoContacto);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a eliminar");
                    nombreContacto = scanner.next();
                    agenda.eliminarContacto(nombreContacto);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto que desea buscar");
                    nombreContacto = scanner.next();
                    agenda.buscarContacto(nombreContacto);
                    break;
                case 4:
                    agenda.listarContactos();
                    break;
                case 5:
                    agenda.espacioLibres();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del contacto existente");
                    nombreContacto = scanner.next();
                    agenda.existeContacto(nombreContacto);
                    break;
                case 7:
                    agenda.agendaLlena();
                    break;
            }
        }
    }
}
