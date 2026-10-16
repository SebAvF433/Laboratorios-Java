import java.util.Scanner;
public class ConversorMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversiones");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");

        System.out.println("Seleccione la conversión que desea realizar: ");
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Seleccionó: Conversión de kilómetros a metros");
                System.out.println("Ingrese la distancia en Kilómetros (Km): ");
                double dis_km = scanner.nextDouble();
                double dis_m = dis_km * 1000;

                System.out.println("Distancia en Kilómetros: "+ dis_km + "Km");
                System.out.println("Distancia en Metros: "+ dis_m + "m");
                break;

            case 2:
                System.out.println("Seleccionó: Conversión de metros a centímetros");
                System.out.println("Ingrese la distancia en Metros (m): ");
                double dis_metros = scanner.nextDouble();
                double dis_cm = dis_metros * 100;

                System.out.println("Distancia en Metros: "+ dis_metros + "m");
                System.out.println("Distancia en centímetros: "+ dis_cm + "cm");
                break;

            case 3:
                System.out.println("Seleccionó: Conversión de celsius a fahrenheit");
                System.out.println("Ingrese la temperatura en Celsius (°C): ");
                double temp_celsius = scanner.nextDouble();
                double temp_fahr = (temp_celsius * 1.8) + 32;

                System.out.println("Temperatura en Celsius: "+ temp_celsius + "°C");
                System.out.println("Temperatura en Fahrenheit: "+ temp_fahr + "°F");
                break;

            case 0: 
                break;
        }
        scanner.close();
    }
}