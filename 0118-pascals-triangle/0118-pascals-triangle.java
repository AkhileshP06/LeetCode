import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 1);
            List<Integer> row = new ArrayList<>();

            // The first element in each row is always 1
            row.add(1);

            // Each triangle element (except the first and last of each row) is equal to the sum of the elements
            // above-and-to-the-left and above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element in each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        // Test cases
        Solution solution = new Solution();
        
        // Example 1: Input: numRows = 5, Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        List<List<Integer>> result1 = solution.generate(5);
        System.out.println("Pascal's Triangle with numRows = 5:");
        printTriangle(result1);

        // Example 2: Input: numRows = 1, Output: [[1]]
        List<List<Integer>> result2 = solution.generate(1);
        System.out.println("Pascal's Triangle with numRows = 1:");
        printTriangle(result2);
    }

    // Helper method to print Pascal's Triangle
    private static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
