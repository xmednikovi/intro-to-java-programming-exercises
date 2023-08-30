package chapter10;

public class StackOfIntegersTest {

    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 0; i < 12; i ++){
            stackOfIntegers.push(i);
        }

        while(!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
