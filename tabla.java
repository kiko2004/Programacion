import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nota;

        System.out.println("Introduce tu nota");
        nota = lector.nextInt();

        if (nota < 5)
        System.out.println("Suspenso");
        else if (nota >= 5 && nota <= 6)
        System.out.println("Suficiente");
        else if (nota >= 6 && nota <= 7)
        System.out.println("Notable");
        else if (nota >= 7 && nota <= 9)
        System.out.println("Notable");
        else if (nota >= 9 && nota <= 10)
        System.out.println("Sobresaliente");
        else if (nota > 10)
        System.out.println("error");
    }
}