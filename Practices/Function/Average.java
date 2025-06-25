import java.util.*;

public class Main {
	public static int average(int u1, int u2,int u3){
		int sum = u1 + u2 + u3;
		int avg = sum/3;
		return avg;
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	   int u1 = sc.nextInt();
	   int u2 = sc.nextInt();
	   int u3 = sc.nextInt();
	   
	   int avg = average(u1,u2,u3);
	   System.out.print("Your average is : "+ avg);
	}
}
