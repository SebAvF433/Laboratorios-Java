package MenusWhile;
import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;

                case 2:
                    System.out.print("Primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 3:
                    System.out.print("Primer número: ");
                    double x = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    double y = scanner.nextDouble();
                    System.out.println("Resultado: " + (x * y));
                    break;
                case 4:
                    System.out.println("Programa Terminado");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        scanner.close();
    }
}