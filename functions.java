import java.util.*;

public class functions {
  public static void printFactorial(int n) {

    int factorial = 1;
    if (n == 0) {
      factorial = 1;
      System.out.println(factorial);
    } else if (n < 0) {
      System.out.println("no factorial");
    } else {
      for (int i = n; i >= 1; i--) {
        factorial = factorial * i;
      }
      System.out.println(factorial);
    }
  }

  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printFactorial(n);
  }
}
