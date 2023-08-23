package chapter05;

public class Exercise15 {

    public static void main(String[] args) {
        char c = 33;
        for (int i =0; i<=93; i ++ ){
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(c + " ");
            c++;
        }
    }
}
