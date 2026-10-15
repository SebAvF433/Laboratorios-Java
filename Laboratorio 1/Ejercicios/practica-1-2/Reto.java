public class Reto {
    public static void main(String[] args){
        String nombre_producto = "Gears of War: E-DAY";
        int codigo_producto = 30837;
        double precio = 279000;
        int cantidad_disponible = 200;
        String categoria = "Videojuegos";
        boolean activo = true;

        final double IVA = 0.19;

        System.out.println("╔============================╗");
        System.out.println("║          Producto          ║");
        System.out.println("║============================║");
        System.out.println("  Código: " + codigo_producto);
        System.out.println("  Nombre: " + nombre_producto);
        System.out.println("  Categoría: " + categoria);
        System.out.println("  Precio: $" + precio);
        System.out.println("  Cantidad Disponible: " + cantidad_disponible);
        System.out.println("  Activo: " + activo);
        System.out.println("  Impuesto: " + IVA*100 + "%");
    }
}
