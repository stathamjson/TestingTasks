import java.util.Scanner;

public class _111 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int A = scanner.nextInt();
         int B = scanner.nextInt();
         int C = scanner.nextInt();
         int D = scanner.nextInt();

         System.out.println(costMobilePlan(A,B,C,D));


     }

     static int costMobilePlan(int a, int b, int c, int d) {
          if (d>b) {
               return (d-b)*c+a;
          }
               return a;

     }

}
