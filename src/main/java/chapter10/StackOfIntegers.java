package chapter10;

public class StackOfIntegers {

    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }

    public void push(int value){
        if (this.size >= this.elements.length) {
            int[] temp = new int[this.elements.length * 2];
            System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
            this.elements = temp;
        }
        this.elements[this.size++] = value;
    }

    public int pop() {
        return this.elements[--this.size];
    }

    public int peek(){
        return this.elements[this.size - 1];
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int getSize() {
        return size;
    }
}
