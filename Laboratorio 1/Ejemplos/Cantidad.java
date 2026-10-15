public class Cantidad {
    public static void main(String[] args) {
        int cantidad = 10;
        System.out.println(cantidad);
        cantidad = 15;
        System.out.println(cantidad);
    }
}

// ¿Qué valor se muestra primero?
// Se mostrará primero la variable con 10, ya que es la variable inicial con ese valor.

//¿Qué valor se muestra después?
// Se mostrará la variable con 15, ya que el segundo System.out.println mostrará la variable que se ha actualizado.

// ¿Cambió el tipo de la variable o solamente su contenido?
// Solo el contenido, aún sigue siendo una variable de tipo int, solo que posee un valor diferente. 