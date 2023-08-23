package chapter07;

public class Exercise13 {

    public static int getRandom (int... numbers){
        int randomIndex = (int) (Math.random() * numbers.length );
        return numbers[randomIndex];
    }

    public static void main(String[] args) {
        int number = getRandom(4, 23, 9, 84, 18453, 89, 2, 32, 99, 12);
        System.out.println(number);
    }
}
