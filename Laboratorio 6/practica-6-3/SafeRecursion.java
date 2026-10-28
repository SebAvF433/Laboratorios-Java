public class SafeRecursion{

    static void countDown(int value){
        System.out.println("Entering: " + value);

        if (value == 0) {
            System.out.println("Base case");
            return;
        }

        countDown(value - 1);
        System.out.println("Returning: " + value);
    }

    public static void main(String[] args){
        countDown(2);
    }
}

//Lineas de salida - antes de ejecutar

//Entering: 3
//Entering: 2
//Entering: 1
//Base case
//Returning: 1
//Returning: 2
//Returning: 3

//Lineas de salida - con value= 2
//Entering: 2
//Entering: 1
//Entering: 0
//Base case
//Returning: 1
//Returning: 2
