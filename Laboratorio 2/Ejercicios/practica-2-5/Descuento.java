public class Descuento {    
    static double calcularDescuento(double subtotal, double porcentaje){
        double descuento = subtotal * porcentaje;
        return descuento;
    }

    public static void main(String[] args){
        double subtotal = 200000;
        
        System.out.println("=====================");
        double descuento = calcularDescuento(subtotal, 0.1);
        System.out.println(descuento);
        System.out.println("=====================");

    }
}
