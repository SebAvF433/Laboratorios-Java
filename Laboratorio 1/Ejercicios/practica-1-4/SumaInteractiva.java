import java.util.Scanner;
public class SumaInteractiva {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Residuo de División: " + (num1 % num2));

        scanner.close();
    }
}
