public class MemoryDemo {
    static final class Pet {
        String name;

        Pet(String name) {
            this.name = name;
        }
    }

    static void change(Pet local) {
        local.name = "Sol"; // Same object, visible to caller.
        local = new Pet("Otra"); // Only the local reference value changes.
        System.out.println("Dentro: " + local.name);
    }

    public static void main(String[] args) {
        Pet original = new Pet("Luna");
        change(original);
        System.out.println("Fuera: " + original.name);
        if (!original.name.equals("Sol")) throw new AssertionError("Paso por valor");
    }
}

// ¿Qué valor recibe el parámetro local al iniciar change(original)?
/*
    Recibe una copia de la referencia que tiene original,
    por lo que ambas variables apuntan al mismo objeto, cuyo nombre inicial es "Luna".
*/

// ¿Qué objeto modifica local.name = "Sol"?
/*
    Modifica el objeto original al que apuntan tanto local como original.
    Por eso, el nombre de la mascota pasa de "Luna" a "Sol".
*/

// ¿Qué significa local = new Pet("Otra")?
/*
    Significa que local empieza a apuntar a un objeto nuevo cuyo nombre es "Otra".
    Esto no cambia la referencia de original, que sigue apuntando al objeto cuyo nombre es "Sol".
*/

// ¿Qué imprimirán las dos líneas de salida?
/*
    Dentro: Otra
    Fuera: Sol
*/

// ¿Se lanzará el AssertionError?
/*
    No. La condición !original.name.equals("Sol") es falsa porque el nombre de original es "Sol".
    Por lo tanto, el AssertionError no se ejecuta.
*/