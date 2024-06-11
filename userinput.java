package srushti;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligibal for vating");
		}else {
			System.out.println("Not Eligibal for vating");
		}
		
		
		
	}

}
