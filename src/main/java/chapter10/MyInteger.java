package chapter10;

class MyInteger {

    private int value;

    MyInteger(int value){
        this.value = value;
    }

    int getValue() {
        return value;
    }

    static boolean isEven(int value){
        return value % 2 == 0;
    }

    static boolean isOdd(int value){
        return value % 2 != 0;
    }

    static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value / 2; divisor ++) {
            if (value % divisor == 0){
                return false;
            }
        }
        return true;
    }

    boolean isEven(){
        return isEven(this.value);
    }

    boolean isOdd(){
        return isOdd(this.value);
    }

    boolean isPrime(){
        return isPrime(this.value);
    }

    static int parseInt (String str){
        return Integer.parseInt(str);
    }

    static int parseInt (char[] arr){
        String str = String.valueOf(arr);
        return parseInt(str);
    }

    boolean equals (int number){
        return this.value == number;
    }

    boolean equals (Integer number){
        return this.value == number;
    }
}
