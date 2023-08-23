package chapter06;

public class Exercise12 {

    public static void printNumbers (int first, int last, int numberPerLine){

        int currentRow = 0;
        for (int i = first; i <= last; i ++){

            System.out.print(i + " ");
            currentRow ++;
            if (currentRow == numberPerLine) {
                currentRow = 0;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 100, 10);
    }
}
