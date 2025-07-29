import java.util.*;

public class twosum {
  public static int[] twoSum(int[] nums, int target)  {
      Map <Integer,Integer> numMap=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int temp=target-nums[i];
        if(numMap.containsKey(temp)){
            return new int[] {numMap.get(temp),i};
        }
        numMap.put(nums[i],i);
    }
     return new int[] {-1,-1} ;
  }
    public static void main(String[] args) {
      int nums[]={2,7,11,15};
      int[] a=twoSum(nums, 9);
      System.out.println(Arrays.toString(a));
    }
  }
