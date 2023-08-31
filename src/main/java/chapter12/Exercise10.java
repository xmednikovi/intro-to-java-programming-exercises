package chapter12;

public class Exercise10 {

    public static void main(String[] args) {
        try {
            Fraction fr1 = new Fraction(5, 4);
            Fraction fr2 = new Fraction(1, 0);
        } catch (NullDenominatorException ex){
            System.out.println("Denominator cannot be 0");
        }
    }
}
