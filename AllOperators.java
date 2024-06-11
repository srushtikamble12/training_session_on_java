package srushti;
import java.util.Scanner;
public class AllOperators {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Arithmetic Operators:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        
        System.out.println("\nRelational Operators:");
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));

        
        System.out.println("\nLogical Operators:");
        System.out.println((num1 > num2) + " && " + (num1 < 100) + " = " + ((num1 > num2) && (num1 < 100)));
        System.out.println((num1 > num2) + " || " + (num1 < 100) + " = " + ((num1 > num2) || (num1 < 100)));
        System.out.println("!(" + (num1 > num2) + ") = " + !(num1 > num2));

   
        System.out.println("\nUnary Operators:");
        System.out.println("++num1 = " + (++num1));
        System.out.println("--num2 = " + (--num2));
        System.out.println("num1++ = " + (num1++));
        System.out.println("num1 after num1++ = " + num1);
        System.out.println("num2-- = " + (num2--));
        System.out.println("num2 after num2-- = " + num2);

        sc.close();
    }


	}


