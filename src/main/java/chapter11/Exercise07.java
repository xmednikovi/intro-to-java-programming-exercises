package chapter11;

import java.util.ArrayList;
import java.util.Random;

public class Exercise07 {

    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();
        for (Integer i: list){
            int newPosition = random.nextInt(0, list.size());
            if (newPosition != list.indexOf(i)) {
                int oldPosition = list.indexOf(i);
                Integer tmp = list.get(newPosition);
                list.set(newPosition, i);
                list.set(oldPosition, tmp);
            }
        }
    }

    public static void main(String[] args) {
        // create a new array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);

        // shuffle
        shuffle(numbers);

        // display results
        for (Integer i: numbers){
            System.out.print(i + " ");
        }
    }
}
