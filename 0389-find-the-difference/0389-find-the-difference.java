public class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        // XOR all characters in both strings
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.findTheDifference("abcd", "abcde")); // Output: e
        System.out.println(solution.findTheDifference("", "y")); // Output: y
    }
}
