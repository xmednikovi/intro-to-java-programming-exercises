package chapter10;

public class MyStringBuilder2 {

    private final char[] arr;

    public MyStringBuilder2(){
        this.arr = new char[16];
    }

    public MyStringBuilder2(char[] chars){
        this.arr = chars;
    }

    public MyStringBuilder2(String s){
        this.arr = s.toCharArray();
    }

    public MyStringBuilder2 insert (int offset, MyStringBuilder2 s){
        int newLength = arr.length + s.arr.length;
        char[] tmp = new char[newLength];
        System.arraycopy(this.arr, 0, tmp, 0, offset);
        System.arraycopy(s.arr, 0, tmp, offset, s.arr.length);
        return new MyStringBuilder2(tmp);
    }

    public MyStringBuilder2 reverse(){
        char[] tmp = new char[this.arr.length];
        for (int i = tmp.length - 1, y = 0; i >= 0; i--, y++){
            tmp[y] = this.arr[i];
        }
        return new MyStringBuilder2(tmp);
    }

    public MyStringBuilder2 substring(int begin){
        char[] tmp = new char[this.arr.length - begin];
        for (int i = begin; i < this.arr.length; i++){
            tmp[i - begin] = this.arr[i];
        }
        return new MyStringBuilder2(tmp);
    }

    public MyStringBuilder2 toUpperCase(){
        char[] tmp = new char[this.arr.length];
        for (int i = 0; i < this.arr.length; i++){
            tmp[i] = Character.toUpperCase(this.arr[i]);
        }
        return new MyStringBuilder2(tmp);
    }

    @Override
    public String toString() {
        String tmp = "";
        for (int i = 0; i < this.arr.length; i++){
            tmp += this.arr[i];
        }
        return tmp;
    }
}
