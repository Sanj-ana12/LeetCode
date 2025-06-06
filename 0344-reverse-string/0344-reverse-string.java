public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        // Swap characters while left < right
        while (left < right) {
            // Swap the characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println(s1);  // Output: ["o", "l", "l", "e", "h"]
        
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println(s2);  // Output: ["h", "a", "n", "n", "a", "H"]
    }
}
