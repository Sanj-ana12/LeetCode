public class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit of the array
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add 1 to the current digit
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, we can return the result immediately
            }
            digits[i] = 0; // If the digit is 9, set it to 0 and carry the 1
        }

        // If we finished the loop and all digits were 9, we need to add a 1 at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
