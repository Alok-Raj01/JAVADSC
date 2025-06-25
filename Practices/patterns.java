

public class Main {
	public static void main(String[] args) {
		// solid rectangle
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		// hollow rectangle
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i > 0 && i < 4 && j > 0 && j < 5) {
					System.out .print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// half perimide
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println("------------------------------");
		// inverted  half perimide
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
            // counting series 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
           
           // inverse counying series
		System.out.println("------------------------------");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		  // skip counying swries
		System.out.println("------------------------------");
		int n = 1;
		for (int i = 1 ; i <= 5 ; i ++){
			for(int j = 1; j <= i; j++){
				System.out.print(n+ " ");
				n++;
			}
			System.out.println();
		}
		
		
		// 01 series
		System.out.println("------------------------------");
		for(int i = 0; i <= 5;i++){
			for(int j = 0 ; j <= i;j++){
				if(i%2 != 0){
					if(j%2 != 0){
						System.out.print("1");
					}else if(j%2 == 0){
						System.out.print("0");
					}
				}else if(i%2 == 0){
					if(j%2 != 0){
						System.out.print("0");
					}else if(j%2 == 0){
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}
	}
}