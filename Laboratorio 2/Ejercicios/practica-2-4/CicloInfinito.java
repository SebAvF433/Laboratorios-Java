public class CicloInfinito {
    public static void main(String[] args){
        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
        }
    }
}

// ¿Qué variable controla el ciclo?
// Numero.

// ¿Esa variable cambia?
// No cambia. Se mantiene igual porque no hay un numero++ que cambie el resultado.

// ¿La condición llegará a ser falsa?
// La condición es verdadera, pero se crea un bucle infinito porque sólo imprimirá el número indefinidamente.