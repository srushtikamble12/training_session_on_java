package srushti;

public class fundemo {

	public static void main(String[] args) {
		System.out.println("hello");
		fundemo obj=new fundemo();
		
		add();
		obj.sub();
		obj.div();
	}
	public static void add() {
		int a=1;
		int b=2;
		int total=a+b;
		System.out.println("add"+total);
    }
	public static void sub() {
		int a=1;
		int b=2;
		int total=a-b;
		System.out.println("sub"+total);
    }
	public static void div() {
		int a=1;
		int b=2;
		int total=a/b;
		System.out.println("div"+total);
		return total;
    }

}