public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // Shift result left by 1 to make room for the new bit
            result <<= 1;
            
            // Extract the least significant bit from n and add it to result
            result |= (n & 1);
            
            // Shift n right by 1 to process the next bit
            n >>= 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.reverseBits(43261596));  // Output: 964176192
        System.out.println(solution.reverseBits((int) 4294967293L)); // Output: 3221225471
    }
}
