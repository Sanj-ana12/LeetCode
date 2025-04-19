public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to track the number of elements not equal to val
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, we put it at position k
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;  // Increment k to move the pointer for next valid element
            }
        }
        
        // k now contains the number of elements that are not equal to val
        return k;
    }
}
