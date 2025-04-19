public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR all the elements in the array
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        
        return result;  // The remaining number is the one that appears only once
    }
}
