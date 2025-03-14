public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(3.5f, 5.5f);
        System.out.println("Point: " + p1);


        MoveablePoint mp1 = new MoveablePoint(2.5f, 3.5f, 1.0f, 1.0f);
        System.out.println("Before move: " + mp1);


        mp1.move();
        System.out.println("After move: " + mp1);
    }
}