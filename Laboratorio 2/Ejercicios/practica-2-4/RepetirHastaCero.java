import java.util.Scanner;
public class RepetirHastaCero{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número (Ingrese cero para terminar)");
        int num = scanner.nextInt();

        while(num != 0){
            System.out.println("Ha ingresado el número: " + num);
            System.out.println("Ingrese otro número: ");
            num = scanner.nextInt();
        }
        scanner.close();
    }
}