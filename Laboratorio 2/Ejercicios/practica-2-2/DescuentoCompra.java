import java.util.Scanner;
public class DescuentoCompra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double descuento1 = 0.15;
        double descuento2 = 0.10;
        double descuento3 = 0.05;

        System.out.println("Ingrese su nombre: ");
        String Cliente = scanner.nextLine();
        System.out.println("Ingrese sel valor de su compra: ");
        int Valor_compra = scanner.nextInt();

        if(Valor_compra >= 500000){
            double valorDesc = Valor_compra * descuento1;
            double total = Valor_compra - valorDesc;

            System.out.println("-------------------------------");
            System.out.println("             Total             ");
            System.out.println("-------------------------------");
            System.out.println("Cliente: "+ Cliente);
            System.out.println("Valor de Compra: $" + Valor_compra);
            System.out.println("Porcentaje de Descuento: 15%");
            System.out.println("Valor del Descuento: $"+valorDesc);
            System.out.println("Total a pagar: $" + total);
        } 
        else if(Valor_compra >= 250000){
            double valorDesc = Valor_compra * descuento2;
            double total = Valor_compra - valorDesc;

            System.out.println("-------------------------------");
            System.out.println("             Total             ");
            System.out.println("-------------------------------");
            System.out.println("Cliente: "+ Cliente);
            System.out.println("Valor de Compra: $" + Valor_compra);
            System.out.println("Porcentaje de Descuento: 10%");
            System.out.println("Valor del Descuento: $"+valorDesc);
            System.out.println("Total a pagar: $" + total);
        }
        else if(Valor_compra >= 100000){
            double valorDesc = Valor_compra * descuento3;
            double total = Valor_compra - valorDesc;

            System.out.println("-------------------------------");
            System.out.println("             Total             ");
            System.out.println("-------------------------------");
            System.out.println("Cliente: "+ Cliente);
            System.out.println("Valor de Compra: $" + Valor_compra);
            System.out.println("Porcentaje de Descuento: 5%");
            System.out.println("Valor del Descuento: $"+valorDesc);
            System.out.println("Total a pagar: $" + total);
        }
        else{
            System.out.println("-------------------------------");
            System.out.println("             Total             ");
            System.out.println("-------------------------------");
            System.out.println("Cliente: "+ Cliente);
            System.out.println("Valor de Compra: $" + Valor_compra);
            System.out.println("Porcentaje de Descuento: Sin descuento");
            System.out.println("Valor del Descuento: $0");
            System.out.println("Total a pagar: $" + Valor_compra);
        }
        scanner.close();
    }
}
