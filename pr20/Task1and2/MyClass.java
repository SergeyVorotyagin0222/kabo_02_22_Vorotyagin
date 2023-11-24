package mirea.pr20.Task1and2;

public class MyClass<T, V, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT(){
        return t;
    }
    public V getV(){
        return v;
    }
    public K getK(){
        return k;
    }

    public void print(){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
        System.out.println("K: " + k.getClass().getName());
    }
}
