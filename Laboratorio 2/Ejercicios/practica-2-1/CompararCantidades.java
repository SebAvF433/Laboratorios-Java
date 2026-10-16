public class CompararCantidades {
    public static void main(String[] args){
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean inventario_suficiente = inventario >= cantidadSolicitada;
        boolean cantidad_exacta = cantidadSolicitada == inventario;
        boolean falta_inventario = cantidadSolicitada > inventario;

        System.out.println(inventario_suficiente);
        System.out.println(cantidad_exacta);
        System.out.println(falta_inventario);
    }
}
