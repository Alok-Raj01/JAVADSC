import java.util.*;

public class Main {
	
	public static int findFactor(int usrnum){
		int ans = 1;
	for(int i = 1; i <= usrnum;i++){
		ans = ans * i;
	}
	return ans;
	}
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Eneter you number: ");
	  int userinput = sc.nextInt();
	  int factor = findFactor(userinput);
	  System.out.print("your answer is :"+factor);
	}
      }
