public class Solution {
    public int addDigits(int num) {
        // If num is 0, the result is 0
        if (num == 0) {
            return 0;
        }
        
        // Return num % 9 if it's not 0, otherwise return 9
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.addDigits(38)); // Output: 2
        System.out.println(solution.addDigits(0));  // Output: 0
        System.out.println(solution.addDigits(123)); // Output: 6
    }
}
