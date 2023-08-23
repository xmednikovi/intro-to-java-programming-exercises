package chapter07;

public class Exercise07 {

    public static int getRandomNumber(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }

    public static void initializeArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = getRandomNumber(0, 10);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[200];
        initializeArray(numbers);

        int[] count = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            count[number] ++;
        }

        for (int i = 0; i < count.length; i ++) {
            System.out.println(i + " occurs " + count[i] + " times");
        }
    }
}
