

import java.util.*;

//ceiling of a number in a sorted array
public class ceiling {
  public static int ceiling(int[] arr, int target) {
    int si = 0;
    int ei = arr.length - 1;
    if (target > arr[ei]) {
      return -1;
    }
    while (si <= ei) {
      int mid = si + (ei - si) / 2;
      if (arr[mid] < target) {
        si = mid + 1;
      } else if (arr[mid] > target) {
        ei = mid - 1;
      } else {
        return mid;
      }
    }
    return si;
  }

  public char nextGreatestLetter(char[] letters, char target) {
    int si = 0;
    int ei = letters.length - 1;

    while (si <= ei) {
      int mid = si + (ei - si) / 2;
      if (letters[mid] <= target) {
        si = mid + 1;
      } else {
        ei = mid - 1;
      }

    }
    return letters[si % letters.length];
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
    int ans = ceiling(arr, 16);
    System.out.println(ans);
  }
}
