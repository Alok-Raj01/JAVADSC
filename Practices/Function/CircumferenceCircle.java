import java.util.*;
class Main {
    public static double cir(double r){
        return r*2*3.14;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double rad = sc.nextDouble();
      
      System.out.println("ans : "+cir(rad));
    }
}
