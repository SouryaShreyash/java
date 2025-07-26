package binarysearch;
import java.util.*;
public class floor {
   public static int ceiling(int[] arr, int target) {
    int si = 0;
    int ei = arr.length - 1;
    while (si < ei) {
       int mid=si+(ei-si)/2;
        if(arr[mid]<target){
          si=mid+1;
        }
        else if(arr[mid]>target){
          ei=mid-1;
        }
        else{
          return mid;
        }
    }
    return ei;
  }

  public static void main(String[] args) {
      int arr[]={2,3,5,9,14,16,18};
      int ans=ceiling(arr,15);
      System.out.println(ans);
  }
}

