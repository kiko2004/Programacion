import java.util.Scanner;

public class dinero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce una cantidad en euros: ");
                double euros = scanner.nextDouble();
                double cambioDolar = 1.06;
                double cambioLibra = 0.87;
                double dolares = euros * cambioDolar;
                double libras = euros * cambioLibra;
            System.out.println("Valor en dolares: " + dolares);
            System.out.println("Valor en libras: " + libras);
    }
}
