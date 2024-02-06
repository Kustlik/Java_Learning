package Zadanie1;

public class Pair<T,J>{
    private T object1;
    private J object2;

    public Pair(T object1, J object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public J getObject2() {
        return object2;
    }

    public void setObject2(J object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Object 1 is: " + object1 + " and object 2 is: " + object2;
    }
}
