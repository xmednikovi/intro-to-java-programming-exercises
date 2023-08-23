package chapter07;

public class Exercise16 {

    public static int linearSearch(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i ++ ){
            if (numbers[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch (int[] numbers, int n) {
        int low = 0;
        int high = numbers.length - 1;
        while (high > low) {
            int mid = (high + low) / 2;
            if (n < numbers[mid]) {
                high = mid - 1;
            } else if (n == numbers[mid]){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int[] createArray() {
        int[] numbers = new int[100_000_000];
        for (int i = 1; i <= 100_000_000; i ++) {
            numbers[i - 1] = i;
        }
        return numbers;
    }

    public static void invokeSearch(int[] numbers, int number){
        long startLinear1 = System.nanoTime();
        int linearResult1 = linearSearch(numbers, number);
        long endLinear1 = System.nanoTime();
        long linear1 = endLinear1 - startLinear1;
        System.out.printf("Took %d milliseconds to find %d with linear search\n", linear1, number);

        long startBinary1 = System.nanoTime();
        int binaryResult1 = binarySearch(numbers, number);
        long endBinary1 = System.nanoTime();
        long binary1 = endBinary1 - startBinary1;
        System.out.printf("Took %d milliseconds to find %d with binary search\n", binary1, number);
    }

    public static void main(String[] args) {
        long startCreateArray = System.nanoTime();
        int[] numbers = createArray();
        long endCreateArray = System.nanoTime();
        long createArrayTime = endCreateArray - startCreateArray;
        System.out.println("Took "  +createArrayTime + " milliseconds to create array\n");

        invokeSearch(numbers, 25_000_000);
        invokeSearch(numbers, 50_000_000);
        invokeSearch(numbers, 75_000_000);
        invokeSearch(numbers, 100_000_000);

    }
}
