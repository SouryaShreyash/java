import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class linearsearch {
  public static boolean linearSearch(int[] arr,int target,int index){
    if(index==arr.length-1){
      return false;
    }
    return arr[index]==target || linearSearch(arr,target,index+1);
  }
  public static int linearSearch2(int[] arr,int target,int index){
    if(index==arr.length-1){
      return -1;
    }
      if(arr[index]==target){
        return index;
      }
      return linearSearch2(arr, target, index+1);
  }
  static ArrayList<Integer> list=new ArrayList<>();
  public static List<Integer> findAllIndex(int[] arr,int target,int index){
    if(index==arr.length-1){
      return list;
    }
      if(arr[index]==target){
        list.add(index);
      }
      return findAllIndex(arr, target, index+1);
  }
  public static List<Integer> findAllIndex2(int[] arr,int target,int index,ArrayList<Integer> list){
    if(index==arr.length){
      return list;
    }
      if(arr[index]==target){
        list.add(index);
      }
      return findAllIndex2(arr, target, index+1,list);
  }
public static ArrayList<Integer> findAllIndex3(int[] arr,int target,int index){
    ArrayList<Integer> list=new ArrayList<>();
    if(index==arr.length){
      return list;
    }
      if(arr[index]==target){
        list.add(index);
      }
      ArrayList<Integer> ansFromBelow=findAllIndex3(arr, target, index+1);
      list.addAll(ansFromBelow);
      return list;
  }
  public static void main(String[] args) {
    int[] arr={1,2,3,4,3,5};
   List<Integer> ans=findAllIndex3(arr, 3, 0);
   System.out.println(ans);
  }
}
