package srushti;
import java.util.Scanner;
public class UnaryOperators {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        
        System.out.println("Unary plus and minus:");
        System.out.println("+" + num + " = " + (+num));
        System.out.println("-" + num + " = " + (-num));

     
        System.out.println("\nPre-increment:");
        System.out.println("++" + num + " = " + (++num));

       
        System.out.println("\nPre-decrement:");
        System.out.println("--" + num + " = " + (--num));

       
        System.out.println("\nPost-increment:");
        System.out.println(num + "++ = " + (num++));
        System.out.println("Value after post-increment: " + num);

      
        System.out.println("\nPost-decrement:");
        System.out.println(num + "-- = " + (num--));
        System.out.println("Value after post-decrement: " + num);

       
        System.out.print("\nEnter a boolean value (true/false): ");
        boolean bool = scanner.nextBoolean();
        System.out.println("Logical NOT:");
        System.out.println("!" + bool + " = " + (!bool));

        
        scanner.close();
    }


	}


