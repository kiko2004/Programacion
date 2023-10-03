import java.util.Scanner;

public class condicionales2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double numero;

        System.out.println("Dime un número:");
        numero = lector.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}