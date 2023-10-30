package mirea.pr7.Task23;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint( -2, -1);
        MovablePoint point2 = new MovablePoint( 1, 1);

        MovableRectangle rect = new MovableRectangle(point1,point2);

        System.out.println(rect);
        System.out.println("\nПроведем два действия: 1) Переместим вниз 2) Переместим вправо");

        rect.moveDown();
        rect.moveRight();

        System.out.println(rect);

        System.out.println("Point1 speed test: " + point1.speedTest(point2));
    }
}
