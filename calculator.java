import java.util.*;

public class calculator {
    public static void main(String[] args) {
        
       int a,b;
       int ch;
       int add, sub, mul, div, mod;
       Scanner sc = new Scanner(System.in);
       System.out.print("1. Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n");
       System.out.print("\nEnter your choice in this(1, 2, 3, 4, 5): ");
       ch = sc.nextInt();
       System.out.print("Enter first number: ");
       a = sc.nextInt();
       System.out.print("Enter second number: ");
       b = sc.nextInt();

       switch(ch){
        case 1:
         add = a + b;
          System.out.println("Sum of numbers: " + add);
          break;
        
        case 2:
         sub = a - b;
         System.out.println("Subtraction of numbers: " + sub);
         break;

         case 3:
         mul = a * b;
         System.out.println("Multiplication of numbers: " + mul);
         break;

         case 4:
         div = a / b;
         System.out.println("Division of numbers: " + div);
         break;

         case 5:
         mod = a % b;
         System.out.println("Modulus of numbers: " + mod);
         break;

         default:
           System.out.println("Invalid choice!");
       }
    }
}
