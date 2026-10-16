public class MostrarProducto {

    static void mostrarProducto(String nombre, double precio){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args){
        System.out.println("=====================");
        mostrarProducto("Gears of War: E-DAY", 280000);
        System.out.println("=====================");
        mostrarProducto("Halo: Campaign Evolved", 200000);
        System.out.println("=====================");
        mostrarProducto("Resident Evil: Requiem", 221000);
        System.out.println("=====================");
        mostrarProducto("Marvel's Wolverine", 225000);
        System.out.println("=====================");

    }
    
}
