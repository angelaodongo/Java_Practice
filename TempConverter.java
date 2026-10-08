import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args)
    {
        double celsius = 0;
        double fahrenheit = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the temperature in celsius? ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Temperature in Fahrenheit is: %.2f" , fahrenheit);

        
        scanner.close();
    }
}
