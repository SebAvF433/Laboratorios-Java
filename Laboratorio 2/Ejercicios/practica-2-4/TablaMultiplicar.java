import java.util.Scanner;
public class TablaMultiplicar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tablas de multiplicar");
        System.out.println("Ingrese un número para mostrar su tabla del 1 al 10: ");
        int num1 = scanner.nextInt();

        for(int numero=1; numero <=10; numero++){
            System.out.println(num1 + " x " + numero + " = " + (num1 * numero));
        }
        scanner.close();
    }
}
