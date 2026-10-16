public class ErrorComparaciones {
    public static void main(String[] args){

    // Verificación de Errores
    /*
        int edad = 20;
        boolean activo = true;

        boolean mayorEdad = edad = 18; ---> El error está en la comparación. Ya que está declarando una variable en vez de comparar.

        boolean habilitado = edad >= 18 & activo; ---> El error está en la comparación. Falta el doble &&

        System.out.println(mayorEdad);
        System.out.println(habilitado); 
    */
        int edad = 20;
        boolean activo = true;

        boolean mayorEdad = edad >= 18;
        boolean habilitado = edad >= 18 && activo;

        System.out.println(mayorEdad);
        System.out.println(habilitado);

    }
}
