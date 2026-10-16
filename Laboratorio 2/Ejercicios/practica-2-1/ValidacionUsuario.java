public class ValidacionUsuario {
    public static void main(String[] args){
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        System.out.println(usuarioIngresado.equals(usuarioRegistrado));
        System.out.println(usuarioIngresado.equalsIgnoreCase(usuarioRegistrado));
    }
}

// .equals: El método establece que ambas variables coincidan en su totalidad, tal y como esté registrado. Como una comparación con ===.

// .equalsIgnoreCase: El método establece que ambas variables coincidan, incluso si hay diferencias entre mayúsculas y minúsculas.