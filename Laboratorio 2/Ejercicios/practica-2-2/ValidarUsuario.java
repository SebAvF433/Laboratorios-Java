import java.util.Scanner;
public class ValidarUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String claveCorrecta = "java21";

        System.out.println("Ingrese su usuario: ");
        String Usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String Contraseña = scanner.nextLine();

        if(Usuario.equals(usuarioCorrecto) && Contraseña.equals(claveCorrecta)){
            System.out.println("Bienvenido, " + usuarioCorrecto);
        } else{
            System.out.println("Las credenciales son incorrectas. Inténtelo nuevamente.");
        }

        scanner.close();
    }
}
