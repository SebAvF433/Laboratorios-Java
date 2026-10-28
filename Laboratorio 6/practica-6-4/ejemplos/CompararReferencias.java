package ejemplos;

public class CompararReferencias {
    public static void main(String[] args){
        String firstText = new String("Luna");
        String secondText = new String("Luna");

        System.out.println(firstText == secondText);
        System.out.println(firstText.equals(secondText));
    }
}
