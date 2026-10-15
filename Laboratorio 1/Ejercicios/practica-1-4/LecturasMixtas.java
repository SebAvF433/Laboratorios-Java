import java.util.Scanner;
public class LecturasMixtas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}