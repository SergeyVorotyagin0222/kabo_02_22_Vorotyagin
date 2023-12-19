package mirea.pr26;

import java.util.*;

class MyListIterator<T> implements Iterator<T> {
    List<T> list;
    int index;

    MyListIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

public class Task2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        MyListIterator<String> iterator = new MyListIterator<>(list);

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}