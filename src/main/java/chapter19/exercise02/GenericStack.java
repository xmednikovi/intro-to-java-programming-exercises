package chapter19.exercise02;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

    public int getSize(){
        return this.size();
    }

    public E peek() {
        if (getSize() > 0) {
            return this.get(getSize() - 1);
        } else {
            return null;
        }
    }

    public void push (E o){
        this.add(o);
    }

    public E pop () {
        if (getSize() > 0){
            E o = this.get(getSize() - 1);
            this.remove(getSize() - 1);
            return o;
        } else {
            return null;
        }
    }

}
