import java.util.*;

public class Main {
	
	// funaction :1 Print  name 
	public static void yourName(String name){
		System.out.println("Your name is "+ name);
		return;
	}
	
	// funaction- 2 : sum of two numbers 
	public static int sum(int num1 , int num2){
		int sum = num1+ num2;
		return sum;
	}
	
	// funaction - 3 : product of two number
	public static int prod(int num1,int num2){
		int pro = num1 * num2;
		return pro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// name function 
		System.out.print("Enter ur name : ");
		String name = sc.next();
		yourName("your name is :"+name);
		
		// sum funaction 
		System.out.print("Enter ur num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter ur num2 : ");
		int num2 = sc.nextInt();
		int ans = sum(num1,num2);
		int prodo = prod(num1,num2);
		System.out.println("your sum is : "+ ans);
		System.out.print("your product is : "+ prodo);
	}
}