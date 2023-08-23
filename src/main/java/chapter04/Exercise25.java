package chapter04;

public class Exercise25 {

    public static void main(String[] args) {
        String licencePlate = "";
        for (int i = 0; i < 7 ; i++){
            if (i < 3) {
                // letter
                int number = 65 + (int) ( Math.random() * 25);
                char c = (char) number;
                licencePlate += c;
            } else {
                // number
                int number = 48 + (int) ( Math.random() * 9);
                char c = (char) number;
                licencePlate += c;
            }
        }
        System.out.println("The generated vehicle number is: " + licencePlate);
    }
}
