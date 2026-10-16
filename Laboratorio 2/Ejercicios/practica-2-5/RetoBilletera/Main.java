package RetoBilletera;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        double saldo = 0;

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        do{
            BilleteraConsola.mostrarMenu();
            opcion = scanner.nextInt();
            System.out.println("========================");

            switch(opcion){
                case 1:
                    saldo = BilleteraConsola.registrarIngreso(scanner, saldo);
                    break;

                case 2:
                    saldo = BilleteraConsola.registrarGasto(scanner, saldo);
                    break;

                case 3:
                    System.out.println("Saldo Actual: $" + BilleteraConsola.consultarSaldo(saldo));
                    break;

                case 4:
                    System.out.println("Nombre de Cliente: " + nombre);
                    saldo = BilleteraConsola.mostrarSaldo(saldo);
                    break;
                
                case 0: 
                    System.out.println("Programa finalizado.");

                default: 
                    System.out.println("Opción no válida.");
            }

        } while(opcion != 0);
        scanner.close();
    }
}
