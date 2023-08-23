package chapter05;

public class MultiplicationTable {

    public static void main(String[] args) {
        for (int x=1; x<=9; x++){
            for (int y=1; y<=9;y++) {
                int result = x * y;
                System.out.printf("%d x %d = %d \n", x,y,result);
            }
        }
    }
}
