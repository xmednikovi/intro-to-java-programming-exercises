package chapter19.exercise05;

public class Triplet <T>{

    private T t1;
    private T t2;
    private T t3;

    public Triplet(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }

    public T getT3() {
        return t3;
    }
}
