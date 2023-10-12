package chapter20;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise06 {

    public static long traverseWithGet (ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();

        for (int i = 0; i < arrayList.size(); i ++) {
            System.out.print(arrayList.get(i) + " ");
        }

        long end = System.currentTimeMillis();
        return end - start;

    }

    public static long traverseWithIterator (ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = arrayList.iterator();
        iterator.forEachRemaining(e -> System.out.print(e + " "));

        long end = System.currentTimeMillis();
        return end - start;

    }

    public static void main(String[] args) {
        // create an arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<=10_000_000; i ++) {
            numbers.add(i);
        }

        // traverse with get()
        long time1 = traverseWithGet(numbers);

        // traverse with iterator
        long time2 = traverseWithIterator(numbers);

        System.out.printf("Time to traverse with get() method %d ms\n", time1);
        System.out.printf("Time to traverse with iterator %d ms\n", time2);
    }
}
