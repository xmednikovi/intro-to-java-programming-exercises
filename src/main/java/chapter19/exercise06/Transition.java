package chapter19.exercise06;

public class Transition <T, E, V>{

    private T element1;
    private E element2;
    private V element3;

    public Transition(T element1, E element2, V element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T getElement1() {
        return element1;
    }

    public E getElement2() {
        return element2;
    }

    public V getElement3() {
        return element3;
    }
}
