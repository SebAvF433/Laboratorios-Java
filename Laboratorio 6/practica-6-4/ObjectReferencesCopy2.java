public class ObjectReferencesCopy2{

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
        Pet missing = null;

        System.out.println("First and alias: " + (first == alias));
        System.out.println("First and independent: " + (first == independent));

        alias.rename("Sol");
        alias.rename("Max");

        System.out.println("First name: " + first.getName());
        System.out.println("First name: " + alias.getName());
        System.out.println("Independent name: " + independent.getName());
        System.out.println("Third name: " + third.getName());
        System.out.println(missing.getName());
    }
}

//Predice el tipo de error
// NullPointerException

// ¿Por qué compiló un programa que falló durante la ejecución?
/*
    Porque el compilador comprueba la sintaxis del código,
    más no hace una verificación de que todas las referencias no sean de tipo null.
    Por eso falla, porque intenta llamar una variable sin valor alguno como si fuera un objeto real.
*/