public class Operadores {
    public static void main(String[] args){
        int a = 10;
        int b = 3;

        System.out.println(a + b); // La suma de ambos números
        System.out.println(a - b); // La resta de ambos números
        System.out.println(a * b); // La multiplicación de ambos números
        System.out.println(a / b); /* La división dará un valor diferente a lo esperado, 
                                    porque no mostrar decimales al no ser una variable de tipo double. */
        System.out.println(a % b); // Mostrará el residuo de la división
    }
}
