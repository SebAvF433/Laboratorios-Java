import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la temperatura en grados Celsius (°C): ");
    double celsius = scanner.nextDouble();
    double fahr = (celsius * 9 / 5) +32;

    System.out.println("Temperatura en °C: " + celsius);
    System.out.println(celsius + "°C equivalen a " + fahr + "°F");

    scanner.close();
}
}
