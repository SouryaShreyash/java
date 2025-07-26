package binarysearch;

public class question0 {
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
