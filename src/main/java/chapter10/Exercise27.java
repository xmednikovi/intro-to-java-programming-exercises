package chapter10;

public class Exercise27 {

    public static void main(String[] args) {
        MyStringBuilder1 msb1 = new MyStringBuilder1("Yuri");
        MyStringBuilder1 msb2 = new MyStringBuilder1(" Mednikov");
        MyStringBuilder1 msb3 = msb1.append(msb2);

        System.out.println(msb1);
        System.out.println(msb2);
        System.out.println(msb3);


    }
}
