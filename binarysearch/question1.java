package binarysearch;

import java.util.*;

//ceiling of a number in a sorted array
public class question1 {
  public static int ceiling(int[] arr, int target) {
    int si = 0;
    int ei = arr.length - 1;
    if(target>arr[ei]){
      return -1;
    }
    while (si < ei) {
      int mid = si + (ei - si) / 2;
      if (mid < target) {
        si = mid + 1;
      } else if (mid > target) {
        ei = mid - 1;
      } else {
        return mid;
      }
    }
    return si;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
    int ans = ceiling(arr, 19);
    System.out.println(ans);
  }
}
