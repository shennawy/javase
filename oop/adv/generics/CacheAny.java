package javase.oop.adv.generics;

public class CacheAny<T> {

    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
}
