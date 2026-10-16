public class AccesoActividad{
    public static void main(String[] args){
    // Variables
        int edad= 18;
        boolean inscripcion_activa= true;
        boolean doc_presentado= true;

    /* ------------------------------------ */
        boolean Case_1 = edad >= 18;
        boolean Case_2 = inscripcion_activa && doc_presentado;
        boolean Case_3 = edad >= 18 && inscripcion_activa && doc_presentado;

    /* ------------------------------------ */
        System.out.println(Case_1);
        System.out.println(Case_2);
        System.out.println(Case_3);
    }
}
