public class ExecutionFlow{
    public static void main(String[] args){
        int base = 7;
        int bonus = 8;

        int total = add(base, bonus);
        System.out.println("Total: " + total);
    }

    static int add(int first, int second) {
        return first + second;
    }
}

// Predice la salida y explica qué valores recibe add
/* Los valores que recibe add son base y bonus, los cuales pasan a ser llamados como first y second.
   Devuelven la suma de ambos numeros. 
*/ 

// Ejecuta nuevamente java -cp out ExecutionFlow. ¿Qué observas?
// Explica por qué el resultado de la aplicación compilada cambia después de actualizar el .class

/* El resultado (12) se mantiene igual, ya que el .class mantiene 
   los datos que fueron suministrados al ser compilado.
   Y para que estos se actualicen, hay que actualizar el .class
*/ 