public class Acumuladores{
    public static void main(String[] args){
        int suma = 0;

        System.out.println("Numero    | Suma   ");
        for (int numero = 1; numero <= 5; numero++) {
            suma = suma + numero;
            System.out.println(numero + "         | " + suma +"   ");
        }
    }
}