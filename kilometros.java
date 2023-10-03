import java.util.Scanner;

public class kilometros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double combustible1;
        double pagado1;
        double cuentaquilometros1;
        double combustible2;
        double pagado2;
        double cuentaquilometros2;
        double cienKm;
        double totKm;

        // Primer repostaje
            System.out.println("Precio del litro del combustible 1:");
            combustible1 = Double.parseDouble(lector.nextLine());
            System.out.println("Total pagado al llenar el depósito 1:");
            pagado1 = Double.parseDouble(lector.nextLine());
            System.out.println("Que kilometros marcaba despues del primer repostaje:");
            cuentaquilometros1 = Double.parseDouble(lector.nextLine());

        // Segundo repostaje
            System.out.println("Precio del litro del combustible 2:");
            combustible2 = Double.parseDouble(lector.nextLine());
            System.out.println("Total pagado al llenar el depósito 2:");
            pagado2 = Double.parseDouble(lector.nextLine());
            System.out.println("Cuantos kilometros marcaba despues del segundo repostaje:");
            cuentaquilometros2 = Double.parseDouble(lector.nextLine());

        // Cálculo
            cienKm = (pagado1 + pagado2) / (combustible1 + combustible2);
            totKm = (cienKm * 100) / (cuentaquilometros1 + cuentaquilometros2);

            System.out.println("El total de Km son " + cienKm + " y el coste por Km es " + totKm);
    }
}