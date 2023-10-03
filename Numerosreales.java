import java.util.Scanner;
    public class Numerosreales{
        public static void main(String[] args){
            
            Scanner lector = new Scanner(System.in);
            int num1;
            int num2;
            System.out.println("dime el primer numero");
            num1 = lector.nextInt();
            System.out.println("dime el segundo numero");
            num2 = lector.nextInt();
            if (num1 > num2)
            System.out.println(num2 + "es mas alto que" + num1);
            else 
            System.out.println(num1 + "es mas alto que" + num2);


        }
    }