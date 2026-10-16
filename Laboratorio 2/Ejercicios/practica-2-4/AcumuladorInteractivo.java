import java.util.Scanner;

public class AcumuladorInteractivo {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para añadir a la sumatoria (Ingrese cero para terminar)");
        int num = scanner.nextInt();
        int sumatoria = 0;

        while(num != 0){
            sumatoria += num;
            System.out.println("Valor: " + num);
            System.out.println("Acumulado: " + sumatoria);

            num = scanner.nextInt();
        }
        System.out.println("Sumatoria final: " + sumatoria);
        scanner.close();
    }
}