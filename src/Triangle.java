/**
 * Created by williambech on 2/7/17.
 */
public class Triangle {

    public Triangle(int a, int b, int c) {

        if ((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a)) {
            if (a == b && b == c) {
                System.out.println("That is an equilateral triangle");
            }

            else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.println("That is an isosceles triangle");
            }

            else if (a != b && b != c && a != c) {
                System.out.println("That is an scalene triangle");
            }

        } else {
            System.out.println("Those measurements don't form a triangle");
        }
        System.out.println("------------------------------");
    }
}
