package chapter10;

import java.util.Arrays;

public class MyString1{

    private char[] arr;

    public MyString1(char[] chars){
        this.arr = chars;
    }
    public char charAt(int index){
        if (index > arr.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    public int length(){
        return arr.length;
    }
    public MyString1 substring(int begin, int end){
        int length = end - begin;
        char[] newArr = new char[length];
        int newArrIndex = 0;
        for (int i = begin; i < end; i++) {
            newArr[newArrIndex] = arr[i];
            newArrIndex ++;
        }
        return new MyString1(newArr);
    }
    public MyString1 toLowerCase(){
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            newArr[i] = Character.toLowerCase(arr[i]);
        }
        return new MyString1(newArr);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyString1) {
            MyString1 ms = (MyString1) obj;
            return Arrays.equals(this.arr, ((MyString1) obj).arr);
        } else {
            return false;
        }
    }

    public static MyString1 valueOf(int i){
        char c = (char) (i + '0');
        char[] newArr = {c};
        return new MyString1(newArr);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < arr.length; i ++){
            str = str.concat(Character.toString(arr[i]));
        }
        return str;
    }
}
