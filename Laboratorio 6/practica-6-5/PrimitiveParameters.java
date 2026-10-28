public class PrimitiveParameters {

    static void increase(int value) {
        value = value + 10;
        System.out.println("Inside: " + value);
    }

    public static void main(String[] args) {
        int quantity = 5;
        increase(quantity);
        System.out.println("Outside: " + quantity);
    }
}

// Predice el valor dentro de increase y después de retornar a main.
// El valor dentro de increase es 15, y al retornar a main es 5.
