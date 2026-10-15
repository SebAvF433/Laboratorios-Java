public class CalculoSalario {
    public static void main(String[] args){
        String nombre_trabajador = "John Doe";
        double horas_trabajadas = 42.0;
        double valor_hora = 8338.0;
        final double Aporte = 0.04;

        double pago_salario = horas_trabajadas * valor_hora;
        double aporte = pago_salario * Aporte;
        System.out.println("================================");
        System.out.println("         Salario Semanal        ");
        System.out.println("================================");

        System.out.println("Nombre del trabajador: " + nombre_trabajador);
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Salario: $" + pago_salario);
        System.out.println("Aporte: $" + aporte);
    }
}