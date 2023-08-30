package chapter10;

public class Exercise23 {

    public static void main(String[] args) {
        MyString2 str = new MyString2("Yuri Mednikov");

        MyString2 surname = str.substring(4);
        System.out.println(surname);
        MyString2 str2 = new MyString2("hello");
        MyString2 str3 = new MyString2("hello");
        System.out.println(str2.equals(str3));

        MyString2 name = new MyString2("iurii");
        MyString2 upper = name.toUpperCase();
        System.out.println(upper);

        MyString2 t = MyString2.valueOf(true);
        System.out.println(t);
    }
}
