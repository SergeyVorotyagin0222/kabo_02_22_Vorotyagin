package mirea.pr20.Task1and2;

public class Main {
    public static void main (String[] args){
        MyClass<Integer, String, Double> object = new MyClass<>(19,"Sergey", 86.6);

        System.out.println("T: " + object.getT());
        System.out.println("V: " + object.getV());
        System.out.println("K: " + object.getK());

//        System.out.println(object.toString());

        object.print();
    }
}
