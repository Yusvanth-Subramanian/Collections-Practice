package IterableInterface.exWithInterableInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{

    private ArrayList<T> items= new ArrayList<>();

    private int count;

    public void add(T t){
        items.add(t);
    }

    public T get(int index){
        return items.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }
    private class ListIterator<T> implements Iterator<T>{

        private GenericList<T> list;
        private int count ;
        public ListIterator(GenericList<T> list){
            this.list=list;
        }

        @Override
        public boolean hasNext() {
            return count<list.items.size();
        }

        @Override
        public T next() {
            return list.items.get(count++);
        }
    }
}
