package chapter19;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise08 {

    public static <E> void shuffle (ArrayList<E> list){
        Collections.shuffle(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            arrayList.add(i);
        }

        // shuffle
        shuffle(arrayList);
        for (Integer x: arrayList){
            System.out.print(x + " ");
        }
    }
}
