package chapter19.exercise06;

public class Association <T,E> {

    private T element1;
    private E element2;

    public Association(T element1, E element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement1() {
        return element1;
    }

    public E getElement2() {
        return element2;
    }
}
