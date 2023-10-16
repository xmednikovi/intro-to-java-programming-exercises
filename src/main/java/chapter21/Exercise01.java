package chapter21;

import java.util.HashSet;
import java.util.Set;

public class Exercise01 {

    public static void main(String[] args) {
        Set<String> subjects1 = new HashSet<>();
        subjects1.add("Chemistry");
        subjects1.add("Mathematics");
        subjects1.add("Biology");
        subjects1.add("English");

        Set<String> subjects2 = new HashSet<>();
        subjects2.add("Biology");
        subjects2.add("English");
        subjects2.add("Geography");
        subjects2.add("Physics");

        // 1. find only subjects in 1st set
        Set<String> set1 = new HashSet<>(subjects1);
        set1.removeAll(subjects2);
        System.out.println("Subjects only in 1st set: ");
        set1.forEach(e -> System.out.print(e + " "));

        // 2. find only subjects in 2nd set
        Set<String> set2 = new HashSet<>(subjects2);
        set2.removeAll(subjects1);
        System.out.println("\nSubjects only in 2nd set: ");
        set2.forEach(e -> System.out.print(e + " "));

        // 3. find subjects in both stacks
        Set<String> set3 = new HashSet<>(subjects1);
        set3.retainAll(subjects2);
        System.out.println("\nSubjects in both sets: ");
        set3.forEach(e -> System.out.print(e + " "));
    }
}
