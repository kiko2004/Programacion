import java.util.Scanner;
    public class numeros{
        public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("dime un numero");
        numero1 = lector.nextInt();
        System.out.println("dime un numero");
        numero2 = lector.nextInt();
        
        if (numero1 > numero2)
        System.out.println("el primer numero es mayor que el segundo");
        else if (numero1 < numero2)
        System.out.println("el segundo numero es mayor que el primero");
        else
        System.out.println("el primer numero es igual que el segundo");

        lector.close();
        }
    }