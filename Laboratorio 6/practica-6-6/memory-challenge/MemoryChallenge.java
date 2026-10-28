public class MemoryChallenge {
    private static void update(PetProfile current) {
        current.registerVisit();

        current = new PetProfile("Nova");
        current.registerVisit();

        System.out.println("Inside: " + current.getName()
                + " (" + current.getVisits() + ")");
    }

    private static PetProfile createReplacement(PetProfile previous) {
        return new PetProfile("Max");
    }

    public static void main(String[] args) {
        PetProfile pet = new PetProfile("Luna");
        PetProfile alias = pet;

        update(pet);

        System.out.println("Outside: " + pet.getName()
                + " (" + pet.getVisits() + ")");

        PetProfile replacement = createReplacement(pet);

        System.out.println("Same reference: " + (pet == alias));
        System.out.println("Replacement: " + replacement.getName()
                + " (" + replacement.getVisits() + ")");
    }
}

// ¿Cuántas instrucciones new PetProfile() se ejecutarán en total?
// 3. Una para "Luna", otra para "Nova" y otra para "Max".

// ¿Cuántos objetos diferentes se crearán?
// Se crearán 3 objetos diferentes: Luna, Nova y Max.

// ¿pet y alias apuntan inicialmente al mismo objeto?
// Sí. por el código: alias = pet.

// ¿Qué objeto recibe el primer incremento de visitas?
// El objeto de Luna, porque inicialmente current apunta al mismo objeto que pet y alias.

// ¿Qué objeto recibe el segundo incremento?
// El objeto de Nova, al crear la nueva instancia, current apunta a Nova.

// ¿createReplacement(pet) cambia a qué objeto apunta pet?
/*
    No exactamente, el método crea y devuelve un objeto nuevo llamado "Max",
    que se asigna a la variable replacement. La variable pet continúa apuntando a "Luna".
*/

// ¿Qué cuatro líneas se imprimirán?
/*
    Inside: Nova (1)
    Outside: Luna (1)
    Same reference: true
    Replacement: Max (0)
*/

// Cuando termine update, ¿Existe una referencia utilizable desde main al objeto "Nova"?
/*
    No. Porque la referencia a "Nova" solamente se guarda en el parámetro local current.
    Al terminar update, esa variable deja de estar disponible desde main.
*/

// ¿Qué objetos podrían ser elegibles para GC una vez que se pierdan todas las referencias alcanzables hacia ellos?
/*
    Solo el objeto Nova, después de terminar update,
    porque ya no queda ninguna referencia utilizable hacia él.
*/