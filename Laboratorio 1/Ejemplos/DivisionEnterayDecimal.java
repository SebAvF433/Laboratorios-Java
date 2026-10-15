public class DivisionEnterayDecimal {
    public static void main(String[] args){
        int resultadoEntero = 5 / 2;
        double resultadoDecimal = 5.0 / 2;

        System.out.println(resultadoEntero);
        System.out.println(resultadoDecimal);

        System.out.println("--------------------------------------------------");
        double otroResultado = 5.0 / 2.0;
        System.out.println(otroResultado);
        /* No esperaba que tuviera dicho resultado, pensaba que cambiaría al ser de tipo double,
        pero revisando y probando, me di cuenta que aunque la variable sea double, hay que poner los
        numeros con decimales para que la maquina los lea como double.
        */
    }
}
 /* Como mencioné anteriormente, la división y su resultado dependen del tipo de dato:
    Int: Solo muestra numeros enteros SIN decimales, por lo que el resultado se dará en numeros enteros.
    Double: Utiliza decimales, es mejor utilizarla cuando realizamos operaciones que requieran decimales o numeros exactos
 */