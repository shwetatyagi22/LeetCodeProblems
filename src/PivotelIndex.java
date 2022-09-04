/**
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 */

class PivotelIndex {
  public int pivotIndex(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (isValidSum(i, nums)) {
        return i;
      }
    }
    return -1;

  }

  public boolean isValidSum(int k, int[] nums) {
    int lSum = 0;
    int rSum = 0;
    for (int i = 0; i < k; i++) {
      lSum = lSum + nums[i];
    }
    for (int i = k + 1; i < nums.length; i++) {
      rSum = rSum + nums[i];
    }
    return lSum == rSum;
  }
}
    