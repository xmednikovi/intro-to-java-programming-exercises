package chapter07;

public class LinearSearch {

    public static int linearSearch(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i ++ ){
            if (numbers[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, -5, -3, 6, 2};
        System.out.println(linearSearch(list, 4));
        System.out.println(linearSearch(list, -4));
        System.out.println(linearSearch(list, -3));

        long milliseconds = System.currentTimeMillis();

//        int seconds = (int) (milliseconds / 1000) % 60;
//        int minutes = (int) (milliseconds / (1000 * 60)) % 60;
//        int hours = (int) ( (milliseconds / (1000 * 60 * 60)) % 24);
//
//        String result = String.format("%2d:%02d:%02d", hours, minutes, seconds);
//        System.out.println(result);
    }
}
