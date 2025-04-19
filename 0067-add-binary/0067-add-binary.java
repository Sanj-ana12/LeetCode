public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To store the binary sum
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0; // Initialize carry as 0
        
        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry from the previous addition
            
            // Add the current digit of string a, if available
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int (0 or 1)
                i--; // Move the pointer to the left
            }
            
            // Add the current digit of string b, if available
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int (0 or 1)
                j--; // Move the pointer to the left
            }
            
            // Determine the result digit (sum mod 2) and the carry (sum / 2)
            result.append(sum % 2); // Append the result digit (0 or 1)
            carry = sum / 2; // Update carry (0 or 1)
        }
        
        // Since we added digits from right to left, we need to reverse the result
        return result.reverse().toString();
    }
}
