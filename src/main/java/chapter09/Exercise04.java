package chapter09;

import java.util.Random;

public class Exercise04 {

    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i <= 50; i ++){
            int number = random.nextInt(100);
            System.out.println("i = " + i + " , random is "+ number);
        }
    }
}
