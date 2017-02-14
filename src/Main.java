import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Please enter 3 digits");
        System.out.println("---------------------------------");
        while (true) {
            try {
                System.out.print("Input: ");
                Scanner sc = new Scanner(System.in);
                float s1 = sc.nextFloat();
                float s2 = sc.nextFloat();
                float s3 = sc.nextFloat();

                new Triangle(s1, s2, s3);

            } catch (Exception e) {
                System.out.println("Please enter digits");
            }
        }
    }
}
