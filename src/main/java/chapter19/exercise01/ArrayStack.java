package chapter19.exercise01;

public class ArrayStack <E>{

    private final int LENGTH = 16;
    private E[] arr = (E[]) new Object[LENGTH];
    private int arrSize;

    public int getSize(){
        return arrSize;
    }

    public E peek() {
        return arr[arrSize - 1];
    }

    public void push (E o){
        // add as last element
        arr[arrSize++] = o;
        if (arrSize == arr.length){
            increaseArray();
        }

    }

    public E pop () {
        // get the last one and remove it
        if (arrSize > 0) {
            return arr[--arrSize];
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        // check if is empty
        return arrSize == 0;
    }

    private void increaseArray(){
        E[] newArr = (E[]) new Object[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        this.arr = newArr;
    }
}
