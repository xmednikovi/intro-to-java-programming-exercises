package chapter10;

public class Exercise28 {

    public static void main(String[] args) {
        MyStringBuilder2 msb1 = new MyStringBuilder2("iurii mednikov");
        MyStringBuilder2 result1 = msb1.toUpperCase();
        System.out.println(msb1);
        System.out.println(result1);

        MyStringBuilder2 msb2 = new MyStringBuilder2("Lorem ipsum");
        MyStringBuilder2 msb3 = new MyStringBuilder2("something ");
        MyStringBuilder2 result2 = msb2.insert(5, msb3);
        System.out.println(msb2);
        System.out.println(msb3);
        System.out.println(result2);

        MyStringBuilder2 msb4 = new MyStringBuilder2("abcde");
        MyStringBuilder2 result3 = msb4.reverse();
        System.out.println(msb4);
        System.out.println(result3);
    }
}
