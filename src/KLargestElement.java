import java.util.Arrays;

/**
 * * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * You must solve it in O(n) time complexity.
 */
public class KLargestElement {
  public int findKthLargest(int[] nums, int k) {
    int count = 0;
    Arrays.sort(nums);
    return nums[nums.length-k];
  }
}
