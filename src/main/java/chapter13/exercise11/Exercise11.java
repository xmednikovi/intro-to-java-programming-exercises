package chapter13.exercise11;

public class Exercise11 {

    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        Octagon copy = (Octagon) octagon.clone();
        System.out.println(octagon.equals(copy));
    }
}
