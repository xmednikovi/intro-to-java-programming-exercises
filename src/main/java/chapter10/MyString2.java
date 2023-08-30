package chapter10;

import java.util.Arrays;

public class MyString2 {

    private char[] arr;
    public MyString2(String s){
        this.arr = s.toCharArray();
    }

    public int compare(String s){
        return Arrays.compare(this.arr, s.toCharArray());
    }

    public MyString2 substring(int begin){
        if (begin > arr.length || begin < 0) {
            throw new IndexOutOfBoundsException();
        }
        String s = "";
        for (int i = begin; i < arr.length; i++) {
            s += arr[i];
        }
        return new MyString2(s);
    }

    public MyString2 toUpperCase(){
        char[] tmp = new char[arr.length];
        for (int i = 0; i < arr.length; i++){
            tmp[i] = Character.toUpperCase(arr[i]);
        }
        return new MyString2(new String(tmp));
    }

    public char[] toChars(){
        return this.arr;
    }

    public static MyString2 valueOf (boolean b){
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
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
