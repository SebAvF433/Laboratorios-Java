public class ArrayReferences {
    static void updateFirst(int[] values) {
        values[0] = 99;
    }

    static void replaceArray(int[] values) {
        values = new int[]{7, 8};
        System.out.println("Inside: " + values[0]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2};

        updateFirst(numbers);
        replaceArray(numbers);

        System.out.println("Outside: " + numbers[0] + ", " + numbers[1]);
    }
}

// ¿updateFirst modifica el objeto arreglo que también utiliza main?
// Sí. porque apuntan al mismo arreglo, values[0] modifica el contenido de numbers.

// ¿replaceArray modifica la variable numbers del llamador?
/*
    No, porque replaceArray toma el parámetro de values y pasa a apuntar a un arreglo nuevo,
    sin cambiar numbers en main.
    La variable numbers sigue apuntando al arreglo original.
*/ 

// ¿Cuántos arreglos hay después de crear el segundo arreglo?
// Dos arreglos. El original de numbers y el que se crea en replaceArray.

// ¿Qué se imprimirá dentro y fuera?
// Inside imprimirá el índice 0 del array values
// Outside imprimira el índice 0 y 1 del array numbers