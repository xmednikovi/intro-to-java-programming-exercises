package chapter11;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {

    public static Integer max(ArrayList<Integer> list){
        int maxValue = 0;
        for (Integer i: list){
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(55);
        list.add(43);
        list.add(12);

        Integer maxValue = max(list);
        System.out.println("The maximum value is: " + maxValue);
    }
}
