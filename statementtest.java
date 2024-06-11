package srushti;
import java.util.Scanner;

public class statementtest {

	public static void main(String[] args) {
		String answer;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("curiosity is the starting point for great adventure");
		System.out.println("Enter the quantity ");
        int quntity = sc.nextInt();
        System.out.println("Enter the price ");
        int price = sc.nextInt();
        double total=quntity*price;
        System.out.println("total is"+ total );
        System.out.println("do you want to perform again ");
        
        answer=sc.next();
	    }while(answer.equals("yes"));

}
}
