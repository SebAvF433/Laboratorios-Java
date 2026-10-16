import java.util.Scanner;
public class PromedioNotas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones a promediar:");
        double cantidad = scanner.nextDouble();
        double suma = 0;

        System.out.println("Cantidad de calificaciones: " + cantidad);
        for(int notas = 1; notas <= cantidad; notas++){
            System.out.println("Calificación " + notas + ":");
            double calificaciones = scanner.nextDouble();
            suma += calificaciones;
        }

        double promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}   