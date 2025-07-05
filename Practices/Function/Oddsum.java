import java.util.*;

public class Main {
	public static int oddsum(int input){
		int n = 0;
		for(int i = 0;i <= input;i++){
			if(i%2 != 0){
				n = n+i;
			}else{
				n = n+0;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ui = sc.nextInt();
		
		oddsum(ui);
		int ans = oddsum(ui);
		System.out.print(ans);
	}
}
