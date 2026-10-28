public class MethodStack{
    public static void main(String[] args){
        int initialValue = 4;
        int result = calculate(initialValue);

        System.out.println("Final result: " + result);
    }

    static int calculate(int value){
        int doubled = doubleValue(value);
        return doubled + 3;
    }

    static int doubleValue(int number){
        return number * 2;
    }
}

// ¿Qué valor tiene number?
// number tiene el mismo valor que initialValue. 4

// ¿Qué otros métodos todavía están esperando el retorno?
// calculate espera a que se ejecute primero doubleValue 

// ¿Cuánto devuelve doubleValue?
// 8. Duplicando el valor de initialValue

// ¿Qué se guardará finalmente en result?
// Se guardará el initialValue después de ser calculado con los métodos doubleValue y calculate

//¿Ya terminó calculate mientras estás detenido dentro de doubleValue? ¿Por qué?
/* No, porque el doubleValue no ha terminado su ejecución ni ha retornado
   el valor por la pausa en la ejecución (breakpoint).
*/