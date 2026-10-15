public class FacturaSimple {
    public static void main(String[] args){
        String nombre_producto = "Kingston Pendrive 64GB";
        double precio_unitario = 23000.0;
        int cantidad = 3;
        double porcentaje_descuento = 0.05;
        double IVA = 0.19;

        double subtotal = precio_unitario * cantidad;
        double valor_descuento = subtotal * porcentaje_descuento;
        double impuesto = subtotal * IVA;
        double total = (subtotal - valor_descuento) + impuesto;

        System.out.println("================================");
        System.out.println("        Factura de Compra       ");
        System.out.println("================================");
        System.out.println("  Producto: " + nombre_producto);
        System.out.println("  Precio unitario: $" + precio_unitario);
        System.out.println("  Cantidad: " + cantidad);
        System.out.println("  Subtotal: $" + subtotal);
        System.out.println("  Descuento: $" + valor_descuento);
        System.out.println("  Impuesto: $" + impuesto);
        System.out.println("  Total: $" + total);
    }
}
