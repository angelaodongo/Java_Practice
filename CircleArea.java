import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args)
    {
        double pi = Math.PI;
        double radius = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        area = pi * radius *radius;
        
        System.out.printf("The area is: %.2f%n", area);

        scanner.close();
    }
}
