import java.util.Scanner;
public class EntradaNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Precio: ");
        double precio = scanner.nextDouble();

        System.out.println(edad);
        System.out.println(cantidad);
        System.out.println(precio);

        scanner.close();
    }

}
