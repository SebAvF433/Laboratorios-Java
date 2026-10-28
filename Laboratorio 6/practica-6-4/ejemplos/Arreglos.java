package ejemplos;

public class Arreglos {
    public static void main(String[] args){
        int[] firstNumbers = {2, 4, 6};
        int[] sameArray = firstNumbers;
        int[] otherArray = {2, 4, 6};

        sameArray[0] = 99;

        System.out.println(firstNumbers[0]);
        System.out.println(otherArray[0]);
        System.out.println(firstNumbers == sameArray);
        System.out.println(firstNumbers == otherArray);
    }
}

//Lineas de salida

//firstNumbers = 99
//otherArray = 2
//true
//false

//¿Por qué el cambio mediante sameArray afecta o no a firstNumbers y otherArray?
/*
    El cambio afecta principalmente porque se actualiza el índice de firstNumbers, el cual pasa de 2 a 99.
    En la tercera línea, sin la equivalencia con sameArray, el resultado debería ser "false".
    Y en la cuarta línea, debería ser un resultado "true".
*/