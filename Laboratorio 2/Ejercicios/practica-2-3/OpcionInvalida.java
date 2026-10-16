import java.util.Scanner;
public class OpcionInvalida {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("1. Consultar Saldo");
        System.out.println("2. Retirar Efectivo");
        System.out.println("3. Consignar Dinero");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Seleccionó: Consultar Saldo.");
            case 2 -> System.out.println("Seleccionó: Retirar Efectivo.");
            case 3 -> System.out.println("Seleccionó: Consignar Dinero.");
            default -> System.out.println("Opción no válida.");
        }
    scanner.close();
    }
}

// ¿Qué recibe el usuario si ingresa una opción inválida?
// Termina el programa. Porque al no contemplar una opción diferente se genera una excepción.