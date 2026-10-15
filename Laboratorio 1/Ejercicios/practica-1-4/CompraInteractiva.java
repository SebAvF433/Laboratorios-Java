import java.util.Scanner;
public class CompraInteractiva{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        double subtotal = precio * cantidad;

        System.out.println("========================");
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: $" + subtotal);

        scanner.close();
    }
}