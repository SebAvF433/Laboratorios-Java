import java.util.Scanner;
public class SalarioInteractivo{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre_trabajador = scanner.nextLine();

        System.out.println("Ingrese las horas trabajadas de esta semana: ");
        double horas = scanner.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada: ");
        double valor_hora = scanner.nextDouble();

        double pago_salario = horas * valor_hora;

        System.out.println("================================");
        System.out.println("        Resumen de Pago         ");
        System.out.println("================================");

        System.out.println(" ■ Trabajador: " + nombre_trabajador);
        System.out.println(" ■ Horas trabajadas: " + horas);
        System.out.println(" ■ Valor por hora: $" + valor_hora);
        System.out.println(" ■ Salario: $" + pago_salario);

        scanner.close();
    }
}
