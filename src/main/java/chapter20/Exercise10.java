package chapter20;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Exercise10 {

    public static void main(String[] args) {
        PriorityQueue<String> textbooks1 = new PriorityQueue<>();
        PriorityQueue<String> textbooks2 = new PriorityQueue<>();

        textbooks1.add("Chemistry");
        textbooks1.add("Mathematics");
        textbooks1.add("Biology");
        textbooks1.add("English");

        textbooks2.add("Biology");
        textbooks2.add("English");
        textbooks2.add("Geography");
        textbooks2.add("Physics");

        // find subjects only in textbooks1
        HashSet<String> set1 = new HashSet<>(textbooks1);
        set1.removeAll(textbooks2);
        System.out.println("Subjects that only in the first priority queue: ");
        set1.forEach(System.out::print);

        // find subjects only in textbooks2
        HashSet<String> set2 = new HashSet<>(textbooks2);
        set2.removeAll(textbooks1);
        System.out.println("\nSubjects that only in the second priority queue: ");
        set2.forEach(System.out::print);

        // find subjects in two stacks
        PriorityQueue<String> queue3 = new PriorityQueue<>();
        queue3.addAll(textbooks1);
        queue3.retainAll(textbooks2);
        System.out.println("\nSubjects that exists in two stacks: ");
        queue3.forEach(System.out::print);


    }
}
