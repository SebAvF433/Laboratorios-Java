public class ConversionTiempo {
    public static void main(String[] args){
        int total = 460;
        int horas = total / 60;
        int minutos = total % 60;

        System.out.println("Total de minutos: " + total);
        System.out.println("---------------------------------------------------");
        System.out.println("Conversión a horas y minutos:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }
}