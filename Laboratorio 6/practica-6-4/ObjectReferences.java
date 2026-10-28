public class ObjectReferences {

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

        System.out.println("First and alias: " + (first == alias));
        System.out.println("First and independent: " + (first == independent));

        alias.rename("Sol");

        System.out.println("First name: " + first.getName());
        System.out.println("Independent name: " + independent.getName());
    }
}

// ¿Cuáles variables están conectadas al mismo objeto?
// first y alias están conectadas, en la linea 21

//¿Qué nombres tendrán los objetos después de alias.rename("Sol")?
/* 
    first y alias tendrán el mismo nombre: Sol.
    Mientras que independent conservará el nombre Luna
*/