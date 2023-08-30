package chapter10;

public class Exercise22 {

    public static void main(String[] args) {
        MyString1 hello = new MyString1("hello".toCharArray());
        MyString1 hello2 = new MyString1("hello".toCharArray());
        System.out.println("Strings are equal: " + hello.equals(hello2));
        System.out.println("Length of string is " + hello.length());

        MyString1 name = new MyString1("YURI MEDNIKOV".toCharArray());
        MyString1 resultLowerCase = name.toLowerCase();
        System.out.println(resultLowerCase.toString());

        MyString1 number = MyString1.valueOf(6);
        System.out.println(number);

        MyString1 str = new MyString1("SomeBigString".toCharArray());
        MyString1 substr = str.substring(1, 5);
        System.out.println(substr.toString());
    }
}
