package chapter10;

public class MyInteger {

    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value / 2; divisor ++) {
            if (value % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isEven(){
        return isEven(this.value);
    }

    public boolean isOdd(){
        return isOdd(this.value);
    }

    public boolean isPrime(){
        return isPrime(this.value);
    }

    public static int parseInt (String str){
        return Integer.parseInt(str);
    }

    public static int parseInt (char[] arr){
        String str = String.valueOf(arr);
        return parseInt(str);
    }

    public boolean equals (int number){
        return this.value == number;
    }

    public boolean equals (Integer number){
        return this.value == number;
    }
}
