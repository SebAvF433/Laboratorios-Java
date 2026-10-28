package ejemplos;

public class TestClass {
    static void clearLocalReference(Object value) {
    value = null;
    }

    public static void main(String[] args){
        Object objeto1 = new Object();

        clearLocalReference(objeto1);

        System.out.println(objeto1 == null);
    }
}

/*
    La variable objeto1 no queda en null porque Java pasa una copia de la referencia al método.
    Cuando se ejecuta value = null, solamente se cambia el valor de value,
    no el de la variable original object.
*/