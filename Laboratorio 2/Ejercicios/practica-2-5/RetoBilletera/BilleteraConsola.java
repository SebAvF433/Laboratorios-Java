package RetoBilletera;
import java.util.Scanner;
public class BilleteraConsola {



    static void mostrarMenu(){
        System.out.println("========================");
        System.out.println("      Mi Billetera      ");
        System.out.println("========================");
        System.out.println(" 1. Registrar Ingreso");
        System.out.println(" 2. Registrar Gasto");
        System.out.println(" 3. Consultar Saldo");
        System.out.println(" 4. Mostrar Resumen");
        System.out.println(" 0. Salir");
        System.out.println("========================");
        System.out.print(" Opcion: ");
    }

    static double consultarSaldo(double saldo){
        return saldo;
    }

    static double registrarIngreso(Scanner scanner, double saldo){
        System.out.print("Ingrese el monto: $");
        double monto = scanner.nextDouble();

        if(monto <= 0){
            System.out.println("Monto inválido");
        } else{
            saldo += monto;
            System.out.println("Operacion Exitosa");            
            System.out.println("Saldo Actual: $" + saldo);

        }
        return saldo;
    }

    static double registrarGasto(Scanner scanner, double saldo){
        System.out.print("Ingrese el monto del gasto: $");
        double gasto = scanner.nextDouble();

        if(gasto > saldo){
        System.out.println("Fondos Insuficientes");
        } else{
            saldo -= gasto;
            System.out.println("Operacion Exitosa");
            System.out.println("Monto: $" + gasto);            
            System.out.println("Saldo Actual: $" + saldo);
        }
        return saldo;
    }

    static double mostrarSaldo(double saldo){
        System.out.println("Saldo Actual: $" + saldo);
        return saldo;            
    }
}
