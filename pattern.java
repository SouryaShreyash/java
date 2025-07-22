import java.util.*;

public class pattern {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows:");
    int r = sc.nextInt();
    /*
     * System.out.print("Enter the no. of coloums:");
     * int c=sc.nextInt();
     * for(int i=1;i<=r;i++){
     * for(int j=1;j<=c;j++){
     * if(i==1 || j==1 || i==r || j==c){
     * System.out.print("*");
     * }
     * else{
     * System.out.print(" ");
     * }
     * }
     * System.out.print("\n");
     * }
     */
    // *****
    // * *
    // * *
    // * *
    // *****

    // pattern 2
    // *
    // **
    // ***
    // ****
    /*
     * for(int i=1;i<=r;i++){
     * for(int j=1;j<=i;j++){
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     */

    // Pattern 3
    // ****
    // ***
    // **
    // *
    /*
     * for(int i=1;i<=r;i++){
     * for(int j=r;j>=i;j--){
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     */

    // Pattern 4
    // *
    // **
    // ***
    // ****
    
      for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r-i; j++) {
      System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
      System.out.print("*");
      }
      System.out.println();
      }
     

    // pattern 5
    // 1
    // 12
    // 123
    // 1234
    // 12345

    /*
     * for (int i = 1; i <= r; i++) {
     * for (int j = 1; j <= i; j++) {
     * System.out.print(j);
     * }
     * System.out.println();
     * }
     */

    // pattern 6
    // 12345
    // 1234
    // 123
    // 12
    // 1

    /*
     * for (int i = 1; i <= r; i++) {
     * for (int j = 1; j <= r - i + 1; j++) {
     * System.out.print(j);
     * }
     * System.out.println();
     * }
     */

    // pattern 7
    // 1
    // 23
    // 456
    // 78910

    /*
     * int number = 1;
     * for (int i = 1; i <= r; i++) {
     * for (int j = 1; j <= i; j++) {
     * System.out.print(number + " ");
     * number++;
     * }
     * System.out.println();
     * }
     */

    // pattern 8
    // 1
    // 01
    // 101
    // 0101
    // 10101

    /*int i, j;
    for (i = 1; i <= r; i++) {
      for (j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }*/
  }
}
