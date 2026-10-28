public class ExecutionFlow{
    public static void main(String[] args){
        int base = 7;
        int bonus = 8;

        int total = add(base, bonus);
        System.out.println("Total: " + total);
    }

    static int add(int first, int second) {
        return first - second;
    }
}

// Compila correctamente e intenta ejecutar java -cp out MissingClass. ¿Qué componente intenta encontrar esa clase?
/* La máquina trata de ejecutar la clase "MissingClass", la cual no existe.
   Por lo que se genera una excepción (ClassNotFoundException)
*/

// Ejecuta java -cp out ExecutionFlow.class. ¿Por qué no se escribe la extensión al indicar una clase compilada?
/* Porque java ya conoce el archivo .class y agregarlo supone un error de sintaxis,
   debido a que en java si ponemos ExecutionFlow.class lo interpreta para ingresar a una subcarpeta class.
   La cual no existe.
*/