import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce temperatura en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsius * 9 / 5 + 32;
                double kelvin = 273.15 + celsius;
            System.out.println("Temperatura en Kelvin: " + kelvin + "K");
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit + "F");
    }
}