public class CalculoProducto {
    public static void main(String[] args){
        int unidades = 4;
        double precio = 25000.0;
        double descuento = 0.20;

        double subtotal = unidades * precio; 
        double valorDescuento = subtotal * descuento; 
        double total = subtotal - valorDescuento; 

        System.out.println(total); 
    }
}

// ¿Cuál es el subtotal?
// El subtotal es $100.000

// ¿Cuál es el valor del descuento?
// El descuento es de $20.000

// ¿Qué imprime la última línea?
// Imprimirá el total de la compra, que es de $80.000