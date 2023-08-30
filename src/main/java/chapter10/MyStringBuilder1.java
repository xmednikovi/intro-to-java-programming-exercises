package chapter10;

public class MyStringBuilder1 {

    private final String str;

    public MyStringBuilder1(String s){
        this.str = s;
    }

    public MyStringBuilder1 append (MyStringBuilder1 sb){
        String s = this.str.concat(sb.str);
        return new MyStringBuilder1(s);
    }

    public MyStringBuilder1 append (int i){
        String s = this.str.concat(Integer.toString(i));
        return new MyStringBuilder1(s);
    }

    public int length (){
        return this.str.length();
    }

    public char charAt(int index){
        return this.str.charAt(index);
    }

    public MyStringBuilder1 toLowerCase(){
        String s = this.str.toLowerCase();
        return new MyStringBuilder1(s);
    }

    public MyStringBuilder1 substring (int begin, int end){
        String s = this.str.substring(begin, end);
        return new MyStringBuilder1(s);
    }

    @Override
    public String toString() {
        return this.str;
    }
}
