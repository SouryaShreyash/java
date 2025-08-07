package binarysearch;

import java.util.*;

public class peakindex {
  public static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < arr[mid + 1]) {
        start = mid;
      } 
      else if(arr[mid-1]>arr[mid]){
        end=mid;
      }
      else{
        return mid;
      }
      }
    return -1;
  }
  

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 6, 4 };
    int ans = peakIndexInMountainArray(arr);
    System.out.println(ans);
  }

}
