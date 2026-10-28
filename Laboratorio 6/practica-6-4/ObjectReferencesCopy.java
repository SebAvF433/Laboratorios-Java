public class ObjectReferencesCopy{

    static final class Pet {
        private String name;

        Pet(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        void rename(String newName) {
            name = newName;
        }
    }

    public static void main(String[] args) {
        Pet first = new Pet("Luna");
        Pet alias = first;
        Pet independent = new Pet("Luna");
        Pet third = first;
        alias = new Pet("Nova");

        System.out.println("First and alias: " + (first == alias));
        System.out.println("First and independent: " + (first == independent));

        alias.rename("Sol");
        alias.rename("Max");

        System.out.println("First name: " + first.getName());
        System.out.println("First name: " + alias.getName());
        System.out.println("Independent name: " + independent.getName());
        System.out.println("Third name: " + third.getName());
    }
}

// Antes de reasignación
/*
    first       ----> Objeto A: Pet(name = "Sol")
    alias       ----> Objeto A: Pet(name = "Sol")
    independent ----> Objeto B: Pet(name = "Luna")
*/

// Después de reasignación
/*
    first       ----> Objeto A: Pet(name = "Luna")
    alias       ----> Objeto A: Pet(name = "Max")
    independent ----> Objeto B: Pet(name = "Luna")
    third       ----> Objeto C: Pet(name = "Luna")
*/

// ¿Por qué el nombre de A no se modifica con alias.rename("Max")?
// Porque alias.rename("Max") no referencia al Pet alias sino al nuevo objeto: alias = new Pet("Nova");