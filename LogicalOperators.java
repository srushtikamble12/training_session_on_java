package srushti;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first boolean value (true/false): ");
        boolean bool1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean bool2 = scanner.nextBoolean();

       
        System.out.println("\nLogical AND (&&):");
        System.out.println(bool1 + " && " + bool2 + " = " + (bool1 && bool2));

        
        System.out.println("\nLogical OR (||):");
        System.out.println(bool1 + " || " + bool2 + " = " + (bool1 || bool2));

       
        System.out.println("\nLogical NOT (!):");
        System.out.println("!" + bool1 + " = " + (!bool1));
        System.out.println("!" + bool2 + " = " + (!bool2));

        
        System.out.println("\nCombined Logical Expressions:");
        System.out.println("(" + bool1 + " && " + bool2 + ") || !" + bool1 + " = " + ((bool1 && bool2) || !bool1));
        System.out.println("!(" + bool1 + " || " + bool2 + ") && " + bool2 + " = " + (!(bool1 || bool2) && bool2));

        scanner.close();
       }
}


