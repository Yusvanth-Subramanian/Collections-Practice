package IterableInterface.exWithOutInterableInterface;

public class GenericList<T> {

    public T[] items= (T[]) new Object[20];

    private int count;

    public void add(T t){
        items[count++]=t;
    }

    public T get(int index){
        return items[index];
    }
}
