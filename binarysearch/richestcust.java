package binarysearch;

//Richest customer wealth
// //Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
public class richestcust {
  public static int maximumwealth(int[][] accounts){
      int ans=Integer.MIN_VALUE;
      for(int[] ints:accounts){
        int sum=0;
        for(int elements:ints){
          sum+=elements;
        }
        if(sum>ans){
          ans=sum;
        }
      }
      return ans;
  }
  public static void main(String[] args) {
    int [][] accounts = new int[][]{{1,2,3},{3,2,1}};
    int ans=maximumwealth(accounts);
    System.out.println(ans);
  }
}
