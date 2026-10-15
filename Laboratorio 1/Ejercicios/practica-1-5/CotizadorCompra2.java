import java.util.Scanner;
public class CotizadorCompra2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio por unidad del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de unidades que desea comprar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el porcentaje de descuento: ");
        int descuento = scanner.nextInt();

        System.out.print("Ingrese el porcentaje de impuesto: ");
        int impuesto = scanner.nextInt();

    /* ---------------------------------------------------- */
        String nombre_vendedor = "NexCore Technologies";
        double costoEnvio = 15000.0;
        int codigoCotizacion = 749;
    /* ---------------------------------------------------- */

    // 1. Hay que calcular el subtotal de toda la compra
        double subtotal = precio * cantidad;

    // 2. Se calcula y aplica el descuento al subtotal
        double calculoDescuento = descuento / 100.0; 
        double valorDescuento = subtotal * calculoDescuento;

    // 3. Del calculo anterior obtenemos la Base Gravable
        double base = subtotal - valorDescuento;

    // 4. Después se calcula el impuesto
        double calculoImpuesto = impuesto / 100.0;
        double valorImpuesto = subtotal * calculoImpuesto;

    // 5. Por último agregamos el impuesto a la Base Gravable para obtener el total, más el costo de envío
        double total = base + valorImpuesto + costoEnvio;

/* -------------------------------------------------------- */
        System.out.println("================================");
        System.out.println("         Cotizador Java         ");
        System.out.println("================================");
        System.out.println(" Vendedor: " + nombre_vendedor);
        System.out.println("  N° de Cotización: " + codigoCotizacion);
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("        Resumen de Compra       ");
        System.out.println("================================");
        System.out.println("  Cliente: " + nombre);
        System.out.println("  Producto: " + producto);
        System.out.println("  Precio unitario: $" + precio);
        System.out.println("  Cantidad: " + cantidad);
        System.out.println("  Subtotal: $" + subtotal);
        System.out.println("  Descuento: $" + valorDescuento + " (" + descuento + "%)");
        System.out.println("  Base Gravable: $" + base);
        System.out.println("  Impuesto: $" + valorImpuesto + " (" + impuesto + "%)");
        System.out.println("================================");
        System.out.println("  Costo de Envío: $" + costoEnvio);
        System.out.println("================================");
        System.out.println("    Total: $" + total);
        System.out.println("================================");

    scanner.close();
    }
}

// calculoDescuento: Al no incluír el .0, el cálculo del descuento no se realizará correctamente

/* int cantidad = scanner.nextInt(); : Al cambiar a .nextDouble, no se ejecutará.
    Aunque ambos sean datos numéricos, no operan de la misma forma.
*/ 