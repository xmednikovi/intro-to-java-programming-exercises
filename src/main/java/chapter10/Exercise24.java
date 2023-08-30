package chapter10;

public class Exercise24 {

    public static void main(String[] args) {
        System.out.println("Character 1");
        MyCharacter c1 = new MyCharacter('a');
        System.out.println(c1.toUppercase());
        System.out.println(c1.isDigit());
        System.out.println(c1.isLowercase());

        System.out.println("Character 2");
        MyCharacter c2 = new MyCharacter('A');
        System.out.println(c2.toLowercase());
        System.out.println(c2.isLetter());
        System.out.println(c2.isUppercase());

        System.out.println("Character 3");
        MyCharacter c3 = new MyCharacter(' ');
        System.out.println(c3.isWhitespace());
    }
}
