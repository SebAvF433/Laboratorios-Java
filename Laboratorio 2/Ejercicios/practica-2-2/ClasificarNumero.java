import java.util.Scanner;
public class ClasificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();

        if( num > 0 ){
            System.out.println("El numero ("+num+") es positivo.");
        } else if(num < 0){
            System.out.println("El numero ("+num+") es negativo.");
        } else{
            System.out.println("El numero es cero");
        }
        
        scanner.close();
    }
}
