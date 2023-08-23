package chapter03;

import java.util.Random;

public class Exercise16 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.ints(-25, 26).findFirst().getAsInt();
        int y = random.ints(-75, 76).findFirst().getAsInt();

        System.out.println("(" + x + ", " + y + ")");
    }
}
