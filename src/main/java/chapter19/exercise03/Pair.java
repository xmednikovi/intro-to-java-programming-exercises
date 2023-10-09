package chapter19.exercise03;

public class Pair <T> {

    private T t1;
    private T t2;

    public Pair (T t1, T t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }
}
