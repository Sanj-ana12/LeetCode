public class Solution {
    public int romanToInt(String s) {
        // Create a map to store Roman numeral values
        java.util.Map<Character, Integer> romanValues = new java.util.HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int total = 0;
        
        // Iterate through the string, checking for subtraction cases
        for (int i = 0; i < s.length(); i++) {
            int current = romanValues.get(s.charAt(i));  // Get the value of the current character
            if (i + 1 < s.length()) {
                int next = romanValues.get(s.charAt(i + 1)); // Get the value of the next character
                if (current < next) {
                    total -= current;  // Subtract if current < next
                } else {
                    total += current;  // Add if current >= next
                }
            } else {
                total += current;  // Last character, just add it
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.romanToInt("III"));     // Output: 3
        System.out.println(solution.romanToInt("LVIII"));   // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV")); // Output: 1994
    }
}
