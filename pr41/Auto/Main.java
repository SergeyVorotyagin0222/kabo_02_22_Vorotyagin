package mirea.pr41.Auto;

public class Main {
    public static void main(String[] args)
    {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Povozka povozka = new Povozka();

        //Car!
        //pasajur
        car.setPTime(25.5);
        car.setPPrice(250);
        car.setPWeight(1050);

        //gryzovui
        car.setWTime(34.2);
        car.setWPrice(300);
        car.setWWeight(5000);
        //\Car!

        //Bicycle!
        //pasajur
        bicycle.setPTime(75.5);
        bicycle.setPPrice(25);
        bicycle.setPWeight(10);

        //gryzovui
        bicycle.setWTime(94.2);
        bicycle.setWPrice(30);
        bicycle.setWWeight(25);
        //\Bicycle!

        //Povozka!
        //pasajur
        povozka.setPTime(45.5);
        povozka.setPPrice(250);
        povozka.setPWeight(100);

        //gryzovui
        povozka.setWTime(54.2);
        povozka.setWPrice(390);
        povozka.setWWeight(207);
        //\Povozka!


        System.out.println("Car: ");
        System.out.println("Pasajur time: " + car.getPTime());
        System.out.println("Pasajur price: " + car.getPPrice());
        System.out.println("Pasajur weight: " + car.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + car.getWTime());
        System.out.println("Gryz price: " + car.getWPrice());
        System.out.println("Gryz weight: " + car.getWWeight());

        System.out.println();
        System.out.println("Bicycle: ");
        System.out.println("Pasajur time: " + bicycle.getPTime());
        System.out.println("Pasajur price: " + bicycle.getPPrice());
        System.out.println("Pasajur weight: " + bicycle.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + bicycle.getWTime());
        System.out.println("Gryz price: " + bicycle.getWPrice());
        System.out.println("Gryz weight: " + bicycle.getWWeight());

        System.out.println();
        System.out.println("Povozka: ");
        System.out.println("Pasajur time: " + povozka.getPTime());
        System.out.println("Pasajur price: " + povozka.getPPrice());
        System.out.println("Pasajur weight: " + povozka.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + povozka.getWTime());
        System.out.println("Gryz price: " + povozka.getWPrice());
        System.out.println("Gryz weight: " + povozka.getWWeight());
    }

}