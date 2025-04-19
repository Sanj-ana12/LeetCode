import java.util.*;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            
            // The first and last elements of each row are 1
            currentRow.add(1);
            
            // Each row is built based on the previous row
            for (int j = 1; j < row; j++) {
                // Each element (except the first and last) is the sum of the two elements above it
                int val = triangle.get(row - 1).get(j - 1) + triangle.get(row - 1).get(j);
                currentRow.add(val);
            }
            
            // The last element of each row is 1
            if (row > 0) {
                currentRow.add(1);
            }
            
            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle;
    }

    // Helper method to print the triangle (for testing purposes)
    public void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;
        List<List<Integer>> triangle = solution.generate(numRows);
        
        // Print the Pascal's triangle
        solution.printTriangle(triangle);
    }
}
