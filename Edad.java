import java.util.Scanner;

public class Edad{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int edad;
      
            System.out.println("dime tu edad");
            edad = lector.nextInt();
            if (edad >= 18)
            System.out.println("eres mayor de edad");
            else 
            System.out.println("eres menor de edad");


    }
    
}