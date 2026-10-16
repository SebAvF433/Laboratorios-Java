import java.util.Scanner;
public class CalculadoraMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos números a continuación: ");
        System.out.println("Primer número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        System.out.println("Seleccione la operación matemática que desea realizar: ");
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1: 
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;

            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            
            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
                break;

            case 4:
                if(num2 == 0){
                    System.out.println("No se puede dividir por cero.");
                } else{
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
            break;
        }
        scanner.close();
    }
}