package MenusWhile;
import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
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
                    System.out.println("Programa Terminado");

                default: 
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }
}