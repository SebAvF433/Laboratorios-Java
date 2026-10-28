public class MethodStackCopy{
    public static void main(String[] args){
        int initialValue = 4;
        int result = calculate(initialValue);

        System.out.println("Final result: " + result);
    }

    static int calculate(int value){
        int doubled = doubleValue(value);
        return value + 3;
    }

    static int doubleValue(int number){
        return number * 2;
    }
}

// Localiza el problema con el depurador y explica la diferencia entre el valor calculado y el valor retornado.
/* El error está en calculate, ya que se calcula el doble de initialValue en doubleValue.
   Pero este resultado se guarda en doubled, el cual no es retornado, sino value que equivale a 4.
   Por esa razón retornará 7 en vez de 11
*/