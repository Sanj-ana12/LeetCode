import java.util.HashSet;
import java.util.Set;

public class Solution {
    // Helper function to compute the sum of the squares of the digits of a number
    public int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            sum += digit * digit;  // Add the square of the digit to the sum
            n /= 10;  // Remove the last digit
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        
        while (n != 1) {
            if (seenNumbers.contains(n)) {
                return false;  // We have entered a cycle
            }
            seenNumbers.add(n);
            n = getSumOfSquares(n);  // Replace n with the sum of the squares of its digits
        }
        
        return true;  // We reached 1, it's a happy number
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.isHappy(19));  // Output: true
        System.out.println(solution.isHappy(2));   // Output: false
    }
}
