public class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and n has only one 1-bit in its binary representation
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.isPowerOfTwo(1));   // Output: true
        System.out.println(solution.isPowerOfTwo(16));  // Output: true
        System.out.println(solution.isPowerOfTwo(3));   // Output: false
    }
}
