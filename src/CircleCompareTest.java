import java.util.Comparator;

public class CircleCompareTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.5);
        circles[2] = new Circle("blue",true, 3.1);

        System.out.println("Pre- sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparation();

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
