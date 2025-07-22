import java.util.*;

public class prime {

    public static void isPrime(int lowerbound, int upperbound) {
        int count = 0;
            for (int j = lowerbound; j <= upperbound; j++) {
                for (int i = 2; i <= upperbound; i++) {
                    if (j % i != 0) {
                        count++;
                    }
                }
        }
           System.out.println(count);
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter upperlimit:");
      int upperlimit=sc.nextInt();
      System.out.print("Enter lowerlimit:");
      int lowerlimit=sc.nextInt();
      isPrime(lowerlimit,upperlimit);
    }
}