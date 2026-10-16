public class ErrorEdad {
    public static void main(String[] args){
    /* 
    int edad = 15;
    if (edad >= 18);{
        System.out.println("Mayor de edad");    ---> ";" mal colocado
    }
        // El error ocurre por la falta del bloque "else". Ya que al no existir el bloque.
        // La condición, aunque esté mal o bien, mostrará el resultado de la condición verdadera.
    */

    // Corrección
        int edad = 15;
        if (edad >= 18){
            System.out.println("Mayor de edad");
        } else{
            System.out.println( edad + " --> Menor de edad");
        }
    }
}