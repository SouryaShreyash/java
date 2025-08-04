package sort;

import java.util.Arrays;
//find the fisrt and last index of an element in an sorted array
public class firstandlast {
  public static int[] searchRange(int[] nums, int target) {
    int ans[] = new int[2];
    ans[0] = search(nums, target, true);
    if (ans[0] != -1) {
      ans[1] = search(nums, target, false);
    }
    return ans;
  }

  public static int search(int[] nums, int target, boolean findstartindex) {
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] < target) {
        start=mid+1;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        // potential ans found
        ans = mid;
        if (findstartindex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] result = searchRange(nums, target);
    System.out.println("First occurrence of " + target + " is at index " + Arrays.toString(result));
  }
}
