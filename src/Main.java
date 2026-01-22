import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit;
        int celcius;

        System.out.println("Please enter a temperature in Fahrenheit:");
        fahrenheit  = scanner.nextInt();
        int celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println(fahrenheit + " Fahrenheit is "  + celsius + " Celsius.");



    }
}