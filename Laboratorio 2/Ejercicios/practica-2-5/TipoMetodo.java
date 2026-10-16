public class TipoMetodo {

    /* Para mostrar un título se utiliza void porque solo se imprimirá el texto,
    y no será algo reutilizable en el código */
    static void mostrarTitulo(String titulo){
        System.out.println("Titulo: " + titulo);
    }

    /* Para el calculo de un subtotal se utiliza double, ya que será un valor que será reutilizado
    para otras operaciones */
    static double calcularSubtotal(double precio, int cantidad){
        double subtotal = precio * cantidad;
        return subtotal; 
    }

    /* Al igual que el titulo, se utiliza void para mostrar el texto */
    static void mostrarMenu(){
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Efectivo");
        System.out.println("3. Retirar Efectivo");
        System.out.println("0. Salir");
    }

    /* Como en el calculo de subtotal, se utiliza double. */
    static double calcularDescuento(double subtotal, int descuento){
        double porcentajeDescuento = descuento / 100.0;
        double valorDescuento = subtotal * porcentajeDescuento;
        return valorDescuento; 
    }

    /* Como los ejemplos de titulo y menu, se utiliza void para mostrar el texto */
    static void mensajeDespedida(){
        System.out.println("Hasta Luego");
    }

}
