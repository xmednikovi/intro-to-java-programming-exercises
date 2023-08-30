package chapter10;

import java.util.Arrays;

public class Exercise25 {

    public static String[] split(String s, String regex) {
        String r = "((?<=" + regex + ")|(?=" + regex + "))";
        return s.split(r);
    }

    public static void main(String[] args) {
        String s1 = "a;b;c;d";
        String[] arr1 = split(s1, ";");
        System.out.println(Arrays.toString(arr1));

        String s2 = "Hello@World@This@Is@A@Java@Program";
        String[] arr2 = split(s2, "@");
        System.out.println(Arrays.toString(arr2));
    }
}
