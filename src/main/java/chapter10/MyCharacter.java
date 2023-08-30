package chapter10;

public class MyCharacter {

    private char c;

    public MyCharacter(char ch){
        this.c = ch;
    }

    public boolean isLetter(){
        return this.isUppercase() || this.isLowercase();
    }

    public boolean isDigit(){
        return this.c >= 48 && this.c <= 57;
    }

    public boolean isWhitespace(){
        return c == ' ';
    }

    public boolean isUppercase(){
        return this.c >= 65 && this.c <= 90;
    }

    public boolean isLowercase(){
        return this.c >= 97 && this.c <= 122;
    }

    public char toLowercase(){
        String str = String.valueOf(c);
        return str.toLowerCase().charAt(0);
    }

    public char toUppercase(){
        String str = String.valueOf(c);
        return str.toUpperCase().charAt(0);
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}
