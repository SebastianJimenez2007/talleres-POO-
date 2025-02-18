package taller_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Estudiante
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Curso: ");
        String cursoEstudiante = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        // Crear un objeto CuentaBancaria
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        int saldo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Crear un objeto Libro
        System.out.println("\nIngrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);

        // Mostrar los detalles de los objetos
        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(estudiante.toString());
        System.out.println(cuenta.toString());
        System.out.println(libro.toString());

        scanner.close();
    }
}