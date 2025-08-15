package recursion;

public class noofsteps {
  public static int numberOfSteps(int num) {
      return helper(num,0);
    }
  public static int helper(int num,int count) {
        if(num==0){
             return count;
        }
         else if(num%2==0){
            return helper(num/2,count+1);
        }
           return helper(num-1,count+1);
    }
    public static void main(String[] args) {
      int n=14;
      int ans=numberOfSteps(n);
      System.out.println(ans);
    }
}
